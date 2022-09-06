package com.semih;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Runner {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring.xml");
        IPrinter printer = beanFactory.getBean("printer", IPrinter.class);
        printer.print();

    }
}
