package com.atguigu.spring5.service;

import com.alibaba.druid.sql.visitor.functions.Right;
import com.atguigu.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 @author：ZhouYao
 @create：2021-11-23 20:36
 */

// 在注解里面value属性值可以省略不写
// 是因为默认值是类名称，首字母小写
//@Service(value = "userService")  // <bean id="userService" class="">
@Service
public class UserService {

    @Value(value = "abc")
    private String name;


    // 定义到类型属性
    // 不需要添加set方法
    // 添加注入属性注解
//    @Autowired // 根据类型进行注入
//    @Qualifier(value = "userDaoImpl1")  // 根据名称进行注入-->使用这个是因为UserDao可能有多个实现类，所以需要Qualifier来指定具体的实现类
//    private UserDao userDao;


    //    @Resource // 根据类型进行注入
    @Resource(name = "userDaoImpl1")
    private UserDao userDao;


    public void add() {
        System.out.println("service add..." + name);
        userDao.add();
    }


}





















