package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("boeing", 1990,20000,60000);
        airplane.setProducer("Airplane");
        airplane.setYear(1990);
        airplane.setLength(1500);
        airplane.setWeight(8000);
        airplane.setFuel(100);
        airplane.getFuel();
        airplane.fillUp(300);
        airplane.fillUp(500);
        airplane.info();
    }
}