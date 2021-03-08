package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(new MusicBand("Иванушки", 1996));            //1
        musicBands.add(new MusicBand("Backstreet Boys", 2000));     //2
        musicBands.add(new MusicBand("Lady GaGa", 2008));           //3
        musicBands.add(new MusicBand("Алла Пугачева", 1977));       //4
        musicBands.add(new MusicBand("София Ротару", 1983));        //5
        musicBands.add(new MusicBand("Beyoncé", 2003));             //6
        musicBands.add(new MusicBand("Spice Girls", 1997));         //7
        musicBands.add(new MusicBand("Britney Spears", 2005));      //8
        musicBands.add(new MusicBand("БИ-2", 2000));                //9
        musicBands.add(new MusicBand("Руки Вверх", 1995));          //10
        System.out.println(musicBands);

        Collections.shuffle(musicBands);
        System.out.println(musicBands);

        System.out.println(groupsAfter2000(musicBands));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> musicBands) {
        List<MusicBand> musicBands2 = new ArrayList<>();
        for (int i = 0; i < musicBands.size(); i++) {
            if (musicBands.get(i).getYear() > 2000) {
                musicBands2.add(musicBands.get(i));
            }
        }
        return musicBands2;
    }
}