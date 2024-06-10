package com.example.SpringBeanScope;

import com.example.SpringBeanScope.beanConfig.RequestBean;
import com.example.SpringBeanScope.beanConfig.SessionBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SessionAndRequestBeanImpl {

    private RequestBean requestBean;

    private SessionBean sessionBean;

    @Autowired
    public SessionAndRequestBeanImpl(RequestBean requestBean, SessionBean sessionBean) {
        this.requestBean = requestBean;
        this.sessionBean = sessionBean;
    }

    public RequestBean getRequestBean() {
        return requestBean;
    }

    public void setRequestBean(RequestBean requestBean) {
        this.requestBean = requestBean;
    }

    public SessionBean getSessionBean() {
        return sessionBean;
    }

    public void setSessionBean(SessionBean sessionBean) {
        this.sessionBean = sessionBean;
    }
}
