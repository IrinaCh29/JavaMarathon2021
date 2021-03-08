package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Андрей Григорьев-апполонов");
        members1.add("Кирил Андреев");
        members1.add("Игорь Матвиенко");

        MusicBand musicBand1 = new MusicBand("Иванушки", 2001, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("Melanie С");
        members2.add("Victoria  Beckham");
        members2.add("Geri Halliwell");
        members2.add("Emma Bunton");

        MusicBand musicBand2 = new MusicBand("Spice Girls", 1980, members2);

        musicBand1.printMembers();
        musicBand2.printMembers();

        MusicBand.transferMembers(musicBand1, musicBand2);

        musicBand1.printMembers();
        musicBand2.printMembers();
    }
}