package com.example.SpringBeanScope.DTO;

public class Response {

    private String requestBean;
    private String sessionBean;
    private String singletonBean;
    private String prototypeBean;
    private String applicationBean;

    public String getRequestBean() {
        return requestBean;
    }

    public void setRequestBean(String requestBean) {
        this.requestBean = requestBean;
    }

    public String getSessionBean() {
        return sessionBean;
    }

    public void setSessionBean(String sessionBean) {
        this.sessionBean = sessionBean;
    }

    public String getSingletonBean() {
        return singletonBean;
    }

    public void setSingletonBean(String singletonBean) {
        this.singletonBean = singletonBean;
    }

    public String getPrototypeBean() {
        return prototypeBean;
    }

    public void setPrototypeBean(String prototypeBean) {
        this.prototypeBean = prototypeBean;
    }

    public String getApplicationBean() {
        return applicationBean;
    }

    public void setApplicationBean(String applicationBean) {
        this.applicationBean = applicationBean;
    }
}
