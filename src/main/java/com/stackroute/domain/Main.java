package com.stackroute.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String args[])
    {
        //use ApplicationContext
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1=context.getBean("movieObj1",Movie.class);
        movie1.display();
        Movie movie2=context.getBean("movieObj2",Movie.class);
        movie2.display();
        Movie movie3=context.getBean("movieObj3",Movie.class);
        movie3.display();

    }
   }
