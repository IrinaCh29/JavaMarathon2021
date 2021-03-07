package day9.Task2;

public class Triangle extends Figure {
    private int oneSideTriangle;
    private int secondSideTriangle;
    private int thirdSideTriangle;

    public Triangle(int oneSideTriangle, int secondSideTriangle, int thirdSideTriangle, String color) {
        super(color);
        this.oneSideTriangle = oneSideTriangle;
        this.secondSideTriangle = secondSideTriangle;
        this.thirdSideTriangle = thirdSideTriangle;
    }

    @Override
    public double area() {
        double pTriangle = (oneSideTriangle + secondSideTriangle + thirdSideTriangle) / 2;
        return Math.sqrt(pTriangle * (pTriangle - oneSideTriangle) * (pTriangle - secondSideTriangle) * (pTriangle - thirdSideTriangle));
    }

    @Override
    public double perimeter() {
        return (oneSideTriangle + secondSideTriangle + thirdSideTriangle);
    }
}