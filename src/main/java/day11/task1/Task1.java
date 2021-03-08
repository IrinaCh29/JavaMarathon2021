package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Courier courier = new Courier(warehouse);
        Picker picker = new Picker(warehouse);

        businessProcess(picker);
        System.out.println(picker);
        System.out.println(warehouse);

        businessProcess(courier);
        System.out.println(courier);
        System.out.println(warehouse);

        System.out.println();

        Warehouse warehouse2 = new Warehouse();
        Courier courier2 = new Courier(warehouse2);
        Picker picker2 = new Picker(warehouse2);

        picker2.doWork();
        courier2.doWork();
        System.out.println(picker2);
        System.out.println(courier2);

        System.out.println();

        System.out.println(picker);
        System.out.println(courier);
        System.out.println(warehouse);
    }

    public static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}