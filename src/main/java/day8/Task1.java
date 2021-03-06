package day8;

public class Task1 {
    public static void main(String[] args) {
        long startString = System.currentTimeMillis();
        String numbers = "";

        for (int i = 0; i <= 20000; i++) {
            numbers += i + " ";// OR = numbers + i + " ";
        }
        long finishString = System.currentTimeMillis();

        System.out.println(numbers);
        long timeString = finishString - startString;
        System.out.println("Длительность выполнения цикла, когда класс String: " + timeString);

        long startSB = System.currentTimeMillis();

        StringBuilder stringBuilderNumbers = new StringBuilder("");

        for (int i = 0; i <= 20000; i++) {
            stringBuilderNumbers.append(i).append(" ");
        }

        long finishSB = System.currentTimeMillis();

        System.out.println(stringBuilderNumbers);
        long timeStringBuilder = finishSB - startSB;
        System.out.println("Длительность выполнения цикла, когда класс StringBuilder: " + timeStringBuilder);
    }
}