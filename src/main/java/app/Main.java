package app;

import java.time.LocalDate;

public class Main {
    private static final String productTitle = "Product No %d: %s%n";
    private static final String totalSaleTitle = "Total sales for %d";
    private static final String daysEur = " days is EUR %.2f%n";
    private static final String salesDay = "Sales by day is EUR %.2f%n";
    private static final String salesMonth = "Sales by month is EUR %.2f%n"; // від себе

    public static void main(String[] args) {
        showConsoleData(1, 5, "smartphone", 12153.41F);
        showConsoleData(2, 7, "laptop", 10486.85F);
    }

    private static void showConsoleData(int id, int days, String product, float total) {
        LocalDate currentDate = LocalDate.now();
        int daysInMonth = currentDate.lengthOfMonth();

        float avgDay = total / days;
        float avgMonth = avgDay * daysInMonth;

        System.out.printf(
                productTitle
                        + totalSaleTitle
                        + daysEur
                        + salesDay
                        + salesMonth,
                id, product, days, total, avgDay, avgMonth
        );
    }
}