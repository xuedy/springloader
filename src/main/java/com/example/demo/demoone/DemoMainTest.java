package com.example.demo.demoone;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Administrator
 * @className DemoMainTest
 * @description TODO
 * @date {DATE}{TIME}
 */
public class DemoMainTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(DemoConfiguration.class);
        DemoClass demoClass= (DemoClass) annotationConfigApplicationContext.getBean(DemoClass.class);
        System.out.println(demoClass);
    }
}
