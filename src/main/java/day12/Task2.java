package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 351; i++) {
            if (i % 2 == 0){
                if ((i >= 0 && i <= 30) || (i >= 300 && i <= 350)){
                    integers.add(i);
                }
            }
        }
        System.out.println(integers);
    }
}