package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car(); //Данные согласованы с юнит тестами
        car.setYear(2012);
        car.setColor("Red");
        car.setModel("Nissan");
        car.info();
        int differenceCar = car.yearDifference(2020);
        System.out.println(differenceCar + " years");

        System.out.println("---");

        Motorbike motorbike = new Motorbike(2015, "Orange", "Yamaha"); //Данные согласованы с юнит тестами
        motorbike.info();
        int differenceMotorbike = motorbike.yearDifference(1980);
        System.out.println(differenceMotorbike + " years");
    }
}