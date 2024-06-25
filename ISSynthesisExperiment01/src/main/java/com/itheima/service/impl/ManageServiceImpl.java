package com.itheima.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itheima.dao.ManagerDao;
import com.itheima.domain.Manager;
import com.itheima.domain.User;
import com.itheima.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ManageServiceImpl implements ManageService {
    @Autowired
    ManagerDao managerDao;
    @Override
    public List<Manager> getAll() {
        return managerDao.findAll();
    }
    //根据account查找
    @Override
    public Manager findByAccount(String account, String password) {
        return managerDao.findByAccount(account, password);

    }

    //更新密码
    @Override
    public int updateByAccount(String account, String password) {
        return managerDao.updateByAccount(account,password);
    }

    //分页获取所有管理员
    @Override
    public PageInfo<Manager> findAll(int pageNum, int pageSize) {
        // 设置分页参数
        PageHelper.startPage(pageNum, pageSize);
        // 执行查询并返回结果列表
        List<Manager> list = managerDao.findAll();
        return new PageInfo<>(list);
    }
}
