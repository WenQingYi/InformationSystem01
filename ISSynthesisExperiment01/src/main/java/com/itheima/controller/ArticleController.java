package com.itheima.controller;

import com.itheima.domain.Article;
import com.itheima.domain.User;
import com.itheima.service.ArticleService;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Controller
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;
    @RequestMapping("/findArticleState3")
    public String findArticleState3(Model model){
        List<Article> articleList = articleService.findArticleState3();
        model.addAttribute("articleList",articleList);
        System.out.println(articleList);
        return "getArticle";
    }
}
