package com.atguigu.spring5.dao;

import com.atguigu.spring5.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 @author：ZhouYao
 @create：2021-11-26 15:55
 */

@Service
public interface BookDao {

    // 添加的方法
    void add(Book book);

    // 修改的方法
    void updateBook(Book book);

    // 删除的方法
    void delete(String id);

    // 查询表中记录数
    int selectCount();

    // 查询返回对象
    Book findBookinfo(String id);

    // 查询返回集合
    List<Book> findALlBook();

    // 批量添加
    void batchAddBook(List<Object[]> batchArgs);

    // 批量修改
    void batchupdateBook(List<Object[]> batchArgs);
}
