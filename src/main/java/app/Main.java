package app;

public class Main {
    private static final String num = "Num is ";
    private static final String sum = "sum is ";
    private static final String sumTotal = "Sum of numbers is ";
    private static final int[] array = {1,2,3,4,5,6};
    private static int count;
    private static int iteration = 0;

    public static void main(String[] args) {
        for (int item: array) {
            iteration++;
            count += item;
            System.out.println(iteration + ") " + num + item + ", " + sum + count);
        }
        System.out.println("________________________");
        System.out.println(sumTotal + count);
    }


}