package com.atguigu.spring5.collectiontype;

import java.util.List;

/**
 @author：ZhouYao
 @create：2021-11-23 14:45
 */
public class Book {

    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void test() {
        System.out.println("Book{" +
                "list=" + list +
                '}');
    }
}
