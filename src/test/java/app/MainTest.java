package app;
/*
| Автор: Igor Novikov |
*/


import app.exceptions.BadOperation;
import app.exceptions.DivisionByZero;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void logicAdditionTest() throws BadOperation, DivisionByZero {
        double result = CalculatorService.logic(1, 1, "+");
        assertEquals(2.0, result, 0.0001);
    }

    @Test
    public void logicSubtractionTest() throws BadOperation, DivisionByZero {
        double result = CalculatorService.logic(1, 1, "-");
        assertEquals(0, result, 0.0001);
    }

    @Test
    public void logicDivisionTest() throws BadOperation, DivisionByZero {
        double result = CalculatorService.logic(10, 2, "/");
        assertEquals(5, result, 0.0001);
    }

    @Test
    public void logicMultiplicationTest() throws BadOperation, DivisionByZero {
        double result = CalculatorService.logic(10, 2, "*");
        assertEquals(20, result, 0.0001);
    }
}
