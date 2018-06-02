package CalculatorTest;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import pl.sda.javastart5.calculator.EquationModel;
import pl.sda.javastart5.calculator.InputReader;

public class InputReaderTest {
    public static InputReader inputReader;

    @BeforeClass
    public static void setUp() {
        inputReader = new InputReader();
    }

    @Test
    public void testExtractEquation() {
        //given
        String firstEquation = "3+4";
        String secondEquation = "7-4";
        String thirdEquation = "3*4";
        String fourthEquation = "12/4";

        EquationModel firstEquationExpected = new EquationModel(3, '+', 4);
        EquationModel secondEquationExpected = new EquationModel(7, '-', 4);
        EquationModel thirdEquationExpected = new EquationModel(3, '*', 4);
        EquationModel fourthEquationExpected = new EquationModel(12, '/', 4);

        //when
        EquationModel actualFirstResult = inputReader.extractEquation(firstEquation);
        EquationModel actualSecondResult = inputReader.extractEquation(secondEquation);
        EquationModel actualThirdResult = inputReader.extractEquation(thirdEquation);
        EquationModel actualFourthResult = inputReader.extractEquation(fourthEquation);

        //then
        Assert.assertEquals(firstEquationExpected,actualFirstResult);
        Assert.assertEquals(secondEquationExpected,actualSecondResult);
        Assert.assertEquals(thirdEquationExpected,actualThirdResult);
        Assert.assertEquals(fourthEquationExpected,actualFourthResult);

    }
}