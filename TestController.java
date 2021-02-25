package com.examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    Test test;

    @GetMapping("/data")
    public Test getEmployee() {
       return test;
    }

}
