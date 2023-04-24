package day8;

public class Task1 {
    public static void main(String[] args) {

// МЕТОД КОКАТЕНАЦИИ ОБЫЧНЫХ СТРОК

        long startTime_1 = System.currentTimeMillis();

        String str;
        for (int i = 0; i <= 20000; i++) {
            str = i + " ";
            System.out.print(str);

        }
        System.out.println();
        long stopTime_1 = System.currentTimeMillis();


        // МЕТОД STRINGBUILDER

        long startTime_2 = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 20000; i++) {
            sb.append(i).append(" ");
        }
        System.out.print(sb);

        System.out.println();
        long stopTime_2 = System.currentTimeMillis();

        System.out.println("Длительность работы в первом методе, в мс.: " + (stopTime_1 - startTime_1));
        System.out.println("Длительность работы во втором методе, в мс.: " + (stopTime_2 - startTime_2));

    }
}
