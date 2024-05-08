package app;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final int[] array = new int[15];
    private static final int min = 1;
    private static final int max = 100;
    private static int input;

    private static final String string1 = "Початковий вигляд масиву: ";
    private static final String string2 = "Відсортований масив:";
    private static final String string3 = "Введіть число для пошуку: ";
    private static final String string4 = "Індекс числа: %d у відсортованому масиві: %d";
    private static final String string5 = "Число %d не знайдено у відсортованому масиві";


    public static void main(String[] args) {
        setDataArray();
        System.out.println(string1 + Arrays.toString(array));
        insertionSort();
        System.out.println(string2 + Arrays.toString(array));
        System.out.println(string3);
        input = scanner.nextInt();
        int binarySearchResult = binarySearch();
        if(binarySearchResult != -1) {
            System.out.printf(string4, input, binarySearchResult);
        } else {
            System.out.printf(string5, input);
        }
    }

    private static void setDataArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (max - min + 1) + min);
        }
    }

    private static void insertionSort() {
        int n = array.length;                       // розмір масиву
        for (int i = 1; i < n; ++i) {               // порівнюємо з минулим, тому починемо з індексу 1
            int key = array[i];                     // беремо елемент із масиву
            int j = i - 1;                          // індекс минулого значення

            while (j >= 0 && array[j] > key) {      // входимо якщо минуле значення більше поточного
                array[j + 1] = array[j];            // перемістити минуле значення вперед
                j = j - 1;                          // беремо значення зліва і перевіряємо у while
            }
            array[j + 1] = key;                     // елементів для перемішування немає, поточний елемент, у правильне місце
        }
    }

    private static int binarySearch() {
        int left = 0;                               // початковий індекс
        int right = array.length - 1;               // останній індекс
        while (left <= right) {                     // поки left не стане більше
            int mid = left + (right - left) / 2;    // індекс середнього елемента
            if (array[mid] == input) {              // перевірка середнього елемента з пошуком
                return mid;                         // якщо знайшли, повернути
            } else if (array[mid] < input) {        // перевірити чи більше пошук середнього значення, якщо так, пошук в right
                left = mid + 1;                     // якщо більше, значення в right, новий початковий кордон
            } else {
                right = mid - 1;                    // новий кінцевий кордон
            }
        }
        return -1;                                  // не знайшли число
    }
}

