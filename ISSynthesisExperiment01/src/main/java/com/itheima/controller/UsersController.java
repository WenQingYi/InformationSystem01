package com.itheima.controller;

import com.github.pagehelper.PageInfo;
import com.itheima.domain.Article;
import com.itheima.domain.Category;
import com.itheima.domain.User;
import com.itheima.service.UserService;
import com.itheima.utils.ApiResponse;
import com.itheima.utils.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UserService userService;

    @RequestMapping("/exitlogin")
    public void exitLogin(HttpServletResponse response, HttpServletRequest request) throws IOException {
        HttpSession session = request.getSession(false); // 获取现有会话，如果没有则返回null
        if (session != null) {
            Object user = session.getAttribute("user");
            System.out.println("User before removal: " + user);

            if (user != null) {
                session.removeAttribute("user");
                session.invalidate(); // 完全使会话无效化

                // 检查会话是否已失效。会话失效后，无法再获取会话中的任何属性。
                try {
                    Object user1 = session.getAttribute("user");
                    System.out.println("User after removal (should be null): " + user1);
                } catch (IllegalStateException e) {
                    System.out.println("Session has been invalidated.");
                }
            }
        }
        response.sendRedirect("/page/index.html"); // 重定向到首页
    }

    //用户登录判定 使用request获取请求体中的参数
    @RequestMapping("/login")
    public void loginUserJudge(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
        String loginAccount = request.getParameter("demo-loginAccount");
        String password = request.getParameter("demo-psw");

        User user = new User();
        User isNone;
        user.setPassword(password);

        if(loginAccount.contains("@")){
            user.setEmail(loginAccount);
            isNone = userService.findByEmailAndPassword(user);
        }else{
            user.setPhone(loginAccount);
            isNone = userService.findByPhoneAndPassword(user);
        }

        if(isNone==null){
            request.getSession().setAttribute("error","Account ont found");
            response.sendRedirect("/page/Login.html");
            return;
        }

        HttpSession session = request.getSession();
        session.setAttribute("user",isNone);
        response.sendRedirect("/page/index.html");
    }

    //根据关键词对文章进行模糊搜索
    @RequestMapping("/findArticle")
    public ApiResponse<PageInfo> findArticle(@RequestParam("key") String key,
                                             @RequestParam("searchWord") String searchWord,
                                             @RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
                                             @RequestParam(value = "pageSize", defaultValue = "10") int pageSize) {
        PageInfo<Article> pageInfo = null;
        PageRequest page=new PageRequest(pageNum,pageSize);
        switch (key) {
            case "title":
                pageInfo = userService.findByTitle(searchWord,page);
                break;
            case "author":
                pageInfo = userService.findByAuthor(searchWord,page);
                break;
            case "category":
                pageInfo = userService.findByCategory(searchWord,page);
                break;
            case "keywords":
                pageInfo = userService.findByKeyWord(searchWord,page);
                break;
            default:
                return new ApiResponse<>(false, "Invalid search key", null);
        }

        return new ApiResponse<>(true, "Success", pageInfo);
    }

    //获取所有类别
    @RequestMapping("/findAllCategory")
    public ApiResponse<List<Category>> findArticle() {
        List<Category> list = userService.findAllCategory();
        return new ApiResponse<>(true, "Success", list);
    }
}
