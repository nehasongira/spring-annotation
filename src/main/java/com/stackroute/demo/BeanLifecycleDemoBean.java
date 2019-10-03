package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PreDestroy;

import javax.annotation.PostConstruct;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

    String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @PostConstruct
    public void customInit()
    {
        System.out.println("customInit() called");
    }
    @PreDestroy
    public void customDestroy()
    {

        System.out.println("customDestroy() called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init method after property set");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy method");
    }
}