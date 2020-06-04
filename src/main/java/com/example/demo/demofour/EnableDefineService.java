package com.example.demo.demofour;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author Administrator
 * @className EnableDefineService
 * @description TODO
 * @date {DATE}{TIME}
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({CacheImportSelector.class,LoggerDefinetionRegister.class}) //导入的不是config
public @interface EnableDefineService {
    //配置一些方法
    Class<?>[] exclude() default {};
}
