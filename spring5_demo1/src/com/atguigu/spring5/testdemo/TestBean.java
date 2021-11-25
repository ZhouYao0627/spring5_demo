package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.service.UserService;
import com.atguigu.spring5.bean.Emp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 @author：ZhouYao
 @create：2021-11-22 20:47
 */
public class TestBean {

    @Test
    public void testAdd(){

        // 1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        // 2.获取配置创建的对象
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

    @Test
    public void testBean2(){

        // 1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");

        // 2.获取配置创建的对象
        Emp emp = context.getBean("emp", Emp.class);
        emp.add();
    }




}










