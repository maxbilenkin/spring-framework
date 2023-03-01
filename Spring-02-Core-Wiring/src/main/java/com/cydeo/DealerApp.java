package com.cydeo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DealerApp {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigCar.class);

        Car c = container.getBean(Car.class);  // we are telling the spring to get the car object from the bean(container)
        Person p = container.getBean(Person.class); // we are telling the spring to get the person object from the bean(container)

        System.out.println("Person's name : " + p.getName()); // here we want to print person's name that we set when we created the object
        System.out.println("Car's make : " + c.getMake());    // here we want to print car's brand that we set when we created the object
        System.out.println("Person's car : " + p.getCar().getMake());   // here we want to access person's car



    }
}
