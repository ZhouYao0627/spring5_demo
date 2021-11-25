package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.UserDao;

/**
 @author：ZhouYao
 @create：2021-11-22 20:30
 */
public class UserService {
    // 创建UserDao类型的属性，生成set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        System.out.println("service add");

        // 原始方式：创建UserDao对象
//        UserDao userDao = new UserDaoImpl();
//        userDao.update();

        userDao.update();
    }




}