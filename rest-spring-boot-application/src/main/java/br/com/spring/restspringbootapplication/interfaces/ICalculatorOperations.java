package br.com.spring.restspringbootapplication.interfaces;

public interface ICalculatorOperations extends INumericValidations {

    Double sum(String numberOne, String numberTwo);

    Double subtraction(String numberOne, String numberTwo);

    Double multiplication(String numberOne, String numberTwo);

    Double division(String numberOne, String numberTwo);

    Double average(String numberOne, String numberTwo);

    Double squareRoot(String number);
}
