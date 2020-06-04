package com.example.demo.demnthree.other;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Administrator
 * @className OtherConfiguration
 * @description TODO
 * @date {DATE}{TIME}
 */
@Configuration
public class OtherConfiguration {
    @Bean
    public BeanTow getBeanTow(){
        return new BeanTow();
    }
}
