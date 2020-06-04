package com.example.demo.demnthree.now;

import com.example.demo.demnthree.other.BeanTow;
import com.example.demo.demnthree.other.OtherConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Administrator
 * @className BeanConfiguration
 * @description TODO
 * @date {DATE}{TIME}
 */
@Configuration
@Import(OtherConfiguration.class)
public class BeanConfiguration {
    @Bean
    public BeanOne getBeanOne(){
        return new BeanOne();
    }

}
