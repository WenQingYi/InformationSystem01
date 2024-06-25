package com.itheima.service;

import com.itheima.domain.Article;
import com.itheima.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ArticleService {
    public void addArticle(Article article);
    public List<Article> getAll();
    public void deleteArticleByarticleID(Integer articleID);
    //根据userID值返回对应的用户信息
    public Article findArticleByArticleID(Integer article);
    //根据userID修改对应用户信息
    public void modifyArticleByArticleID(Article article);
    //根据文章作者来查看文章信息
    public List<Article> findArticleByUserID(int userID);
    public List<Article> findArticleByEAP(String email,String password);
    //eindex
    public void updatecategoryIDByArticleID(Article article);
    //expert_index
    public List<Article> findArticleState1(String email, String password);
    public void updateStateByArticleID(Article article);
    public List<Article> findArticleState3();

}
