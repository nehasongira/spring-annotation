package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {


    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Autowired

     Actor actor;

    public Movie() {

    }


    public void print()
    {
        actor.prints();
    }
}

