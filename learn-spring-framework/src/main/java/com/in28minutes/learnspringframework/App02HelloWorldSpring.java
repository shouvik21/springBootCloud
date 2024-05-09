package com.in28minutes.learnspringframework;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

    public static void main(String[] args) {
        //launch a spring context
       var context= new AnnotationConfigApplicationContext(HellloWorldConfiguration.class);
        //configure the things that we want spring to manage - @Configuration
        //name- @Bean
        //3: retrieving beans managed by spring
        System.out.println( context.getBean("name"));
        System.out.println( context.getBean("age"));
        System.out.println( context.getBean("person"));
        System.out.println( context.getBean("address2"));
        //get a bean by  type
        System.out.println( context.getBean(Address.class));

        System.out.println( context.getBean("person2MethodCall"));
        System.out.println( context.getBean("person3parameteres"));
    }
}
