package app;
/*
| Автор: Igor Novikov |
*/

import app.exceptions.BadOperation;
import app.exceptions.DivisionByZero;

import java.util.Scanner;

public class CalculatorService {
    private static final Scanner scanner = new Scanner(System.in);

    public static double calculator() throws BadOperation, DivisionByZero {
        System.out.println("Введіть перше число:");
        double num1 = scanner.nextDouble();

        System.out.println("Введіть операцію (+, -, *, /):");
        String operator = scanner.next();

        System.out.println("Введіть друге число:");
        double num2 = scanner.nextDouble();

        return logic(num1, num2, operator);

    }

    public static double logic(
            double num1,
            double num2,
            String operator
    ) throws DivisionByZero, BadOperation {
        double result = 0;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    throw new DivisionByZero("Помилка: Ділення на нуль!");
                }
                break;
            default:
                throw new BadOperation("Невірна операція!");
        }
        return result;
    }
}
