package com.atguigu.spring5.autowire;

/**
 @author：ZhouYao
 @create：2021-11-23 19:25
 */
public class Emp {

    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }

    public void test(){
        System.out.println(dept);
    }

}
