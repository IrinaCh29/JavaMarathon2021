package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        if (b > a) {
            for (int i = a; b > i; i++) {
                if (i % 5 == 0 && i % 10 != 0 && i != a) {
                    System.out.print(i + " ");
                }
            }
        }
        if (a > b) {
            System.out.println("Некорректный ввод");
        }
    }
}