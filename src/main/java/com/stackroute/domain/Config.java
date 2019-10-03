package com.stackroute.domain;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan("com.stackroute.domain")

public class Config {
    @Bean
    public Actor getActor()
    {
        Actor actor=new Actor();
        actor.setname("robbert");
        actor.setage(33);
        actor.setgender("male");

        return actor;

    }
    @Bean
    public Movie getMovie()
    {
        return new Movie();
    }

}



