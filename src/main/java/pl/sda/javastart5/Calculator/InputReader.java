package pl.sda.javastart5.calculator;

import java.util.Scanner;

public class InputReader {
    public String input;

    public String readInput() {
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        return input;
    }

    public EquationModel extractEquation(String input) {
        String[] inputArray = input.split("(?<=[-+*/^#!])|(?=[-+*/^#!])");
        return new EquationModel(Double.parseDouble(inputArray[0]), inputArray[1].charAt(0), Double.parseDouble(inputArray[2]));
    }

    public EquationModel extractEquation1(String input) {
        String[] inputArray = input.split("(?<=[-+*/^#!])|(?=[-+*/^#!])");
        return new EquationModel(Double.parseDouble(inputArray[0]));
    }

    public EquationModel extractEquation2(String input) {
        String[] inputArray = input.split("(?<=[-+*/^#!])|(?=[-+*/^#!])");
        return new EquationModel(Double.parseDouble(inputArray[0]), inputArray[1].charAt(0));
    }

}
