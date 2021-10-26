package com.intent.training;

import com.intent.training.entity.ServiceRobot;
import com.intent.training.entity.WarRobot;
import com.intent.training.services.Human;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext("com.intent.training");
        Human human = (Human) context.getBean("human");
//        human.speak();
        human.respond("Mark", new Date());

        WarRobot warRobot = (WarRobot) context.getBean("warRobot");
        warRobot.respond("some question.");

        ServiceRobot serviceRobot = (ServiceRobot) context.getBean("serviceRobot");
        serviceRobot.howToMove();

        System.out.println("Bye.");
    }

    private static void oldCode() {
        //        SpringApplication.run(Main.class, args);
//        System.out.println("Hi!");
//        ApplicationContext context = new AnnotationConfigApplicationContext("com.intent.training");
//        Object suicideRobot0 = context.getBean("suicideRobot");
//        Object suicideRobot1 = context.getBean("suicideRobot");
//        Human human = (Human) context.getBean("human");
//        System.out.println(human.speak());

    }
}
