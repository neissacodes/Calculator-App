package com.example.demo;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class AddOperationTest {
   private double num1;
   private double num2;
   private double num3;
   @Test
   public void add_operationTest() {
//      AddOperation uut = Mockito.mock(AddOperation.class);
//
//      double result = uut.addOperation(3,5,8);
//
//      Mockito.when(uut.addOperation(num1,num2,num3).thenReturn(16));
//
//      assertEquals(result, uut.addOperation(3,5,8));
//   }
      AddOperation uut = new AddOperation();

      double result = uut.addOperation(3,5,8);

      assertEquals(result, 16);

   }

}