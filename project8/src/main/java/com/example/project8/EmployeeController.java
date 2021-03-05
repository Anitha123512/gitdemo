package com.example.project8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    Employee employee;

    Employee emp=new Employee("1002","anitha");

    List<Employee> list=new ArrayList<>();

    @RequestMapping(value = "/id",method = RequestMethod.GET)
    public Employee method(){
        return emp;
    }

}
