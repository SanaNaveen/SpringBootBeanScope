package com.example.SpringBeanScope;

import com.example.SpringBeanScope.DTO.Response;
import com.example.SpringBeanScope.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    private RequestScopedService requestScopedService;

    private SessionScopedService sessionScopedService;

    private ApplicationScopedService applicationScopedService;

    private SingletonScopedService singletonScopedService;

    private PrototypeScopedService prototypeScopedService;

    private PrototypeScopedService prototypeScopedService1;

    @Autowired
    public Controller(RequestScopedService requestScopedService, SessionScopedService sessionScopedService,
                      ApplicationScopedService applicationScopedService, SingletonScopedService singletonScopedService,
                      PrototypeScopedService prototypeScopedService) {
        this.requestScopedService = requestScopedService;
        this.sessionScopedService = sessionScopedService;
        this.applicationScopedService = applicationScopedService;
        this.singletonScopedService = singletonScopedService;
        this.prototypeScopedService = prototypeScopedService;
        this.prototypeScopedService1 = prototypeScopedService;
    }

    @GetMapping("/executeMapping")
    public Response requestMapping() {

        Response response = new Response();
        response.setRequestBean(requestScopedService.print());
        response.setSessionBean(sessionScopedService.print());
        response.setApplicationBean(applicationScopedService.print());
        response.setPrototypeBean(prototypeScopedService.print());
        response.setSingletonBean(singletonScopedService.print());
        System.out.println(prototypeScopedService1.print() + "----");
        return response;

    }

    @GetMapping("/executeMapping1")
    public Response requestMapping1() {

        Response response = new Response();
        response.setRequestBean(requestScopedService.print());
        response.setSessionBean(sessionScopedService.print());
        response.setApplicationBean(applicationScopedService.print());
        response.setPrototypeBean(prototypeScopedService.print());
        response.setSingletonBean(singletonScopedService.print());
        System.out.println(prototypeScopedService1.print() + "----");
        return response;

    }
}
