package com.example.Demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonNameController {

    @Autowired
    private PersonName personName;

    /*public String healthCheck(){
        return "OK";
    }*/

    @RequestMapping("/person/get")
    public String getPerson(@RequestParam(name="name", required = false, defaultValue = "ani")String name){
        personName.setName(name);
        return name;
    }

    @RequestMapping("/person/update")
    public String updatePerson(@RequestParam(name ="name",required =true)String name){
        personName.setName(name);
        return name;
    }

    /*@RequestMapping(value="/person/update", method= RequestMethod.POST, consumes = "application/json")
    public PersonName updatePerson(@RequestBody PersonName p) {
        personName.setName(p.getName());
        return personName;
    }*/
}
