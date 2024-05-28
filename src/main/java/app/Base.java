package app;

public class Base {
    private static double total = 0;

    protected static double getTotalSquare(AreaInterface[] areas) {
        for (AreaInterface area : areas) {
            total += area.square();
        }
        return total;
    }
}
