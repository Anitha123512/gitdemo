package com.examples;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;

public class AnnotationsTest {

    //@Test
    void testMethod() {
        System.out.println("@Test method executed");
    }
    @BeforeEach
    void runBeforeEveryTest() {
        System.out.println("@BeforeEach executed");
    }
    @AfterEach
    void runAfterEveryTest() {
        System.out.println("@AfterEach executed \n");
    }
    @BeforeAll
    static void runOnceBeforeAllTests() {
        System.out.println("@BeforeAll executed \n");
    }
    @AfterAll
    static void runOnceAfterAllTests() {
        System.out.println("@AfterAll executed");
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2})
    void testParameterizedMethod(int number) {
        System.out.println("@ParameterizedTest executed with number " + number);
    }
    @RepeatedTest(3)
    void repeatedTestExample() {
        System.out.println("@RepeatedTest");
    }


    }

