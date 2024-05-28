package app.figure;

import app.AreaInterface;

public class Circle implements AreaInterface {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public Double square() {
        return Math.PI * Math.pow(radius, 2);
    }
}
