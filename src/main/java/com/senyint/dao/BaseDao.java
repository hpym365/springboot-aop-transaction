package com.senyint.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * @Title Base dao
 * @Version 1.0
 * @Date 20170603 20:31:52
 * @Author hpym365 @gmail.com
 * @Description
 */
public class BaseDao {

    @Autowired
    public SqlSession sqlSession;
}
