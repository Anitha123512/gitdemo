package com.example.Demo;

import org.springframework.stereotype.Component;

@Component
public class PersonName {
    String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public PersonName(){

    }

    public String toString(){
        return "PersonName{"+
                "name="+ name+'\''+
                        '}';
    }

}
