package com.example.project8;

import org.springframework.stereotype.Component;

@Component
public class Employee {
    String id;
    String name;

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }
    public Employee(){

    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
