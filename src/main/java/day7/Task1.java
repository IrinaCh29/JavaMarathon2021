package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boing", 2005, 100, 2000);
        Airplane airplane2 = new Airplane("Sukhoy",2018,200,1600);

        Airplane.compareAirplanes(airplane1, airplane2);
    }
}