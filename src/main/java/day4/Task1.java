package day4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите любое положителное и целое число");

        int number = scanner.nextInt();
        int[] arrayNumbers = new int[number];
        int countAbove8 = 0;
        int countEquals1 = 0;
        int countEven = 0;
        int countUneven = 0;
        int sum = 0;

        for (int i = 0; i < number; i++) {
            arrayNumbers[i] = ((int) (Math.random() * 10));
            sum += arrayNumbers[i];
            System.out.print(arrayNumbers[i] + " ");
        }
        System.out.println();
        for (int j : arrayNumbers) {
            if (j > 8) {
                countAbove8++;
            }
            if (j == 1) {
                countEquals1++;
            }
            if (j % 2 == 0) {
                countEven++;
            } else {
           // if (j % 2 != 0) {
                countUneven++;
            }
            if (arrayNumbers[j] == 1){
                countEquals1++;
            }
        }
//        for (int i : arrayNumbers) {
//            sum += i;
//        }

        System.out.println("Информация о массиве:");
        System.out.println("Длина массива: " + number);
        System.out.println("Количество чисел больше 8: " + countAbove8);
        System.out.println("Количество чисел равных 1: " + countEquals1);
        System.out.println("Количество четных чисел: " + countEven);
        System.out.println("Количество нечетных чисел: " + countUneven);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}