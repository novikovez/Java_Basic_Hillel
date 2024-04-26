package app;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final int group1ValueMin = 0;
    private static final int group1ValueMax = 10000;
    private static final float group1Percent = 2.5F;
    private static final int group2ValueMax= 25000;
    private static final float group2Percent = 4.3F;
    private static final float groupFinalPercent = 6.7F;
    private static final String transactionAmount = "Бажаєте вказати суму операції (yes)? чи використовувати рандомні значення? (no)";
    private static final String enterUah = "Вкажіть суму в грн";
    private static final String profitTitle = "Дохід: %.2f грн%n";
    private static final String tax = "Податок: %.2f грн%n";
    private static final String error = "Вкажіть число!";

    public static void main(String[] args) {
        if(!type()) {
            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                float profit = random.nextInt(100, 50000);
                System.out.printf(profitTitle, profit);
                System.out.printf(tax, getValue(profit));
            }
            return;
        }
        float value = getValue();
        System.out.printf(tax, getValue(value));

    }

    private static float getValue(float profit) {
        float result;
        if (profit >= group1ValueMin && profit <= group1ValueMax) {
            result = profit * (group1Percent / 100);
        } else if (profit > group1ValueMax && profit <= group2ValueMax) {
            result = profit * (group2Percent / 100);
        } else {
            result = profit * (groupFinalPercent / 100);
        }
        return result;
    }

    private static boolean type() {
        System.out.println(transactionAmount);
        String input = scanner.nextLine();
        return input.equalsIgnoreCase("y")
                || input.equalsIgnoreCase("yes")
                || input.equalsIgnoreCase("так");
    }

    private static float getValue() {
        System.out.println(enterUah);
        try {
            float value = Float.parseFloat(scanner.nextLine());
            return (float) Math.round(value * 100) / 100;
        } catch (NumberFormatException exception) {
            System.out.println(error);
            System.out.println(enterUah);
            float value = Float.parseFloat(scanner.nextLine());
            return (float) Math.round(value * 100) / 100;
        }

    }
}