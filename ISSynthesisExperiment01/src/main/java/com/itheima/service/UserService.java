package com.itheima.service;

import com.github.pagehelper.PageInfo;
import com.itheima.domain.Article;
import com.itheima.domain.Category;
import com.itheima.domain.User;
import com.itheima.utils.PageRequest;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserService {
    //添加用户
    public void addUser(User user);
    //通过Email值返回对应的用户信息
    public User findByEmail(String email);
    //根据userID值返回对应的用户信息
    public User findByUserID(Integer userID);
    //根据typeID值返回同类用户的信息
    public List<User> findByTypeID(Integer typeID);
    //返回user表的所有信息
    public List<User> getAll();
    public PageInfo<User> getAllUsersByPage(int pageNum, int pageSize);
    //统计某类用户有多少人
    public int getNumberByType(Integer typeID);
    //返回user表中最大的userID
    public int getMaxId();
    //根据userID修改对应用户信息
    public void modifyUser(User user);
    //根据userID修改密码
    public String modifyPwd(Integer userID,String password);
    //根据userID删除用户信息
    public void deleteUser(Integer userID);

    PageInfo<Article> findByAuthor(String searchWord, PageRequest page);
    PageInfo<Article> findByCategory(String searchWord, PageRequest page);
    PageInfo<Article>findByKeyWord(String searchWord, PageRequest page);
    PageInfo<Article> findByTitle(String searchWord, PageRequest page);

    User findByID(String userID);
    int updateUser(User user);
    int insertUser(User user);
    User findByPhoneAndPassword(User user);
    User findByEmailAndPassword(User user);
    List<Article> findArticleByKey(String searchWord);
    PageInfo<Article> findAllArticlesOrderByUpdateTime(int pageNum, int pageSize);
    Article findArticleById(int articleId );
    int updateArticleById(Article article);
    int saveArticle(Article article);
    int findCategoryIdByName(String categoryName);
    List<Category> findAllCategory();
}
