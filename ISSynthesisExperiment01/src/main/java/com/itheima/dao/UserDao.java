package com.itheima.dao;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserDao {
    //添加用户
    @Insert("insert into user(nickName, password, age, gender, realName, cardID, debitCard, email, phone, creatDate, typeID,categoryID) values\n" +
            "            ( #{nickName}, #{password}, #{age}, #{gender}, #{realName}, #{cardID}, #{debitCard}, #{email}, #{phone}, #{creatDate}, #{typeID}, #{categoryID})")
    public void addUser(User user);
    //通过Email值返回对应的用户信息
    @Select("select * from user where email=#{email}")
    public User findByEmail(String email);
    //根据userID值返回对应的用户信息
    @Select("select * from user where userID=#{userID}")
    public User findByUserID(Integer userID);
    //根据typeID值返回同类用户的信息
    @Select("select * from user where typeID=#{typeID}")
    public List<User> findByTypeID(Integer typeID);
    //返回user表的所有信息
    @Select("select * from user")
    public List<User> getAll();

    //统计某类用户有多少人
    @Select("select count(*) from user where typeID=#{typeID}")
    public int getNumberByType(Integer typeID);
    //统计user表中有多少条数据
    @Select(" select max(userID) from user")
    public int getMaxId();
    //根据userID修改对应用户信息
    @Update("update user set nickName=#{nickName}, password=#{password}, age=#{age}, gender=#{gender}, realName=#{realName}, cardID=#{cardID}, debitCard=#{debitCard}, email=#{email}, phone=#{phone}, typeID = #{typeID}\n" +
          "where userID=#{userID}")
    public void modifyUser(User user);
    //根据userID修改密码
    @Update("update user set password=#{password}\n" +
            "where userID=#{userID}")
    public String modifyPwd(Integer userID,String password);
    //根据userID删除用户信息
    @Delete("delete from user where userID=#{userID}")
    public int deleteUser(Integer userID);

    @Select("select * from user where phone = #{phone}")
    public User findUserByPhone(@Param("phone")String phone);

    @Select("select * from user where email = #{email}")
    public User findUserByEmail(@Param("email")String email);

    /**
     * 根据手机与密码查找user（手机号登录）
     * @param Phone
     * @param password
     * @return
     */
    @Select("select * from user where phone = #{phone} and password = #{password}")
    public User findByPhoneAndPassword(@Param("phone")String Phone,@Param("password")String password);

    /**
     * 根据邮箱与密码查找user（邮箱登录）
     * @param email
     * @param password
     * @return
     */
    @Select("select * from user where email = #{email} and password = #{password}")
    public User findByEmailAndPassword(@Param("email")String email,@Param("password")String password);

    /**
     * 新建用户
     * @param user
     * @return
     */
    @Insert("INSERT INTO user (nickName, password, email, phone,typeID,creatDate) VALUES (#{nickName}, #{password}, #{email}, #{phone},#{typeID},NOW())")
    int insertUser(User user);

    /**
     * 根据userID更改用户信息
     * @param user
     * @return
     */
    @Update("UPDATE user SET password = #{password}, nickName = #{nickName}, age = #{age}, gender = #{gender}, realName = #{realName}, " +
            "cardID = #{cardID}, debitCard = #{debitCard}, email = #{email}, phone = #{phone}, typeID = #{typeID} " +
            "WHERE userID = #{userID}")
    int updateUser(User user);

    @Select("select * from user where userID = #{userID}")
    public User findByID(@Param("userID")String userID);

}
