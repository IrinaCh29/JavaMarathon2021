package day9.Task2;

public class Rectangle extends Figure {
    private int highRectangle;
    private int widthRectangle;

    public Rectangle(int highRectangle, int widthRectangle, String color) {
        super(color);
        this.highRectangle = highRectangle;
        this.widthRectangle = widthRectangle;
    }

    public int getHighRectangle() {
        return highRectangle;
    }

    public int getWidthRectangle() {
        return widthRectangle;
    }

    @Override
    public double area() {
        return highRectangle * widthRectangle;
    }

    @Override
    public double perimeter() {
        return (highRectangle + widthRectangle) * 2;
    }
}