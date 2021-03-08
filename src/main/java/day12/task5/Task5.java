package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Андрей Григорьев-апполонов", 43));
        members1.add(new MusicArtist("Кирил Андреев", 40));
        members1.add(new MusicArtist("Игорь Матвиенко", 65));

        MusicBand musicBand1 = new MusicBand("Иванушки", 1982, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Melanie С", 38));
        members2.add(new MusicArtist("Victoria  Beckham", 41));
        members2.add(new MusicArtist("Geri Halliwell", 36));
        members2.add(new MusicArtist("Emma Bunton", 40));

        MusicBand musicBand2 = new MusicBand("Spice Girls", 1980, members2);

        musicBand1.printMembers();
        musicBand2.printMembers();

        MusicBand.transferMembers(musicBand1, musicBand2);

        musicBand1.printMembers();
        musicBand2.printMembers();
    }
}