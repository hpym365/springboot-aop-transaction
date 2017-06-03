package com.senyint.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.sql.DataSource;


/**
 * @Title Transcation aop
 * @Version 1.0
 * @Date 20170603 20:31:59
 * @Author hpym365 @gmail.com
 * @Description
 */
@Aspect
@Configuration
public class TranscationAop {

    /**
     * @param dataSource the data source
     * @return the platform transaction manager
     * @Version 1.0
     * @Date 20170603 20:31:59
     * @Author hpym365 @gmail.com
     * @Description Tx  manager platform transaction manager.
     */
    @Bean
    public PlatformTransactionManager txManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Autowired
    PlatformTransactionManager transactionManager ;


    /**
     * @Version 1.0
     * @Date 20170603 20:31:59
     * @Author hpym365 @gmail.com
     * @Description Service.
     */
    @Pointcut("execution(* com.senyint.service..*.*(..))")
    public void service(){}

    /**
     * @param pjp the pjp
     * @return the object
     * @Version 1.0
     * @Date 20170603 20:31:59
     * @Author hpym365 @gmail.com
     * @Description Tran  object.
     */
    @Around("service()")
    public Object tran(ProceedingJoinPoint pjp){

        TransactionStatus transaction1 = transactionManager.getTransaction(new DefaultTransactionDefinition());
        System.out.println("拦截器执行了！！！！！！");
        try {
            pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("事务回滚！！！！！！");
            transactionManager.rollback(transaction1);
            return null;
        }
        transactionManager.commit(transaction1);
        System.out.println("事务提交！！！！！！");
        return null;
    }
}
