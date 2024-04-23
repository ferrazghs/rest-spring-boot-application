package br.com.spring.restspringbootapplication.interfaces;

public interface INumericValidations {

    Double convertToDouble(String strNumber);

    boolean isNumeric(String strNumber);
}
