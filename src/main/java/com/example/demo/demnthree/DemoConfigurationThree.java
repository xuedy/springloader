package com.example.demo.demnthree;

import com.example.demo.demoone.DemoClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Administrator
 * @className DemoConfiguration
 * @description TODO
 * @date {DATE}{TIME}
 */
@Configuration
public class DemoConfigurationThree {
    //单利，每次通过容器获取，返回同一个
    @Bean
    public DemoClass getDemoOther(){
        return new DemoClass();
    }
}
