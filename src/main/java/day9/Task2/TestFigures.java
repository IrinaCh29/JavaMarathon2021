package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {

        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };

        double redPerimeter = calculateRedPerimeter(figures);
        double redArea = calculateRedArea(figures);

        System.out.println("Площадь красных фигур: " + redArea);
        System.out.println("Периметр красных фигур: " + redPerimeter);
    }

    public static double calculateRedArea(Figure[] figures) {
        double redArea = 0;
        for (Figure figure : figures) {
            if (figure.getColor().equals("Red")) {
                redArea += figure.area();
            }
        }
        return redArea;
    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double redPerimeter = 0;
        for (Figure figure : figures) {
            if (figure.getColor().equals("Red")) {
                redPerimeter += figure.perimeter();
            }
        }
        return redPerimeter;
    }
}