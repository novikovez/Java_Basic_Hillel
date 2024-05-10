package app;

import java.util.Arrays;
import java.util.Random;

public class Main {
    private static final int[][] array = new int[4][4];
    private static final Random random = new Random();

    private static final String string1 = "Матриця 4x4:";
    private static final String string2 = "Сума елементів у парних рядках (рядок 0, 2): %d%n";
    private static final String string3 = "Сума елементів у непарних рядках (рядок 1, 3): %d%n";
    private static final String string4 = "Добуток елементів у парних стовпцях (стовпець 0, 2): %.0f%n";
    private static final String string5 = "Добуток елементів у непарних стовпцях (стовпець 1, 3): %.0f%n";
    private static final String string6 = "Матриця не є магічним квадратом";
    private static final String string7 = "Матриця є магічним квадратом";

    public static void main(String[] args) {
        setDataArray();
        System.out.println(string1);
        showArray();

        int[] sumPairedUnPaired = sumPairedAndUnPaired();
        System.out.printf(string2, sumPairedUnPaired[0]);
        System.out.printf(string3, sumPairedUnPaired[1]);

        float[] multiplicationArray = multiplication();
        System.out.printf(string4, multiplicationArray[0]);
        System.out.printf(string5, multiplicationArray[1]);

        System.out.print(isMagicSquare());

    }

    private static void setDataArray() {
        for (int i = 0; i < array.length; i++) {
            for (int i2 = 0; i2 < array[i].length; i2++) {
                array[i][i2] = random.nextInt(1, 50);
            }
        }
    }

    private static void showArray() {
        for (int[] arr : array) {
            System.out.println(Arrays.toString(arr));
        }
    }

    private static int[] sumPairedAndUnPaired() {
        int[] result = new int[2];
        for (int[] arr : array) {
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 0) {
                    result[0] += arr[i];
                } else {
                    result[1] += arr[i];
                }
            }
        }
        return result;
    }

    private static float[] multiplication() {
        float[] result = {1, 1};
        for (int i = 0; i < array.length; i++) {
            for (int i2 = 0; i2 < array[i].length; i2++) {
                if (i2 % 2 == 0) {
                    result[0] *= array[i2][i];
                } else {
                    result[1] *= array[i2][i];
                }
            }
        }
        return result;
    }

    public static String isMagicSquare() {
        int n = array.length;                           // Довжина масиву
        for (int[] ints : array) {                      // перевірка на квадрат
            if (ints.length != n) {                     // якщо довжина підмасиву не дорівнює довжині масиву - false
                return string6;
            }
        }

        int sum = 0;                                    // сума першого рядка для наступних перевірок
        for (int j = 0; j < n; j++) {
            sum += array[0][j];
        }

        for (int i = 1; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += array[i][j];
            }
            if (rowSum != sum) {                        // порівняння інших рядків з першим
                return string6;
            }
        }

        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum += array[i][j];
            }
            if (colSum != sum) {                        // Перевіряємо суми стовпців із сумою першого рядка
                return string6;
            }
        }

        int diagSum = 0;
        for (int i = 0; i < n; i++) {
            diagSum += array[i][i];
        }
        if (diagSum != sum) {                           // Перевіряємо суму головної діагоналі
            return string6;
        }

        int antiDiagSum = 0;
        for (int i = 0; i < n; i++) {
            antiDiagSum += array[i][n - i - 1];         // Перевіряємо суму побічної діагоналі
        }
        if (antiDiagSum != sum) {
            return string6;
        }
        return string7;                                 // Якщо всі суми дорівнюють, то це магічний квадрат
    }
}

