package app.figure;

import app.AreaInterface;

public class Square implements AreaInterface {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public Double square() {
        return side * side;
    }
}
