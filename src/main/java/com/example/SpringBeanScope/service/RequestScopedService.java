package com.example.SpringBeanScope.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

@RequestScope
@Service
public class RequestScopedService implements BaseService{

}
