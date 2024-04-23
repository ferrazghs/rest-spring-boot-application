package br.com.spring.restspringbootapplication.controller;

import br.com.spring.restspringbootapplication.services.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorControllerTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    public void testSum() {

        String numberOne = "40,0";
        String numberTwo = "8.0";

        Double sum = calculatorService.sum(numberOne, numberTwo);

        Assertions.assertEquals(48.0D, sum);
    }

    @Test
    public void testSubstraction() {

        String numberOne = "2,0";
        String numberTwo = "6.0";

        Double subtraction = calculatorService.subtraction(numberOne, numberTwo);

        Assertions.assertEquals(-4.0D, subtraction);
    }

    @Test
    public void testMultiplicationOk() {

        String numberOne = "3.0";
        String numberTwo = "2.0";

        Double multiplication = calculatorService.multiplication(numberOne, numberTwo);

        Assertions.assertEquals(6.0, multiplication);
    }

    @Test
    public void testMultiplicationFail() {

        String numberOne = "3.0";
        String numberTwo = "2.0";

        Double multiplication = calculatorService.multiplication(numberOne, numberTwo);

        Assertions.assertNotEquals(null, multiplication);
    }

    @Test
    public void testDivision() {

        String numberOne = "9,00";
        String numberTwo = "3.0";

        Double division = calculatorService.division(numberOne, numberTwo);

        Assertions.assertEquals(3.0, division);
    }

    @Test
    public void testAvg() {

        String numberOne = "10,00";
        String numberTwo = "2.0";

        Double avg = calculatorService.average(numberOne, numberTwo);

        Assertions.assertEquals(6.0, avg);
    }

    @Test
    public void testSquareRoot() {

        String number = "9";

        Double squareRoot = calculatorService.squareRoot(number);

        Assertions.assertEquals(3.0, squareRoot);
    }

    @Test
    public void testSquareRootInvalid() {

        String number = "9";

        Double squareRoot = calculatorService.squareRoot(number);

        Assertions.assertNotEquals(2.3333, squareRoot);
    }
}