package com.senyint.dao;

import org.springframework.stereotype.Component;

import java.util.Map;


/**
 * @Title Hospital dao
 * @Version 1.0
 * @Date 20170603 20:31:18
 * @Author hpym365 @gmail.com
 * @Description
 */
@Component
public class HospitalDao extends BaseDao {


    /**
     * @param param the param
     * @return the map
     * @Version 1.0
     * @Date 20170603 20:31:18
     * @Author hpym365 @gmail.com
     * @Description Select  hospital map.
     */
    public Map selectHospital(Map param) {
        return this.sqlSession.selectOne("selectHospital", param);
    }

    /**
     * @param param the param
     * @Version 1.0
     * @Date 20170603 20:31:19
     * @Author hpym365 @gmail.com
     * @Description Insert  hospital.
     */
    public void insertHospital(Map param) {
        this.sqlSession.insert("insertHospital", param);
    }

    /**
     * @Version 1.0
     * @Date 20170603 20:31:19
     * @Author hpym365 @gmail.com
     * @Description Fail.
     */
    public void fail() {
        this.sqlSession.insert("aa");
    }
}
