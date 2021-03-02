package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int maxSum = 0;
        int count = 0;
        for (int i = 0; i < array.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += array[j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                count = i;
            }
        }
        System.out.println("максимум среди сумм трех соседних элементов: " + maxSum + "\n" + count);
    }
}