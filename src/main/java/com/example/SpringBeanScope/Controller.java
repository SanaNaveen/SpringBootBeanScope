package com.example.SpringBeanScope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private SessionAndRequestBeanImpl beanImpl;

    @Autowired
    public Controller(SessionAndRequestBeanImpl beanImpl) {
        this.beanImpl = beanImpl;
    }


    @GetMapping("/sessionMapping")
    public String sessionMapping() {
        return beanImpl.getSessionBean().getName();
    }

    @GetMapping("/requestMapping")
    public String requestMapping() {
        return beanImpl.getRequestBean().getName();
    }
}
