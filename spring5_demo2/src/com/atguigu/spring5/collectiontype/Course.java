package com.atguigu.spring5.collectiontype;

/**
 @author：ZhouYao
 @create：2021-11-23 13:48
 */
public class Course {

    private String cname;

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                '}';
    }
}
