package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int j = 90 + random.nextInt(100 - 90 + 1);
        for (int i = 0; i < 6; i++) {
            new Player(j);
        }

        Player player = new Player(j);
        player.run();
        Player.info();
    }
}