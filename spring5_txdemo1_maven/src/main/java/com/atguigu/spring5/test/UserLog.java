package com.atguigu.spring5.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 @author：ZhouYao
 @create：2021-11-28 18:11
 */
public class UserLog {

    private static final Logger log = LoggerFactory.getLogger(UserLog.class);

    public static void main(String[] args) {
        log.info("hello log4j2");
        log.warn("hello log4j2");
    }

}
