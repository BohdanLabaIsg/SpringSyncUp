package com.intent.training.services;

import com.intent.training.entity.Robot;
import org.springframework.beans.factory.annotation.Qualifier;

//@RestController
public class SimpleController {

//    @Qualifier("drone")
//    @Autowired
   private Robot robot0;
//
//    @Qualifier("serviceRobot")
//    @Autowired
    private Robot robot1;

    public SimpleController( @Qualifier("drone") Robot robot0, @Qualifier("serviceRobot") Robot robot1) {
        this.robot0 = robot0;
        this.robot1 = robot1;
    }

//    @GetMapping("/hello")
    public String sayHello() {
        return robot0.howToMove();
    }

}
