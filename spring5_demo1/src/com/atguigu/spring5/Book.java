package com.atguigu.spring5;

/**
 @author：ZhouYao
 @create：2021-11-22 19:42
 */

/**
 * 使用set构造注入
 */
public class Book {

    // 创建属性
    private String bname;
    private String bauthor;
    private String address;

    // 创建属性对应的方法
    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void testDemo() {
        System.out.println(bname + "::" + bauthor + "::" + address);
    }


}
