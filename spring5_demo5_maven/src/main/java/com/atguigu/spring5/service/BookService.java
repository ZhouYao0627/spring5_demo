package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.BookDao;
import com.atguigu.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 @author：ZhouYao
 @create：2021-11-26 15:55
 */

@Service
public class BookService {

    // 注入dao
    @Autowired
    private BookDao bookDao;

    // 添加的方法
    public void addBook(Book book) {
        bookDao.add(book);
    }

    // 修改的方法
    public void updateBook(Book book) {
        bookDao.updateBook(book);
    }

    // 删除的方法
    public void deleteBook(String id) {
        bookDao.delete(id);
    }

    // 查询表中记录数
    public int findCount() {
        return bookDao.selectCount();
    }

    // 查询返回对象
    public Book findOne(String id) {
        return bookDao.findBookinfo(id);
    }

    // 查询返回集合
    public List<Book> findAll() {
        return bookDao.findALlBook();
    }

    // 批量添加
    public void batchadd(List<Object[]> batchArgs) {
        bookDao.batchAddBook(batchArgs);
    }

    // 批量修改
    public void batchupdate(List<Object[]> batchArgs) {
        bookDao.batchupdateBook(batchArgs);
    }

}






















