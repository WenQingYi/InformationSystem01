package com.itheima.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itheima.dao.ArticleDao;
import com.itheima.dao.UserDao;
import com.itheima.domain.Article;
import com.itheima.domain.Category;
import com.itheima.domain.User;
import com.itheima.service.UserService;
import com.itheima.utils.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service("userService")
public class UserServiceImpl implements UserService{
     @Autowired
     UserDao userDao;

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }
    @Override
    public User findByEmail(String email){
        return userDao.findByEmail(email);
    }
    @Override
    public User findByUserID(Integer userID){
        return userDao.findByUserID(userID);
    };
    //根据typeID值返回同类用户的信息
    @Override
    public List<User> findByTypeID(Integer typeID){
        return userDao.findByTypeID(typeID);
    };
    //返回user表的所有信息
    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }

    public PageInfo<User> getAllUsersByPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<User> users = userDao.getAll(); // 假设你有一个selectAll()方法在用户映射器中
        return new PageInfo<>(users);
    }
    //统计某类用户有多少人
    @Override
    public int getNumberByType(Integer typeID){
        return userDao.getNumberByType(typeID);
    };
    //获取user表中有多少条数据
    @Override
    public int getMaxId(){
        return userDao.getMaxId();
    };
    //根据userID修改对应用户信息
    @Override
    public void modifyUser(User user){
        userDao.modifyUser(user);
    };
    //根据userID修改密码
    @Override
    public String modifyPwd(Integer userID,String password){
        return userDao.modifyPwd(userID,password);
    };
    //根据userID删除用户信息
    @Override
    public void deleteUser(Integer userID){
        userDao.deleteUser(userID);
    };

    @Autowired
    ArticleDao articleDao;

    /**
     * 分页实现按作者查找
     * @param searchWord
     * @return
     */
    @Override
    public PageInfo<Article> findByAuthor(String searchWord, PageRequest page) {
        // 设置分页参数
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        // 执行查询并返回结果列表
        List<Article> articles = articleDao.findByAuthor(searchWord);
        return new PageInfo<>(articles);
    }
    /**
     * 分页实现按类别查找
     * @param searchWord
     * @return
     */
    @Override
    public PageInfo<Article> findByCategory(String searchWord, PageRequest page) {
        // 设置分页参数
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        // 执行查询并返回结果列表
        List<Article> articles = articleDao.findByCategory(searchWord);
        return new PageInfo<>(articles);
    }
    /**
     * 分页实现按关键字查找
     * @param searchWord
     * @return
     */
    @Override
    public PageInfo<Article> findByKeyWord(String searchWord, PageRequest page) {
        // 设置分页参数
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        // 执行查询并返回结果列表
        List<Article> articles = articleDao.findByKeyWord(searchWord);
        return new PageInfo<>(articles);
    }
    /**
     * 分页实现按作者查找
     * @param searchWord
     * @return
     */
    @Override
    public PageInfo<Article> findByTitle(String searchWord, PageRequest page) {
        // 设置分页参数
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        // 执行查询并返回结果列表
        List<Article> articles = articleDao.findByTitle(searchWord);
        return new PageInfo<>(articles);
    }

    /**
     * 根据ID寻找用户
     * @param userID
     * @return
     */
    @Override
    public User findByID(String userID) {
        return userDao.findByID(userID);
    }

    /**
     * 更新用户信息
     * @param user
     * @return
     */
    @Override
    public int updateUser(User user) {
        return userDao.updateUser(user);
    }

    /**
     * 插入用户
     * @param user
     * @return
     */
    @Override
    public int insertUser(User user) {
        return userDao.insertUser(user);
    }

    /**
     * 根据手机号密码登录
     * @param user
     * @return
     */
    @Override
    public User findByPhoneAndPassword(User user) {
        return userDao.findByPhoneAndPassword(user.getPhone(),user.getPassword());
    }

    /**
     * 邮箱密码登录
     * @param user
     * @return
     */
    @Override
    public User findByEmailAndPassword(User user) {
        return userDao.findByEmailAndPassword(user.getEmail(),user.getPassword());
    }


    /**
     * 按搜索词查询文章
     * @param searchWords
     * @return
     */
    @Override
    public List<Article> findArticleByKey(String searchWords) {

        // 拆分搜索词
        String[] keywords = searchWords.split("\\|\\|");

        List<Article> result = new ArrayList<>();
        Set<Integer> articleIds = new HashSet<>(); // 用于记录已经存在的文章ID

        // 对每个搜索词进行单独的模糊搜索
        for (String keyword : keywords) {
            List<Article> articles = articleDao.findArticles(keyword.trim());
            for (Article article : articles) {
                // 如果文章ID已经存在，则跳过
                if (!articleIds.contains(article.getArticleID())) {
                    result.add(article);
                    articleIds.add(article.getArticleID());
                }
            }
        }
        return result;
    }

    /**
     * 查询所有文章，按更新时间排序
     * @param pageNum
     * @param pageSize
     * @return
     */
    @Override
    public PageInfo<Article> findAllArticlesOrderByUpdateTime(int pageNum, int pageSize) {
        // 设置分页参数
        PageHelper.startPage(pageNum, pageSize);
        // 执行查询并返回结果列表
        List<Article> articles = articleDao.findAllArticlesOrderByUpdateTime();
        return new PageInfo<>(articles);
    }

    /**
     * 根据id查询文章
     * @param articleId
     * @return
     */
    @Override
    public Article findArticleById(int articleId) {
        return articleDao.findArticleById(articleId);
    }

    /**
     * 更新文章
     * @param article
     * @return
     */
    @Override
    public int updateArticleById(Article article) {
        return articleDao.updateArticle(article);
    }

    /**
     * 首次存储文章
     * @param article
     * @return
     */
    @Override
    public int saveArticle(Article article) {
        return articleDao.saveArticle(article);
    }

    /**
     * 通过类别名查询类别id
     * @param categoryName
     * @return
     */
    @Override
    public int findCategoryIdByName(String categoryName) {
        return articleDao.findCategoryIdByName(categoryName);
    }

    /**
     * 查询所有类别
     * @return
     */
    @Override
    public List<Category> findAllCategory() {
        return articleDao.findAllCategory();
    }
}
