package com.atguigu.spring5.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 @author：ZhouYao
 @create：2021-11-26 15:08
 */

@Component
@Aspect
@Order(1)
public class PersonProxy {

    @Before(value = "execution(* com.atguigu.spring5.aopanno.User.add(..))")
    public void before(){
        System.out.println("Person Before...");
    }

}
