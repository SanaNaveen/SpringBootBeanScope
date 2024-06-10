package com.example.SpringBeanScope.beanConfig;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class RequestBean {

    private String name ="Request Scope";

    public RequestBean() {
        System.out.println("RequestBeanScope Constructor Called");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
