package com.stackroute.domain;

import org.springframework.stereotype.Component;

@Component
public class Actor {
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    private String name;
    private String gender;
    private int age;

    public void setname(String name)
    {
        this.name=name;
    }
    public void setgender(String gender)
    {
        this.gender=gender;
    }
    public void setage(int age)
    {
        this.age=age;
    }
    public void prints()
    {
        System.out.println("name"+" "+name+" "+"gender"+" "+gender+" "+"age"+" "+age);
        //  System.out.print(" ");
    }
}
