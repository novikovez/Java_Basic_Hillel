package app;

import java.time.LocalDate;

public class Main {
    private static final String productTitle = "Product No %d: %s%n";
    private static final String totalSaleTitle = "Total sales for %d";
    private static final String daysEur = " days is EUR %.2f%n";
    private static final String salesDay = "Sales by day is EUR %.2f%n";
    private static final String salesMonth = "Sales by month is EUR %.2f%n"; // від себе


    public static void main(String[] args) {
        showConsoleData(1, 5, "smartphone", 121.53F, 74);
        showConsoleData(2, 7, "laptop", 104.86F, 123);
    }

    private static void showConsoleData(
            int id,
            int days,
            String product,
            float price,
            int pcs
    ) {
        LocalDate currentDate = LocalDate.now();
        int daysInMonth = currentDate.lengthOfMonth();

        float total = price * pcs;
        float totalDays = total / days;
        float avgMonth = totalDays * daysInMonth;

        System.out.printf(
                productTitle
                        + totalSaleTitle
                        + daysEur
                        + salesDay
                        + salesMonth,
                id, product, days, total, totalDays, avgMonth
        );
    }
}