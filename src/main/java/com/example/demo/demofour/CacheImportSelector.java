package com.example.demo.demofour;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.lang.annotation.*;
import java.util.Map;

/**
 * @author Administrator
 * @className CacheImportSelector
 * @description TODO
 * @date {DATE}{TIME}
 */

public class CacheImportSelector implements ImportSelector {
    //AnnotationMetadata 注解中的元数据
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        //获取EnableDefineService注解的元信息
        Map<String,Object> attributes= annotationMetadata.getAnnotationAttributes(EnableDefineService.class.getName());
        //可以返回一些信息，暂时写死
        System.out.println(attributes.get("exclude").getClass().getName());
        if(attributes.get("exclude")==null){
            return new String[] {CacheService.class.getName()};
        }

        else{
            return new String[] {CacheService.class.getName(),AttachService.class.getName()}; //将此类托管给springioc

        }
        //SP扩展点相当于从所有resource/MATE-INF/spring.fatories配置文件中
//       return new String[] {"org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration",
//               "org.springframework.boot.autoconfigure.batch.BatchAutoConfiguration",
//               "org.springframework.boot.autoconfigure.cache.CacheAutoConfiguration"};
    }
}
