package CalculatorTest;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import pl.sda.javastart5.calculator.Calculator;

public class CalculatorTest {

    private static Calculator calculator;


    @BeforeClass
    public static void SetUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAddTwoNumbers() {
        //given
        double firstNumber = 3;
        double secondNumber = 4;
        double expectedResult = 7;

        //when
        double actualResult = calculator.addTwoNumbers(firstNumber, secondNumber);

        //then
        Assert.assertTrue(expectedResult == actualResult);
    }

    @Test
    public void testSubtractTwoNumbers() {
        //given
        double firstNumber = 7;
        double secondNumber = 4;
        double expectedResult = 3;

        //when
        double actualResult = calculator.subtractTwoNumbers(firstNumber, secondNumber);

        //then
        Assert.assertTrue(expectedResult == actualResult);
    }

    @Test
    public void testMultiplyTwoNumbers() {
        //given
        double firstNumber = 3;
        double secondNumber = 4;
        double expectedResult = 12;

        //when
        double actualResult = calculator.multiplyTwoNumbers(firstNumber, secondNumber);

        //then
        Assert.assertTrue(expectedResult == actualResult);
    }

    @Test
    public void testDivideTwoNumbers() throws Exception {
        //given
        double firstNumber = 12;
        double secondNumber = 4;
        double expectedResult = 3;

        //when
        double actualResult = calculator.divideTwoNumbers(firstNumber, secondNumber);

        //then
        Assert.assertTrue(expectedResult == actualResult);
    }

    @Test
    public void testPowerOf() {
        //given
        double firstNumber = 2;
        double secondNumber = 5;
        double expectedResult = 32;

        //when
        double actualResult = calculator.powerOf(firstNumber, secondNumber);

        //then
        Assert.assertTrue(expectedResult == actualResult);
    }

    @Test
    public void testNthRootOf() {
        //given
        double firstNumber = 9;
        double secondNumber = 2;
        double expectedResult = 3;

        //when
        double actualResult = calculator.nthRootOf(firstNumber, secondNumber);

        //then
        Assert.assertTrue(expectedResult == actualResult);
    }
}