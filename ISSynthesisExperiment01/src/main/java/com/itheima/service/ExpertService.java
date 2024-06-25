package com.itheima.service;

import com.itheima.domain.Article;

import java.util.List;

public interface ExpertService {
    List<Article> findState1(int categoryId);
    int updateArticleState(int articleID,  int state);
}
