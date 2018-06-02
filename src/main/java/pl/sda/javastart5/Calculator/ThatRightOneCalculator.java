package pl.sda.javastart5.calculator;

import pl.sda.javastart5.calculator.exceptions.InvalidNumberException;

public class ThatRightOneCalculator {
    private static InputReader inputReader = new InputReader();
    private static Calculator calculator = new Calculator();

    public static void main(String[] args) throws InvalidNumberException {
        while (true) {
            String input1 = inputReader.readInput();
            if (input1.equalsIgnoreCase("q")) {
                System.exit(0);
            }

            char operationMark = inputReader.extractEquation(input1).getOperationMark();
            double firstNumber = inputReader.extractEquation(input1).getFirstNumber();
            double secondNumber = inputReader.extractEquation(input1).getSecondNumber();
            switch (operationMark) {
                case '+':
                    System.out.println(calculator.addTwoNumbers(firstNumber, secondNumber));
                    break;
                case '-':
                    System.out.println(calculator.subtractTwoNumbers(firstNumber, secondNumber));
                    break;
                case '*':
                    System.out.println(calculator.multiplyTwoNumbers(firstNumber, secondNumber));
                    break;
                case '/':
                    System.out.println(calculator.divideTwoNumbers(firstNumber, secondNumber));
                    break;
                case '^':
                    System.out.println(calculator.powerOf(firstNumber, secondNumber));
                    break;
                case '#':
                    System.out.println(calculator.nthRootOf(firstNumber, secondNumber));
                    break;
            }
        }
    }
}