package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultOperationTest {
    private double num1;
    private double num2;
    private double num3;

    @Test
    public void mult_operationTest() {
        MultOperation uut = new MultOperation();

        double result = uut.multOperation(3,5,8);

        assertEquals(result, 120);
    }

}