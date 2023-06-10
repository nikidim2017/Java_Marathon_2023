package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        File file = new File("day14_1");
        printResult(file);
    }

    public static void printResult(File file) {

        try (Scanner sc = new Scanner(file)) {

            String line = sc.nextLine();
            String[] stringNumbers = line.split("\\s+");

            int[] numbers = new int[20];
            int i = 0;
            int sum = 0;
            double average;
            while (i < stringNumbers.length) {
                numbers[i] = Integer.parseInt(stringNumbers[i].replaceAll("[^-]\\D", ""));
                sum += numbers[i];
                i++;
            }
            average = (double) sum / stringNumbers.length;
            System.out.printf(average + " --> " + "%.3f", average);

        } catch (
                FileNotFoundException ex) {
            System.out.println("Файл не найден");
        }
    }
}

