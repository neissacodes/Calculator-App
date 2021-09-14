package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing Multiply Class")
class MultOperationTest {

    @Test
    public void mult_operationTest() {
        MultOperation uut = new MultOperation();

        double result = uut.multOperation(uut.getNum1(), uut.getNum2(), uut.getNum3());

        assertEquals(result, 120);
    }

}