package com.example.SpringBeanScope.service;

public interface BaseService {

    default public String print() {
        System.out.println(BaseService.this.toString());
        System.out.println(BaseService.this.hashCode());
        return this.toString() + " : Hash Code : " + this.hashCode() ;
    }

}
