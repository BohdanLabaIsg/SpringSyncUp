package com.intent.training.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Random;


@Service
@Scope("prototype")
public class SuicideRobot implements Robot {

    @PostConstruct
    public void init() {
        System.out.println("New suicide robot created.");
    }

    @Override
    public String howToMove() {
        return "RUN";
    }

    public Integer seekTarget() {
        return new Random().nextInt(9) + 1;
    }

}
