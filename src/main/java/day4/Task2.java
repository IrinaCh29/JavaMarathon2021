package day4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        int amountOfElements = 0;
        int sumOfElements = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) ((Math.random() * 1000));
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int j : numbers) {
            if (j % 10 == 0) {
                amountOfElements++;
                sumOfElements += j;
            }
            if (j > max) {
                max = j;
            }
            if (j < min) {
                min = j;
            }
        }

        System.out.println("Количество элементов массива, оканчивающихся на 0: " + amountOfElements);
        System.out.println("Суммa элементов массива, оканчивающихся на 0: " + sumOfElements);
        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива:" + min);
        System.out.println(Arrays.toString(numbers));
    }
}