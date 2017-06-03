package com.senyint;

import com.senyint.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootAopTransactionApplicationTests {

    @Autowired
    TestService serv;

    @Test
    public void right() {
        serv.right();
    }

    @Test
    public void wrong() {
        serv.wrong();
    }

}
