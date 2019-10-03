package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actor {

    @Value("robert")
    private String name;
    @Value("male")
    private String gender;
    @Value("33")
    private int age;
    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }



    public void prints()
    {
        System.out.println("name"+" "+name+" "+"gender"+" "+gender+" "+"age"+" "+age);
        //  System.out.print(" ");
    }
}
