package com.intent.training.services;

import com.intent.training.entity.Robot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Scope("singleton")
public class Human {

    @Autowired
    @Qualifier("drone")
    public Robot robot;


    public String speak() {
        System.out.println("What war robot do:" + robot.howToMove());
        return "Hi!";
    }

    public String respond(String otherHuman, Date time) {
        System.out.println("Hi " + otherHuman + " time is: " + time.toString());
        return "something";
    }
}
