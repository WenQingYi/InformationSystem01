package com.itheima.dao;

import com.itheima.domain.UserType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserTypeDao {
    //通过用户类型编号typeID返回用户类型名称typeName
    @Select("select typeName from usertype where typeID=#{typeID}")
    public String getNameByID(int typeID);
    //通过用户类型名称typeName返回用户类型编号typeID
    @Select("select typeID from usertype where typeName=#{typeName}")
    public int getIDByName(String typeName);
    //返回usertype用户类型表中所有数据
    @Select("select * from usertype")
    public List<UserType> getAll();
}
