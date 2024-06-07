package app;
/*
| Автор: Igor Novikov |
*/


import app.exceptions.BadOperation;
import app.exceptions.DivisionByZero;

public class Calculator {
    public static void main(String[] args) throws BadOperation, DivisionByZero {
        CalculatorService.calculator();
    }
}


