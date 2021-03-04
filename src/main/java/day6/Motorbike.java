package day6;

public class Motorbike {
    private int year;
    private String color;
    private String model;

    public Motorbike(int year, String color, String model) {
        if (year <= 0) {
            System.out.println("Уточните год выпуска, меньше 0 не может быть");
        } else {
            this.year = year;
        }
        if (color.isEmpty()) {
            System.out.println("Укажите цвет мотоцикла");
        } else {
            this.color = color;
        }
        if (model.isEmpty()) {
            System.out.println("Укажите модель мотоцикла");
        } else {
            this.model = model;
        }
    }

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int inputYear) {
        if (inputYear < year) {
            System.out.println("Текущая дата меньше года выпуска, проверьте введенный год.");
        }
        return Math.abs(inputYear - year);
    }
}