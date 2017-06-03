package com.senyint.service;

import com.senyint.dao.HospitalDao;
import com.senyint.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * @author hpym365@gmail.com
 * @Description
 * @Date 17-6-3 上午12:52
 */
@Service
public class TestService {

    @Autowired
    HospitalDao hdao;

    @Autowired
    UserDao udao;


    public void right() {
        System.out.println("service right 执行了！！！");
        Map map = new HashMap();
        map.put("name", LocalDateTime.now().toString());
        map.put("age", 55);
        hdao.insertHospital(map);
        udao.insertUser(map);

    }

    public void wrong() {
        System.out.println("service wrong 执行了！！！");
        Map map = new HashMap();
        map.put("name", LocalDateTime.now().toString());
        map.put("age", 55);
        hdao.insertHospital(map);
        udao.insertUser(map);
        hdao.fail();
    }
}
