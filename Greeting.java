package com.example.Demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greeting {

    @RequestMapping("/greet")
    public String index(){
        return "greetings from spring boot";
    }
}
