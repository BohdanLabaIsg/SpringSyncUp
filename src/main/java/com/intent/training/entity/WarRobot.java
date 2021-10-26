package com.intent.training.entity;

import org.springframework.stereotype.Component;

@Component
public class WarRobot implements Robot, Speaker {

    public String howToMove() {
        return "Moving on tracks";
    }

    public String respond(String question) {
        return question + " - answer not available.";
    }
}
