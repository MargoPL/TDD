package pl.sda.javastart5.calculator;


public class EquationModel {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EquationModel that = (EquationModel) o;
        return Double.compare(that.firstNumber, firstNumber) == 0 &&
                Double.compare(that.secondNumber, secondNumber) == 0 &&
                operationMark == that.operationMark;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public double getFirstNumber() {

        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public char getOperationMark() {
        return operationMark;
    }

    private double firstNumber;
    private double secondNumber;
    private char operationMark;

    public EquationModel(double i, char c, double i1) {
        firstNumber = i;
        secondNumber = i1;
        operationMark = c;
    }
}