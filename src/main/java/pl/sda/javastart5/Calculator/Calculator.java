package pl.sda.javastart5.calculator;

import pl.sda.javastart5.calculator.exceptions.InvalidNumberException;

public class Calculator extends InvalidNumberException {

    public double addTwoNumbers(double firstNumber, double secondNumber) {

        return firstNumber + secondNumber;
    }

    public double subtractTwoNumbers(double firstNumber, double secondNumber) {

        return firstNumber - secondNumber;
    }

    public double multiplyTwoNumbers(double firstNumber, double secondNumber) {

        return firstNumber * secondNumber;
    }

    public double divideTwoNumbers(double firstNumber, double secondNumber) throws InvalidNumberException {
        if (secondNumber == 0) {
            throw new InvalidNumberException("Nie dziel przez 0");
        }
        return firstNumber / secondNumber;
    }

    public double powerOf(double firstNumber, double secondNumber) {
        return Math.pow(firstNumber, secondNumber);
    }

    public double nthRootOf(double firstNumber, double secondNumber) {
        return Math.pow(firstNumber, (1 / secondNumber));
    }

    public double isEven(double number, int i) {
        return number % i;
    }
}