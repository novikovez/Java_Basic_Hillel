package app;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String string1 = "Введіть ціле число: ";
    private static final String string2 = "Квадрат числа %d дорівнює %d%n";
    private static final String string3 = "Об'єм циліндра з радіусом %.2f і висотою %.2f дорівнює %f%n";
    private static final String string4 = "Масив чисел: %s%n";
    private static final String string5 = "Сума всіх елементів масиву дорівнює: %d%n";
    private static final String string6 = "Введіть рядок:";
    private static final String string7 = "Рядок в зворотньому порядку: %s%n";
    private static final String string8 = "Введіть a:";
    private static final String string9 = "Введіть b:";
    private static final String string10 = "Результат %d^%d дорівнює %d%n";


    public static void main(String[] args) {
        System.out.println(string1);
        int input = scanner.nextInt();
        System.out.printf(string2, input, square(input));

        double cylinderRadius = 3.5;
        double cylinderHeight = 10.0;
        System.out.printf(string3, cylinderRadius, cylinderHeight, cylinderVolume(cylinderRadius, cylinderHeight));

        int[] arrayInt = {10, 20, 30, 40, 50};
        System.out.printf(string4, Arrays.toString(arrayInt));
        System.out.printf(string5, arrayOfIntegers(arrayInt));

        scanner.nextLine();
        System.out.println(string6);
        String inputString = scanner.nextLine();
        System.out.printf(string7, string(inputString));

        System.out.println(string8);
        int a = scanner.nextInt();
        System.out.println(string9);
        int b = scanner.nextInt();
        System.out.printf(string10, a, b, degree(a, b));

        System.out.println(string1);
        int value = scanner.nextInt();
        System.out.println(string6);
        scanner.nextLine();
        String string = scanner.nextLine();
        stringAndInt(value, string);

    }

    private static int square(int value) {
        return value * value;
    }

    private static double cylinderVolume(double cylinderRadius, double cylinderHeight) {
        return Math.PI * cylinderRadius * cylinderRadius * cylinderHeight;
    }

    private static int arrayOfIntegers(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum = sum + j;
        }
        return sum;
    }

    private static String string(String string) {
        return new StringBuilder(string).reverse().toString();
    }

    private static int degree(int a, int b) {
        return (int) Math.pow(a, b);
    }

    private static void stringAndInt(int value, String string) {
        for (int i = 0; i < value; i++) {
            System.out.println(string);
        }
    }
}

