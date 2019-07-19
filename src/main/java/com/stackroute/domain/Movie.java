package com.stackroute.domain;

public class Movie {
    private Actor actor;

    public Movie(Actor actor) {
        this.actor = actor;
    }
    public Movie(){

    }

//used default constructor
    public Actor getActor() {

        return actor;
    }
//used paramaterised constructor
    public void setActor(Actor actor)
    {
        this.actor = actor;
    }
//displayed the actor details
    public void display()

    {
        System.out.println("Actor name is:"+actor.getName()+", Actor Gender is:"+actor.getGender()+", Actor Age is:"+actor.getAge());
    }

}
