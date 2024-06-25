package com.itheima.service.impl;

import com.itheima.dao.ArticleDao;
import com.itheima.domain.Article;
import com.itheima.domain.User;
import com.itheima.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    ArticleDao articleDao;
    //mindex
    public void addArticle(Article article){articleDao.addArticle(article);};
    @Override
    public List<Article> getAll() {
        return articleDao.getAll();
    }
    @Override
    public void deleteArticleByarticleID(Integer articleID){articleDao.deleteArticleByarticleID(articleID);}
    //根据userID修改对应用户信息
    @Override
    public Article findArticleByArticleID(Integer articleID){return articleDao.findArticleByArticleID(articleID);}
    @Override
    public void modifyArticleByArticleID(Article article){
        articleDao.modifyArticleByArticleID(article);
    }
    @Override
    public List<Article> findArticleByUserID(int userID){
        return articleDao.findArticleByUserID(userID);
    }
    @Override
    public List<Article> findArticleByEAP(String email,String password){
        return articleDao.findArticleByEAP(email,password);
    }
    @Override
    public void updatecategoryIDByArticleID(Article article){articleDao.updatecategoryIDByArticleID(article);}
    //expert_login
    @Override
    public List<Article> findArticleState1(String email, String password){return articleDao.findArticleState1(email,password);}
    @Override
    public void updateStateByArticleID(Article article){articleDao.updateStateByArticleID(article);}
    public List<Article> findArticleState3(){return articleDao.findArticleState3();}
}
