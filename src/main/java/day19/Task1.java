package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) {

        File dushiFile = new File("src/main/resources/dushi.txt");

        HashMap<String, Integer> wordsOccur = new HashMap<>();

        try {
            Scanner scanner = new Scanner(dushiFile);
            scanner.useDelimiter("[.,:;()?!\"\\s–]+");

            while (scanner.hasNext()) {
                String someText = scanner.next();

                someText.toLowerCase();
                if (wordsOccur.containsKey(someText)) {
                    wordsOccur.put(someText, wordsOccur.get(someText) + 1);
                } else {
                    wordsOccur.put(someText, 1);
                }
            }

            List<Map.Entry<String, Integer>> list = (new LinkedList<>(wordsOccur.entrySet()))
                    .stream()
                    .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                    .limit(100)
                    .collect(Collectors.toList());

            System.out.println(list);  // Чичиков - 601

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}