package day5;


public class Task2 {
    public static void main(String[] args) {

        Motorbike motorbike = new Motorbike(2015, "Orange", "Yamaha");
        System.out.println("Год выпуска мотоцикла: " + motorbike.getYear());
        System.out.println("Цвет мотоцикла: " + motorbike.getColor());
        System.out.println("Модель мотоцикла: " + motorbike.getModel());
    }
}