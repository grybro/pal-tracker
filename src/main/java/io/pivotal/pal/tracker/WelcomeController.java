package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

//    @Value("${WELCOME_MESSAGE}")
    private String message;

//    @Autowired
    public WelcomeController(@Value("${WELCOME_MESSAGE}")String message) {
        this.message = message;
    }

//    public WelcomeController() {
//
//    }

    @GetMapping("/")
    public String sayHello() {
        return  message;
    }
}