package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CalculatorApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(CalculatorApp.class, args);

        Calculator calculate = context.getBean(Calculator.class);

        calculate.operations();
    }

}
