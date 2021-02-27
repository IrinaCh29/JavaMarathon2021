package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //  System.out.println("Введите нужный этаж дома"); - закомениторовала, иначе юнит тесты падают
        int theFloor = Integer.parseInt(s.nextLine());

        if (theFloor >= 1 && theFloor <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (theFloor >= 5 && theFloor <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (theFloor >= 9) {
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Ошибка ввода");
        }
    }
}