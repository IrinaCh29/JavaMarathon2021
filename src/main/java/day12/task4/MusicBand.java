package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public static void transferMembers(MusicBand a, MusicBand b) {
        b.getMembers().addAll(a.getMembers());
        a.clearMembers();
//        for (String member : a.getMembers()) {
//            b.getMembers().add(member);
//        }
//        a.getMembers().clear();
    }

    public void clearMembers() {
        this.members = new ArrayList<>();
    }

    public void printMembers() {
        for (int i = 0; i < this.members.size(); i++)
            System.out.println(this.members.get(i));
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}