package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Hyundai");
        arrayList.add("Cherry");
        arrayList.add("Nissan");
        arrayList.add("BMW");
        arrayList.add("Toyota");
        System.out.println(arrayList);
        arrayList.add(3,"Mercedes");
        arrayList.remove(0);
        System.out.println(arrayList);
    }
}