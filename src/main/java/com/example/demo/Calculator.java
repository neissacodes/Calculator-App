package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    private double num1;
    private double num2;
    private double num3;
    @Autowired
    private AddOperation adding;
    @Autowired
    private SubOperation sub;
    @Autowired
    private MultOperation mult;

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getNum3() {
        return num3;
    }

    public void setNum3(double num3) {
        this.num3 = num3;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                ", num3=" + num3 +
                '}';
    }

    public void operations() {
        double result1, result2, result3, result;

        System.out.println("Calculation results:");
        result1 = adding.addOperation(8, 9, 3);
        System.out.println("From add operations: " + result1);
        result2 = sub.subOperation(3, 7, 4);
        System.out.println("From substract operations: " + result2);
        result3 = mult.multOperation(8, 2, 4);
        System.out.println("From multiply operations: " + result3);
        result = result1+result2+result3;
        System.out.println("Final Results: " + result);
    }

}
