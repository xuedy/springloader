package com.example.demo.demofour;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author Administrator
 * @className EnableDefineMain
 * @description TODO
 * @date {DATE}{TIME}
 */
@SpringBootApplication
@EnableDefineService(exclude = {LoggerService.class})
public class EnableDefineMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext ca= SpringApplication.run(EnableDefineMain.class,args);
        String[] names=ca.getBeanDefinitionNames();
        for (String s:names) {
            System.out.println(s);
        }
    }
}
