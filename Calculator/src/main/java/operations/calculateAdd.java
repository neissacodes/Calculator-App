package operations;

import org.springframework.beans.factory.annotation.Autowired;

public class calculateAdd {
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    private double num1;

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    private double num2;

    public void bothNums(double num1, double num2){
        System.out.println(num1+num2);
    }
}