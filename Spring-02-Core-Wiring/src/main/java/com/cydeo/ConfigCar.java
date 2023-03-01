package com.cydeo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigCar {

    @Bean
    Car car(){
        Car c = new Car();
        c.setMake("Honda");
        return c;
    }

    //Direct wiring
//    @Bean
//    Person person(){
//      Person p = new Person();
//      p.setName("Mike");
//      p.setCar(car());
//      return p;
//    }

    //Autowiring (this method is always better because spring is handling. However, spring boot will eliminate most of the writing so both methods are not really useful)
    @Bean
    Person person(Car car){
        Person p = new Person();
        p.setName("Mike");
        p.setCar(car);
        return p;
    }
}
