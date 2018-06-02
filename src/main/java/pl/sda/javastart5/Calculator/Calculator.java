package pl.sda.javastart5.calculator;

public class Calculator {

    public double addTwoNumbers(double firstNumber, double secondNumber) {

        return firstNumber + secondNumber;
    }

    public double subtractTwoNumbers(double firstNumber, double secondNumber) {

        return firstNumber - secondNumber;
    }

    public double multiplyTwoNumbers(double firstNumber, double secondNumber) {

        return firstNumber * secondNumber;
    }

    public double divideTwoNumbers(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    public double powerOf(double firstNumber, double secondNumber) {
        return Math.pow(firstNumber, secondNumber);
    }

    public double nthRootOf(double firstNumber, double secondNumber) {
        return Math.pow(firstNumber, (1 / secondNumber));
    }
}