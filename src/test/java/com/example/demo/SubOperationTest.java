package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubOperationTest {
    private double num1;
    private double num2;
    private double num3;

    @Test
    public void sub_operationTest() {
        SubOperation uut = new SubOperation();

        double result = uut.subOperation(3,5,8);

        assertEquals(result, -10);
    }

}