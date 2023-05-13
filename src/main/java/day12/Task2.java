package day12;

import java.util.List;
import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(175);

       fillNumbers(31, 300, numbers);
        System.out.println(numbers);


    }

    public static void fillNumbers(int rangeCutStart, int rangeCutEnd, List<Integer> numbers) {
//        rangeCutStart = 31; - начало интервала, который не нужно добавлят в список;
//        rangeCutEnd = 300; - конец интервала, который не нужно добавлять в список;
        for (int i = 0; i <= 350; i++) {
            if ((i % 2 == 0)) {
                if (i > rangeCutStart && i < rangeCutEnd)
                    continue;
                numbers.add(i);
            }
        }
    }
}
