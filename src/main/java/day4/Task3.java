package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int m = 12;
        int n = 8;

        Random random = new Random();

        int[][] array = new int[m][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(50);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        int maxSum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            if (sum >= maxSum) {
                maxSum = sum;
                count = i;
            }
        }
        System.out.println("Индекс строки, сумма чисел в которой максимальна: " + count);
    }
}