package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (; ; ) {
            double dividend = scanner.nextDouble(); //делимое
            double divider = scanner.nextDouble();  //делитель
            if (divider == 0)
                break;
            System.out.println(dividend / divider);
        }
    }
}