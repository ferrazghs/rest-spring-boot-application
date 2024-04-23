package br.com.spring.restspringbootapplication.controller;

import br.com.spring.restspringbootapplication.exceptions.UnsupportedMathOperationException;
import br.com.spring.restspringbootapplication.services.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DecimalFormat;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}")
    public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {

        return calculatorService.sum(numberOne, numberTwo);
    }

    @RequestMapping(value = "/subtraction/{numberOne}/{numberTwo}")
    public Double subtraction(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
        return calculatorService.subtraction(numberOne, numberTwo);
    }

    @RequestMapping(value = "/multiplication/{numberOne}/{numberTwo}")
    public Double multiplication(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {

        return calculatorService.multiplication(numberOne, numberTwo);

    }

    @RequestMapping(value = "/division/{numberOne}/{numberTwo}")
    public Double division(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {

        return calculatorService.division(numberOne, numberTwo);

    }

    @RequestMapping(value = "/average/{numberOne}/{numberTwo}")
    public Double average(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {

        return calculatorService.average(numberOne, numberTwo);

    }

    @RequestMapping(value = "/squareroot/{number}")
    public Double squareRoot(@PathVariable("number") String number) throws Exception {

        return calculatorService.squareRoot(number);

    }
}
