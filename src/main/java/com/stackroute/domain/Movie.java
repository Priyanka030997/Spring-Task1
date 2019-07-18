package com.stackroute.domain;

public class Movie {
    private Actor actor;
//set actor object in movie class
    public void setActor(Actor actor)

    {
        this.actor = actor;
    }

//display the actor details
     public void display()

    {
        System.out.println("Actor name is:"+actor.getName()+" Actor Gender is:"+actor.getGender()+" Actor Age is:"+actor.getAge());
    }

}
