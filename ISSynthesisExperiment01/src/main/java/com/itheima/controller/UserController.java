package com.itheima.controller;

import com.github.pagehelper.PageInfo;
import com.itheima.domain.Article;
import com.itheima.domain.User;
import com.itheima.service.ArticleService;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private ArticleService articleService;
    @RequestMapping("/getAll")
    public String getAll(Model model1, Model model2){
        List<User> userList = userService.getAll();
        model1.addAttribute("userList",userList);
        System.out.println(userList);
        List<Article> articleList = articleService.getAll();
        model2.addAttribute("articleList",articleList);
        System.out.println(articleList);
        return "mindex";
    }

    //mindex插入数据
    @RequestMapping("/addUser")
    public void addUser(User user , HttpServletRequest request, HttpServletResponse response) throws IOException {
        userService.addUser(user);
        response.sendRedirect(request.getContextPath()+"/user/getAll");
        return;
    }
    @RequestMapping("/addArticle")
    public void addArticle(Article article , HttpServletRequest request, HttpServletResponse response) throws IOException {
        articleService.addArticle(article);
        response.sendRedirect(request.getContextPath()+"/user/getAll");
        return;
    }
    //mindex修改
    @RequestMapping("/modifyUser")
    public void modifyUser(User user , HttpServletRequest request, HttpServletResponse response) throws IOException {
        userService.modifyUser(user);
        response.sendRedirect(request.getContextPath()+"/user/getAll");
    }
    @RequestMapping("/modifyArticleByArticleID")
    public void modifyArticleByArticleID(Article article , HttpServletRequest request, HttpServletResponse response) throws IOException {
        articleService.modifyArticleByArticleID(article);
        response.sendRedirect(request.getContextPath()+"/user/getAll");
    }
    //mindex删除
    @RequestMapping("/deleteUserByUserID")
    public void deleteUserByUserID(Integer userID, HttpServletRequest request, HttpServletResponse response) throws IOException {
        userService.deleteUser( userID );
        response.sendRedirect(request.getContextPath()+"/user/getAll");
    }

    @RequestMapping("/deleteArticleByArticleID")
    public void deleteArticleByArticleID(Integer articleID, HttpServletRequest request, HttpServletResponse response) throws IOException {
        articleService.deleteArticleByarticleID( articleID );
        response.sendRedirect(request.getContextPath()+"/user/getAll");
    }
    //mindex定位
    @RequestMapping("/findByUserID")
    public String findByUserID(Model model,Integer userID) {
        User user = userService.findByUserID(userID);
        model.addAttribute("user",user);
        System.out.println(user);
        return "user_update";
    }
    @RequestMapping("/findArticleByArticleID")
    public String findArticleByArticleID(Model model,Integer articleID) {
        Article article = articleService.findArticleByArticleID(articleID);
        model.addAttribute("article",article);
        System.out.println(article);
        return "article_update";
    }
    @RequestMapping("logout")
    public String logout(){
        return "redirect:/index.jsp";
    }
    @RequestMapping("pageEnroll")
    public String pageEnroll(){
        return "enroll_index";
    }

    @RequestMapping("/insertUser")
    public void insertUser(User user , HttpServletRequest request, HttpServletResponse response) throws IOException {
        userService.addUser(user);
        response.sendRedirect(request.getContextPath()+"/user/pageEnroll");
        return;
    }
    //uindex
    @RequestMapping("/findArticleByUserID")
    public String findArticleByUserID(Model model,Integer userID){
        List<Article> articleList = articleService.findArticleByUserID(userID);
        model.addAttribute("articleList",articleList);
        System.out.println(articleList);
        return "uindex";
    }
    @RequestMapping("/getArticleAll")
    public String getArticleAll(Model model){
        List<Article> articleList = articleService.getAll();
        model.addAttribute("articleList",articleList);
        System.out.println(articleList);
        return "uindex";
    }
}
