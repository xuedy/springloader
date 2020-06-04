package com.example.demo.demoone;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Administrator
 * @className DemoConfiguration
 * @description TODO
 * @date {DATE}{TIME}
 */
@Configuration
public class DemoConfiguration {
    //单利，每次通过容器获取，返回同一个
    @Bean
    public DemoClass getDemo(){
        return new DemoClass();
    }
}
