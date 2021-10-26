package com.intent.training.configuration;

import com.intent.training.entity.Robot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.intent.training")
@Configuration
public class RobotConfiguration {


    @Bean
    public Robot drone() {
        return () -> "fly";
    }
}
