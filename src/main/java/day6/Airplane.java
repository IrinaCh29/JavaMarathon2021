package day6;

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
}