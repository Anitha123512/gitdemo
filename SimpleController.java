package com.example.Demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class SimpleController {
    @Autowired
    ApplicationProps applicationProps;

    @RequestMapping("person/test")
    public List<Person> tes(){
        System.out.printf(applicationProps.getProfiles().toString());
        return applicationProps.getProfiles();
    }
}
