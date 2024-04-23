package br.com.spring.restspringbootapplication.services;

import br.com.spring.restspringbootapplication.exceptions.UnsupportedMathOperationException;
import br.com.spring.restspringbootapplication.interfaces.ICalculatorOperations;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements ICalculatorOperations {
    @Override
    public Double sum(String numberOne, String numberTwo) {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }

        return convertToDouble(numberOne) + convertToDouble(numberTwo);
    }

    @Override
    public Double subtraction(String numberOne, String numberTwo) {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }

        return convertToDouble(numberOne) - convertToDouble(numberTwo);
    }

    @Override
    public Double multiplication(String numberOne, String numberTwo) {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }

        return convertToDouble(numberOne) * convertToDouble(numberTwo);
    }

    @Override
    public Double division(String numberOne, String numberTwo) {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }

        return convertToDouble(numberOne) / convertToDouble(numberTwo);
    }

    @Override
    public Double average(String numberOne, String numberTwo) {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }

        return (convertToDouble(numberOne) + convertToDouble(numberTwo)) / 2;
    }

    @Override
    public Double squareRoot(String number) {
        if (!isNumeric(number)) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }

        return Math.sqrt(convertToDouble(number));
    }

    @Override
    public Double convertToDouble(String strNumber) {
        if (strNumber == null) {
            return 0D;
        }
        String number = strNumber.replaceAll(",", ".");

        if (isNumeric(number)) {
            return Double.parseDouble(number);
        }

        return 0D;
    }

    @Override
    public boolean isNumeric(String strNumber) {
        if (strNumber == null) {
            return false;
        }
        String number = strNumber.replaceAll(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}
