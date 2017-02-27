package com.mkyong.common;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class HelloBean {

    private String value;

    @PostConstruct
    public void init() {
        this.log("init");
        this.value = "Hello";
    }

    public void submit() {
        this.log("submit");
    }

    private void log(String tag) {
        System.out.println(tag + " hash:" + this.hashCode());
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}