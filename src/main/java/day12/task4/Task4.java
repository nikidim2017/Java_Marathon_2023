package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        List<String> members_A = new ArrayList<>();
        List<String> members_B = new ArrayList<>();

        MusicBand A = new MusicBand("Queen", 1973, members_A);
        MusicBand B = new MusicBand("The Rolling Stones", 1962, members_B);

        members_A.addAll(Arrays.asList("Sir Brian May", "Freddie Mercury", "Roger Taylor", "John Deacon"));
        members_B.addAll(Arrays.asList("Ronnie Wood", "Mick Jagger", "Keith Richards", "Charlie Watts"));

        System.out.println("Состав участников ДО слияния:");
        MusicBand.printMembers(A, B);

        MusicBand.transferMembers(A, B);

        System.out.println("Состав участников ПОСЛЕ слияния:");
        MusicBand.printMembers(A, B);
    }
}
