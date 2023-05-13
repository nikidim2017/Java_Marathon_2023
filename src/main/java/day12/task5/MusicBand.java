package day12.task5;

import java.util.List;

public class MusicBand {

    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public static void transferMembers(MusicBand A, MusicBand B) {
        B.getMembers().addAll(A.getMembers());
        A.getMembers().removeAll(A.getMembers());
    }

    public static void printMembers(MusicBand A, MusicBand B) {
        System.out.println("Участники группы " + A.getName() + ": " + A.getMembers());
        System.out.println("Участники группы " + B.getName() + ": " + B.getMembers());
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", musicArtist=" + members +
                '}';
    }
}
