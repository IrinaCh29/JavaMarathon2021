package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] randomNumber = new int[1000];

        for (int i = 0; i < randomNumber.length; i++) {
            randomNumber[i] = random.nextInt(101);
        }

        File file1 = new File("src/main/resources/file16-1.txt");
        File file2 = new File("src/main/resources/file16-2.txt");

        try {
            PrintWriter printWriter = new PrintWriter(file1);
            for (int i : randomNumber) {
                printWriter.println(i);
            }
            printWriter.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        recordingOfRealNumbers(file1, file2);
        printResult(file2);
    }

    public static void recordingOfRealNumbers(File file1, File file2) {

        try {
            Scanner scanner = new Scanner(file1);
            PrintWriter printWriter = new PrintWriter(file2);
            int sum = 0;
            int count = 0;

            while (scanner.hasNextLine()) {
                sum += Integer.parseInt(scanner.nextLine());
                count++;

                if (count == 20) {
                    printWriter.println(sum / 20.0);
                    sum = 0;
                    count = 0;
                }
            }
            printWriter.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void printResult(File file) {

        try {
            Scanner scanner = new Scanner(file);
            String number = scanner.nextLine();
            String[] numbersString = number.split(" ");

            double sumResult = 0;
            for (String result : numbersString) {
                sumResult += Double.parseDouble(result);
            }

            scanner.close();
            System.out.println((int) sumResult);

        } catch (FileNotFoundException e) {
            System.out.println("File is not exist");
        }
    }
}