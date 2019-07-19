package com.stackroute.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
    public static void main(String args[])
    {
        //use ApplicationContext
        //use prototype for create new instance for each getBean method
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie movieA=context.getBean("movieA",Movie.class);
        movieA.display();
        Movie movieB=context.getBean("movieB",Movie.class);
        movieB.display();
        Movie movieC=context.getBean("movieC",Movie.class);
        movieC.display();
        Movie movieD=context.getBean("movieD",Movie.class);
        movieD.display();
        Movie movieE=context.getBean("movieE",Movie.class);
        movieE.display();
        Movie movieF=context.getBean("movieF",Movie.class);
        movieF.display();
        Movie movie4=context.getBean("movieE",Movie.class);
        System.out.println(movieE==movie4);

    }
   }
