package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        File fileRead = new File("file");
        printSumDigits(fileRead);
    }

    public static void printSumDigits(File file) {
        try {
            Scanner scanner = new Scanner(file);

            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");
            int[] numbers = new int[10];

            for (int i = 0; i < numbersString.length; i++) {
                numbers[i] = Integer.parseInt(numbersString[i]);
            }

            if (numbersString.length != 10) {
                throw new IllegalArgumentException();
            }

            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }

            System.out.println(sum);

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
    }
}