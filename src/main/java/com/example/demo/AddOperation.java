package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class AddOperation {
    private double num1=3;
    private double num2=5;
    private double num3=8;

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

    public double addOperation(double num1, double num2, double num3){
        double result;
        result = num1+num2+num3;
        return result;
    }
}
