package com.example.demo.demnthree.now;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Administrator
 * @className DemoMainTest
 * @description TODO
 * @date {DATE}{TIME}
 */

public class DemoMainTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(BeanConfiguration.class);
     String [] defNames=annotationConfigApplicationContext.getBeanDefinitionNames();
        for (String  str:defNames) {
            System.out.println(str);
        }

    }
}
