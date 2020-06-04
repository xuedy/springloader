package com.example.demo.demnthree;

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
        DemoClassOther demoClass= (DemoClassOther) annotationConfigApplicationContext.getBean(DemoClassOther.class);
        System.out.println(demoClass);
    }
}
