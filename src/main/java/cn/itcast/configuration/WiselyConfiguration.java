package cn.itcast.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;


@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration
@ComponentScan("cn.itcast.service.impl")
public @interface WiselyConfiguration {
    String[] value() default {};


}


