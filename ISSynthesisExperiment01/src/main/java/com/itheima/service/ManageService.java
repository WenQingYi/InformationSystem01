package com.itheima.service;

import com.github.pagehelper.PageInfo;
import com.itheima.domain.Manager;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ManageService{
    public Manager findByAccount(String account, String password);
    public int updateByAccount(String account,String password);
    public List<Manager> getAll();
    //根据账户密码寻找管理员是否存在
    public PageInfo<Manager> findAll(int pageNum, int pageSize);
}
