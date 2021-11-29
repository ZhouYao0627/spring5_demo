package com.atguigu.spring5.test;

import com.atguigu.spring5.entity.Book;
import com.atguigu.spring5.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 @author：ZhouYao
 @create：2021-11-27 10:39
 */
public class TestBook {

    @Test
    public void testJdbcTemplate() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        // 添加的操作
//        Book book = new Book();
//        book.setUserId("1");
//        book.setUsername("java");
//        book.setUstatus("a");
//        bookService.addBook(book);

        // 添加的操作
//        Book book = new Book();
//        book.setUserId("1");
//        book.setUsername("javaup");
//        book.setUstatus("b");
//        bookService.updateBook(book);

        // 删除的操作
//        bookService.deleteBook("1");

        // 查询返回某个值
//        int count = bookService.findCount();
//        System.out.println("一共有" + count + "条数据");

        // 查询返回对象
//        Book book = bookService.findOne("1");
//        System.out.println(book);

        // 查询返回集合
//        List<Book> bookList = bookService.findAll();
//        System.out.println(bookList);

        //批量添加测试
//        List<Object[]> batchArgs = new ArrayList<>();
//        Object[] o1 = {"3", "java", "a"};
//        Object[] o2 = {"4", "c++", "b"};
//        Object[] o3 = {"5", "MySQL", "c"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        //调用批量添加
//        bookService.batchadd(batchArgs);

        //批量修改
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"java0909", "a3", "3"};
        Object[] o2 = {"c++1010", "b4", "4"};
        Object[] o3 = {"MySQL1111", "c5", "5"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        //调用方法实现批量修改
        bookService.batchupdate(batchArgs);

    }


}














