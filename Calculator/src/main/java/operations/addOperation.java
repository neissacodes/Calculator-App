package operations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class addOperation {

    public addOperation(){
        System.out.println("Object Created");
    }

    public void addString(){
        System.out.println("We are here");
    }

    public calculateAdd getCalc() {
        return calc;
    }

    public void setCalc(calculateAdd calc) {
        this.calc = calc;
    }

    @Autowired
    private calculateAdd calc;

    private double num1;

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

    private double num2;

    public void addOp(){
        calc.bothNums(9,7);
    }

}
