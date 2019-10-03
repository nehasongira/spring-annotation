package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {



    @Autowired

     Actor actor;
    public Movie(Actor actor) {
        this.actor = actor;
    }

    public Movie() {

    }


    public void print()
    {
        actor.prints();
    }
}

