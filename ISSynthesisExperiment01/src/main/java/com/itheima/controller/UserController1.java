package com.itheima.controller;

import com.itheima.domain.Article;
import com.itheima.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@Controller
@RequestMapping("/user1")
public class UserController1 {
    @Autowired
    ArticleService articleService;
    @RequestMapping("/getArticleAll")
    public String getArticleAll(Model model){
        List<Article> articleList = articleService.getAll();
        model.addAttribute("articleList",articleList);
        System.out.println(articleList);
        return "uindex";
    }
    @RequestMapping("/addArticle")
    public void addArticle(Article article , HttpServletRequest request, HttpServletResponse response) throws IOException {
        articleService.addArticle(article);
        response.sendRedirect(request.getContextPath()+"/user1/getArticleAll");
    }
    @RequestMapping("/findArticleByEAP")
    public String findArticleByEAP(Model model,String email,String password){
        List<Article> articleList = articleService.findArticleByEAP(email,password);
        model.addAttribute("articleList",articleList);
        System.out.println(articleList);
        return "uindex";
    }
}
