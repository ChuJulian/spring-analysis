package com.mashibing;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-${username}.xml");
    }
}
