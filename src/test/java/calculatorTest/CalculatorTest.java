package calculatorTest;

import junitparams.JUnitParamsRunner;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import pl.sda.javastart5.calculator.Calculator;
import pl.sda.javastart5.calculator.exceptions.InvalidNumberException;

@RunWith(JUnitParamsRunner.class)
public class CalculatorTest {

    private static Calculator calculator;

    @Rule
    public ExpectedException exception = ExpectedException.none();

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

    @Test(expected = InvalidNumberException.class)
    public void testDivideWithExpected() throws InvalidNumberException {
        // given
        double firstNumber = 5;
        double secondNumber = 0;

        //when
        double actualResult = calculator.divideTwoNumbers(firstNumber, secondNumber);
    }

    @Test
    public void testDivideWithRule() throws InvalidNumberException {
        // given
        double firstNumber = 5;
        double secondNumber = 0;
        exception.expect(InvalidNumberException.class);
        exception.expectMessage("Nie dziel przez 0");

        //when
        calculator.divideTwoNumbers(firstNumber, secondNumber);
    }

    @Test
    public void testDivideWithTryCatch() {
        //given
        double firstNumber = 5;
        double secondNumber = 0;

        //when
        try {
            calculator.divideTwoNumbers(firstNumber, secondNumber);
            Assert.fail();
        } catch (InvalidNumberException invalidNumberException) {

        }
    }

    @Test
    public void testIsEven() {
        //given
        double firstNumber = 12;
        double secondNumber = 5;
        double expectedResult = 0;

        //when
        double actualResult = calculator.isEven(firstNumber, 2);
        double actualResult1 = calculator.isEven(secondNumber, 2);

        //then
        Assert.assertTrue(expectedResult == actualResult);
        Assert.assertFalse(expectedResult == actualResult1);
    }

    @Test
    public void testFactorial(){
        //given
        double number = 4;
        double number1 = 7;
        double number2 = 2;
        double number3 = 3;

        double score = 24;
        double score1 = 5040;
        double score2 = 2;
        double score3 = 6;

        //when
        double actualResult = calculator.factorial(number,'!');
        double actualResult1 = calculator.factorial(number1,'!');
        double actualResult2 = calculator.factorial(number2,'!');
        double actualResult3 = calculator.factorial(number3,'!');

        //then
        Assertions.assertThat(score).isEqualTo(actualResult);
        Assertions.assertThat(score1).isEqualTo(actualResult1);
        Assertions.assertThat(score2).isEqualTo(actualResult2);
        Assertions.assertThat(score3).isEqualTo(actualResult3);
    }
}