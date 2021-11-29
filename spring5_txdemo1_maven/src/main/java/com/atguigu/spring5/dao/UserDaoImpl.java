package com.atguigu.spring5.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 @author：ZhouYao
 @create：2021-11-27 15:24
 */

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // lucy转账100给Mary
    // lucy少了100
    @Override
    public void reduceMoney() {
        // 首先需要将Lucy的money减100
        String sql = "update t_account set money=money-? where username=?";

        int update = jdbcTemplate.update(sql, 100, "lucy");
        System.out.println("修改了" + update + "行");
    }

    // Mary多了100
    @Override
    public void addMoney() {
        String sql = "update t_account set money=money+? where username=?";
        int update = jdbcTemplate.update(sql, 100, "mary");
        System.out.println("修改了" + update + "行");
    }

}




















