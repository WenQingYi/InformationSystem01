package com.itheima.controller;

import com.itheima.domain.Article;
import com.itheima.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/expert")
public class ExpertController {
   @Autowired
   ArticleService articleService;
    @RequestMapping("/getArticleAll")
    public String getArticleAll(Model model){
        List<Article> articleList = articleService.getAll();
        model.addAttribute("articleList",articleList);
        System.out.println(articleList);
        return "expert_index";
    }
    @RequestMapping("/findArticleState1")
    public String findArticleState1(Model model, String email, String password){
        List<Article> articleList = articleService.findArticleState1(email,password);
        model.addAttribute("articleList",articleList);
        System.out.println(articleList);
        return "expert_index";
    }
    @RequestMapping("/findArticleByArticleID")
    public String findArticleByArticleID(Model model,Integer articleID) {
        Article article = articleService.findArticleByArticleID(articleID);
        model.addAttribute("article",article);
        System.out.println(article);
        return "expert_update";
    }
    @RequestMapping("/updateStateByArticleID")
    public void updateStateByArticleID(Article article , HttpServletRequest request, HttpServletResponse response) throws IOException {
        articleService.updateStateByArticleID(article);
        response.sendRedirect(request.getContextPath()+"/expert/getArticleAll");
    }
}
