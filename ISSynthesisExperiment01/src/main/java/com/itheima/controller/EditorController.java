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
@RequestMapping("/editor")
public class EditorController {
    @Autowired
    private ArticleService articleService;
    @RequestMapping("/getArticleAll")
    public String getArticleAll(Model model){
        List<Article> articleList = articleService.getAll();
        model.addAttribute("articleList",articleList);
        System.out.println(articleList);
        return "eindex";
    }
    @RequestMapping("/findArticleByArticleID")
    public String findArticleByArticleID(Model model,Integer articleID) {
        Article article = articleService.findArticleByArticleID(articleID);
        model.addAttribute("article",article);
        System.out.println(article);
        return "editor_update";
    }
    @RequestMapping("/updatecategoryIDByArticleID")
    public void updatecategoryIDByArticleID(Article article , HttpServletRequest request, HttpServletResponse response) throws IOException {
        articleService.updatecategoryIDByArticleID(article);
        response.sendRedirect(request.getContextPath()+"/editor/getArticleAll");
    }
}
