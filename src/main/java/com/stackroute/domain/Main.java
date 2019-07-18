package com.stackroute.domain;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Main {
    public static void main(String args[])
    {
        //By using ApplicationContext
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie=context.getBean("movie",Movie.class);
        movie.display();

        //By using Beanfactory
        BeanFactory factory=new ClassPathXmlApplicationContext("beans.xml");
        movie=factory.getBean("movie",Movie.class);
        movie.display();

        //By using BeanDefinitionReader
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions(new FileSystemResource("src/main/resources/beans.xml"));
        Movie movie1= beanFactory.getBean("movie",Movie.class);
        movie1.display();


    }
   }
