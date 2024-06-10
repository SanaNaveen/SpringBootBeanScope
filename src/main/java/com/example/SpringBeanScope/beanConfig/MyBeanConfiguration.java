package com.example.SpringBeanScope.beanConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyBeanConfiguration {

    @Bean
    @Scope(value = "singleton")
    public  SingletonBean bean() {
        return new SingletonBean();
    }

    @Bean
    @Scope(value = "prototype")
    public PrototypeBean prototypeBean() {
        return new PrototypeBean();
    }

}
