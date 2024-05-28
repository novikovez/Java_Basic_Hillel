package app;

import app.figure.Circle;
import app.figure.Square;
import app.figure.Triangle;

public class Main extends Base {
    public static void main(String[] args) {
        AreaInterface[] areas = {
                new Circle(10),
                new Triangle(5, 5, 5),
                new Square(10)
        };
        System.out.println(getTotalSquare(areas));
    }
}


