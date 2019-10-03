package com.stackroute.domain;

import org.springframework.stereotype.Component;

@Component
public class Actor {
    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    private String name;
    private String gender;
    private int age;


    public void prints()
    {
        System.out.println("name"+" "+name+" "+"gender"+" "+gender+" "+"age"+" "+age);
        //  System.out.print(" ");
    }
}
