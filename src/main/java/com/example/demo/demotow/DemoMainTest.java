package com.example.demo.demotow;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Administrator
 * @className DemoMainTest
 * @description TODO
 * @date {DATE}{TIME}
 */
@ComponentScan
public class DemoMainTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(DemoMainTest.class);
        DemoClass demoClass= (DemoClass) annotationConfigApplicationContext.getBean(DemoClass.class);
        System.out.println(demoClass);
    }
}
