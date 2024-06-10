package com.example.SpringBeanScope.beanConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class PrototypeBean {

    public PrototypeBean() {
        System.out.println("Prototype Bean Created");
    }

}
