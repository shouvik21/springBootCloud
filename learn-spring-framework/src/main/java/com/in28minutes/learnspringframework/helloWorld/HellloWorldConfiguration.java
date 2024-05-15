package com.in28minutes.learnspringframework.helloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//release in jdk 16
//eliminate verbosity in creating java beans
//pulic accessor methods, contruictor, equals, hashcode and toString are automatically created
record Person(String name, int age, Address address){};
record Address(String firstLine, String city){};

@Configuration
public class HellloWorldConfiguration {

    @Bean
    public String name(){
        return "Shouvik";
    }
    @Bean
    public int age(){
        return 24;
    }
    @Bean
    public Person person(){
        return new Person("Ravi", 30,new Address("Main Street", "Utrecht"));
    }

    @Bean(name = "address2")// naming a bean customly
    @Primary
    public Address address(){
        return new Address("Bakers Street", "London");
    }

    @Bean(name = "address3")// naming a bean customly
    @Qualifier("addresss3qualifier")
    public Address address1(){
        return new Address("Kolkata", "India");
    }

    @Bean
    public Person person2MethodCall(){
        return new Person(name(),age(),address());
    }

    @Bean
    @Primary
    public Person person3parameteres(String name, int age, Address address2){ //name of bean should be variable name
        return new Person(name,age,address2);
    }

    @Bean
    @Qualifier("addresss3qualifier")
    public Person person5Qualifier(String name, int age, Address address2){ //name of bean should be variable name
        return new Person(name,age,address2);
    }

}