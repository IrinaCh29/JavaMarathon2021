package day9.Task2;

public class Circle extends Figure {
    private int circleRadius;

    public Circle(int circleRadius, String color) {
        super(color);
        this.circleRadius = circleRadius;
    }

    public int getCircleRadius() {
        return circleRadius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(circleRadius, 2);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * circleRadius;
    }
}