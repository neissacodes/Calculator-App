package com.example.calculator;
import operations.addOperation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class CalculatorApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(addOperation.class, args);

        addOperation a = context.getBean(addOperation.class);

        a.addString();
        a.addOp();

    }

}
