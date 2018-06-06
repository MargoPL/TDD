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

            if (input1.length() > 2) {
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
            }else if (input1.length()==2){
                double number = inputReader.extractEquation2(input1).getFirstNumber();

                    System.out.println(calculator.factorial(number, '!'));

        }else {
                double number = inputReader.extractEquation1(input1).getFirstNumber();
                System.out.println(calculator.isEven(number, 2) == 0 ? "Liczba jest parzysta" : "Liczba jest nieptarzysta");
                break;
            }
        }
    }
}