package day7;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int lenght, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = lenght;
        this.weight = weight;
    }

    public void setProducer(String airplaneProducer) {
        if (airplaneProducer.isEmpty()) {
            System.out.println("Это поле не может быть пустым");
        } else {
            producer = airplaneProducer;
        }
    }

    public void setYear(int airplaneYear) {
        if (airplaneYear < 0) {
            System.out.println("Год не может быть отрицательным");
        } else {
            year = airplaneYear;
        }
    }

    public void setLength(int airplaneLength) {
        if (airplaneLength < 0) {
            System.out.println("Длинна не может быть отрицательным");
        } else {
            length = airplaneLength;
        }
    }

    public void setWeight(int airplaneWeight) {
        if (airplaneWeight < 0) {
            System.out.println("Вес не может быть отрицательным");
        } else {
            weight = airplaneWeight;
        }
    }

    public void setFuel(int airplaneFuel) {
        fuel = airplaneFuel;
    }

    public int getFuel() {
        return fuel;
    }

    public void fillUp(int inputFuel) {
        fuel = fuel + inputFuel;
    }

    public void info() {
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }

    public int getLength() {
        return length;
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if (airplane1.getLength() > airplane2.getLength()) {
            System.out.println(airplane1.producer + " самолет длиннее");
        } else if (airplane1.getLength() < airplane2.getLength()) {
            System.out.println(airplane2.producer + " самолет длиннее");
        } else {
            System.out.println("Длина " + airplane1.producer + " и " + airplane2.producer + " одинаковая");
        }
    }
}