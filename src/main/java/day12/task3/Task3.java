package day12.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        List<MusicBand> bands = new ArrayList<>();

        MusicBand band_1 = new MusicBand("Red Hot Chili Peppers", 1983);
        MusicBand band_2 = new MusicBand("ABBA", 1972);
        MusicBand band_3 = new MusicBand("Kino", 1989);
        MusicBand band_4 = new MusicBand("Nirvana", 1987);
        MusicBand band_5 = new MusicBand("Queen", 1973);
        MusicBand band_6 = new MusicBand("The Rolling Stones", 1962);
        MusicBand band_7 = new MusicBand("The Killers", 2001);
        MusicBand band_8 = new MusicBand("Paramore", 2004);
        MusicBand band_9 = new MusicBand("Arctic Monkeys", 2002);
        MusicBand band_10 = new MusicBand("The Growlers", 2006);

        bands.addAll(Arrays.asList(band_1, band_2, band_3, band_4, band_5, band_6, band_7, band_8, band_9, band_10));

        Collections.shuffle(bands);

        System.out.println("Список со всеми группами: " + bands);
        System.out.println("-------------------------------------------");
        groupsAfter2000(bands);
        System.out.println("Список групп после 2000 года: " + groupsAfter2000(bands));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {

        List<MusicBand> groupsAfter2000 = new ArrayList<>();
        for (MusicBand band : bands) {
            if ((band.getYear()) > 2000) {
                groupsAfter2000.add(band);
            }
        }
        return groupsAfter2000;
    }
}
