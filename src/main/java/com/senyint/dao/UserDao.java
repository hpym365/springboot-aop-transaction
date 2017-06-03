package com.senyint.dao;

import org.springframework.stereotype.Component;

import java.util.Map;


/**
 * @Title Token dao
 * @Version 1.0
 * @Date 20170603 20:31:44
 * @Author hpym365 @gmail.com
 * @Description
 */
@Component
public class UserDao extends BaseDao {

    /**
     * @param param the param
     * @return the map
     * @Version 1.0
     * @Date 20170603 20:31:44
     * @Author hpym365 @gmail.com
     * @Description Select  by id map.
     */
    public Map selectUserById(Map param) {
        return this.sqlSession.selectOne("selectUserById", param);
    }

    /**
     * @param param the param
     * @Version 1.0
     * @Date 20170603 20:31:44
     * @Author hpym365 @gmail.com
     * @Description Insert.
     */
    public void insertUser(Map param){
        this.sqlSession.insert("insertUser",param);
    }
}
