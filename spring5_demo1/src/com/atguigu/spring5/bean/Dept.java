package com.atguigu.spring5.bean;

/**
 @author：ZhouYao
 @create：2021-11-23 11:17
 */

// 部门类
public class Dept {
    private String dname;

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
