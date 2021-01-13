package com.example.springboot;

public class Employee2 {
    int id;
    String name;

    public Employee2(int i, String raja) {
      this.id=i;
      this.name=raja;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
