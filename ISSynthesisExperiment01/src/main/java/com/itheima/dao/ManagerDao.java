package com.itheima.dao;

import com.itheima.domain.Manager;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
@Mapper
public interface ManagerDao {
     //查询所有管理员
    @Select("select * from manager")
    public List<Manager> findAll();
   //修改管理员密码
    @Update("UPDATE manager SET password = #{password} WHERE account = #{account}")
    public int updateByAccount(@Param("account") String account, @Param("password") String password);

     //根据账户密码寻找管理员是否存在
    @Select("select * from manager where account = #{account} and password = #{password}")
    public Manager findByAccount(@Param("account") String account,@Param("password") String password);

}
