package com.stackroute.domain;


import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.beans.factory.BeanFactory;

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


        /*//use Beanfactory
       BeanFactory factory=new ClassPathXmlApplicationContext("beans.xml");
        movie1=factory.getBean("movie1",Movie.class);
        movie1.display();
        movie2=factory.getBean("movie2",Movie.class);
        movie2.display();
        movie3=factory.getBean("movie3",Movie.class);
        movie3.display();

        //use BeanDefinitionReader
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions(new FileSystemResource("src/main/resources/beans.xml"));
        movie1= beanFactory.getBean("movie1",Movie.class);
        movie1.display();
        movie2= beanFactory.getBean("movie2",Movie.class);
        movie2.display();
        movie3= beanFactory.getBean("movie3",Movie.class);
        movie3.display();

        //use BeanDefinitionRegistry
        BeanDefinitionRegistry beanDefinitionRegistry = new DefaultListableBeanFactory();
        BeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
        beanDefinitionReader.loadBeanDefinitions(new FileSystemResource("src/main/resources/beans.xml"));
        Movie moviebean1= beanFactory.getBean("movie1",Movie.class);
        moviebean1.display();
        Movie moviebean2= beanFactory.getBean("movie2",Movie.class);
        moviebean2.display();
        Movie moviebean3= beanFactory.getBean("movie3",Movie.class);
        moviebean3.display();*/


    }
   }
