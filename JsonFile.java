package com.example.springproject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
class JsonFile {
    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public String call() throws JsonProcessingException {
        Employee1 employee = new Employee1();
        employee.setId(1);
        employee.setName("pavan");
        ObjectMapper objectMapper = new ObjectMapper();
        String empString = objectMapper.writeValueAsString(employee);
        System.out.println(empString);
        Employee1 employee1 = objectMapper.readValue(empString, Employee1.class);
        System.out.println(employee1);
        return empString;
    }

    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
        mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, true);
        return mapper;
    }
}