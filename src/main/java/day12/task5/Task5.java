package day12.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {

        List<MusicArtist> musicArtist_A = new ArrayList<>(Arrays.asList(new MusicArtist("Sir Brian May", 25), new MusicArtist("Freddie Mercury", 34), new MusicArtist("Roger Taylor", 32), new MusicArtist("John Deacon", 41)));
        List<MusicArtist> musicArtist_B = new ArrayList<>(Arrays.asList(new MusicArtist("Ronnie Wood", 29), new MusicArtist("Mick Jagger", 36), new MusicArtist("Keith Richards", 28), new MusicArtist("Charlie Watts", 37)));

        MusicBand A = new MusicBand("Queen", 1973, musicArtist_A);
        MusicBand B = new MusicBand("The Rolling Stones", 1962, musicArtist_B);

        System.out.println("Состав участников ДО слияния:");
        MusicBand.printMembers(A, B);

        MusicBand.transferMembers(A, B);

        System.out.println("Состав участников ПОСЛЕ слияния:");
        MusicBand.printMembers(A, B);

    }
}
