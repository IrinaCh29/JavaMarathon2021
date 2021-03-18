package day19.task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Neil Alishev
 */
public class Task3 {
    public static void main(String[] args) {

        HashMap<Integer, Point> taxi = new HashMap<>();

        try {
        File taxiCarsFile = new File("src/main/resources/taxi_cars.txt");

        Scanner scanner = new Scanner(taxiCarsFile);

        while (scanner.hasNext()) {
            int id = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            Point point = new Point(x, y);
            taxi.put(id, point);
        }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        System.out.println("Введите x1:");
        Scanner x1 = new Scanner(System.in);
        int inputX1 = x1.nextInt();
        System.out.println("Введите y1:");
        Scanner y1 = new Scanner(System.in);
        int inputY1 = y1.nextInt();
        System.out.println("Введите x2:");
        Scanner x2 = new Scanner(System.in);
        int inputX2 = x2.nextInt();
        System.out.println("Введите y2:");
        Scanner y2 = new Scanner(System.in);
        int inputY2 = y2.nextInt();


        int minX = Math.min(inputX1, inputX2);
        int maxX = Math.max(inputX1, inputX2);
        int minY = Math.min(inputY1, inputY2);
        int maxY = Math.max(inputY1, inputY2);


        List<Map.Entry<Integer, Point>> taxies = (new LinkedList<>(taxi.entrySet()))
                .stream()
                .filter(i -> i.getValue().getX() >= minX && i.getValue().getX() <= maxX && i.getValue().getY() >= minY && i.getValue().getY() <= maxY)
                .collect(Collectors.toList());

        System.out.println("Количество машин - " + taxies);
    }
}