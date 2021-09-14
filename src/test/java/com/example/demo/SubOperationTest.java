package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubOperationTest {

    @Test
    public void sub_operationTest() {
        SubOperation uut = new SubOperation();

        double result = uut.subOperation(uut.getNum1(), uut.getNum2(), uut.getNum3());

        assertEquals(result, -10);
    }

}