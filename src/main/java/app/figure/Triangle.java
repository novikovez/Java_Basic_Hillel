package app.figure;

import app.AreaInterface;

public class Triangle implements AreaInterface {
    private final double a;
    private final double b;
    private final double c;

    public Triangle(
            double a,
            double b,
            double c
    ) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public Double square() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
