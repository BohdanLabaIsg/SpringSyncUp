package com.intent.training.entity;

import org.springframework.stereotype.Component;

@Component
public class ServiceRobot implements Robot, Speaker {

    public String howToMove() {
        return "Moving with wheels";
    }

    @Override
    public String respond(String question) {
        return question + " - ready to execute.";
    }
}
