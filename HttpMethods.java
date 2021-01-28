package com.example.Demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class  HttpMethods{

    @GetMapping()
    public String getUser(){
        return "Http GET Request was getting";
    }

    @PostMapping()
    public String createUser(){
        return "Http POST Request was Create";
    }

    @DeleteMapping()
    public String deleteUser(){
        return "Http  DELETE Request was Deleted";
    }

    @PutMapping()
    public String updateUser(){
        return "Http  PUT Request was Updated";
    }

}

