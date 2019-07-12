package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean initialization code");
    }

    public void destroy() throws Exception {
        System.out.println("Bean destroy code");
    }

    public void customInit() {

        System.out.println("add custominit method");
    }

    public void customDestroy()
    {
        System.out.println("add customdestroy method");
    }
}

