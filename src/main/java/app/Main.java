package app;

import java.util.Arrays;
import java.util.Locale;

public class Main {
    private static final Locale LOCALE = Locale.US;
    private static final int[] array = new int[20];
    private static final int min = -100;
    private static final int max = 100;
    private static int negativeTotal;
    private static int pairedCount;
    private static int unpairedCount;
    private static int maxValue = 0;
    private static int maxValueKey;
    private static int minValue = 0;
    private static int minValueKey;
    private static int point6Index = -1;
    private static final String string1 = "Найбільший елемент: %d (з індексом %d)%n";
    private static final String string2 = "Найменший елемент: %d (з індексом %d)%n";
    private static final String string3 = "Кількість непарних чисел: %d%n";
    private static final String string4 = "Кількість парних чисел: %d%n";
    private static final String string5 = "Сума від'ємних чисел: %d%n";
    private static final String string6 = "Елементи масиву: ";
    private static final String string7 = "Середнє арифметичне чисел після першого від'ємного числа: %.2f%n";

    public static void main(String[] args) {
        setDataArray();
        System.out.println(string6 + Arrays.toString(array));

        for(int i = 0; i < array.length; i++) {
            negativeTotal(array[i]);
            pairedAndUnpaired(array[i]);
            maxAndMinValue(array[i], i);
            point6SetIndex(array[i], i);
        }

        System.out.printf(string5, negativeTotal);
        System.out.printf(string4, pairedCount);
        System.out.printf(string3, unpairedCount);
        System.out.printf(string2, minValue, minValueKey);
        System.out.printf(string1, maxValue, maxValueKey);
        System.out.println(point6());
    }

    private static void setDataArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (max - min + 1) + min);
        }
    }

    private static void negativeTotal(int value) {
        if(value < 0) {
            negativeTotal += value;
        }
    }

    private static void pairedAndUnpaired(int value) {
        if(value % 2 == 0) {
            pairedCount++;
        } else {
            unpairedCount++;
        }
    }

    private static void maxAndMinValue(int value, int key) {
        if(maxValue == 0 || maxValue < value) {
            maxValue = value;
            maxValueKey = key;
        }
        if(minValue == 0 || minValue > value) {
            minValue = value;
            minValueKey = key;
        }
    }

    private static void point6SetIndex(int value, int key) {
        if(point6Index == -1) {
            if(value < 0) {
                point6Index = key + 1;
            }
        }
    }

    private static String point6() {
        if(point6Index == -1) {
            return "Від'ємних чисел немає";
        }

        int count = 0;
        int total = 0;

        for(int i = point6Index; i < array.length; i++) {
            count++;
            total += array[i];
        }

        float result = (float) total / count;
        return String.format(LOCALE, string7, result);
    }


}

