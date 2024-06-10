package com.example.SpringBeanScope.beanConfig;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class SessionBean {

    private String name ="Request Scope";

    public SessionBean() {
        System.out.println("SessionBeanScope Constructor Called");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
