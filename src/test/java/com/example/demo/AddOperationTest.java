package com.example.demo;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;


public class AddOperationTest {

   @Test
   public void add_operationTest() {

      AddOperation uut = new AddOperation();

      double result = uut.addOperation(uut.getNum1(),uut.getNum2(), uut.getNum3());

      assertEquals(result, 16);

   }

}