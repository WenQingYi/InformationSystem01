package com.itheima.service.impl;

import com.itheima.dao.ArticleDao;
import com.itheima.domain.Article;
import com.itheima.service.ExpertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpertServiceImpl implements ExpertService {
    @Autowired
    ArticleDao articleDao;
   //查询所有未审核的文章
    @Override
    public List<Article> findState1(int categoryId) {
        return articleDao.findState1(categoryId);
    }
     //更新文章（审核文章，是否通过审核）
    @Override
    public int updateArticleState(int articleID,  int state) {
        return articleDao.updateArticleState(articleID,state);
    }
}
