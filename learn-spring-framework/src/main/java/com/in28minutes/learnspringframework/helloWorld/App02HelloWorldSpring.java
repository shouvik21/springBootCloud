package com.in28minutes.learnspringframework.helloWorld;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {

    public static void main(String[] args) {
        try ( var context= new AnnotationConfigApplicationContext(HellloWorldConfiguration.class)){

            //launch a spring context
//       var context= new AnnotationConfigApplicationContext(HellloWorldConfiguration.class);
            //configure the things that we want spring to manage - @Configuration
            //name- @Bean
            //3: retrieving beans managed by spring
            System.out.println( context.getBean("name"));
            System.out.println( context.getBean("age"));
            System.out.println( context.getBean("person"));
            System.out.println( context.getBean("address2"));
            //get a bean by  type
            System.out.println( context.getBean(Address.class));

            //error as multiple matching bean found
            System.out.println( context.getBean(Person.class));
            System.out.println( context.getBean(Address.class));

            System.out.println( context.getBean("person2MethodCall"));
            System.out.println( context.getBean("person3parameteres"));
            //HOW TO LIST ALL SPRING BEANS
            //by making one of the bean as primary
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println( context.getBean("person5Qualifier"));
        }


    }
}
