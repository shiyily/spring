package com.zc.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstSpringTest {
    @Test
    public void testFirstSpring() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Object userBean = applicationContext.getBean("userBean");
        System.out.println(userBean);
    }

}
