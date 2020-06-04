package com.example.demo.demofour;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.util.StringUtils;

/**
 * @author Administrator
 * @className LoggerDefinetionRegister
 * @description TODO
 * @date {DATE}{TIME}
 */
public class LoggerDefinetionRegister implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
          Class beanClass =LoggerService.class;
        RootBeanDefinition beanDefinition =new RootBeanDefinition(beanClass);//封装
        //相当于<bean name=
       String name= StringUtils.uncapitalize(beanClass.getSimpleName());
       //可以自定义bean name 与CacheImportSelector 不同name，而且直接就能装配了，而CacheImportSelector 只能过滤，返回字符串数组，由spring装配
        registry.registerBeanDefinition(name,beanDefinition);

    }
}
