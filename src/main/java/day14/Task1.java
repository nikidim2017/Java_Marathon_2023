package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("day141");
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {

        Scanner sc = null;
        try {
            sc = new Scanner(file);

            String line = sc.nextLine();
            String[] stringNumbers = line.split("\\s+");

            int[] numbers = new int[30];

            int i = 0;
            while (i < stringNumbers.length) {
                numbers[i] = Integer.parseInt(stringNumbers[i].replaceAll("[^-]\\D", ""));
                i++;
            }
            if (i != 10) {              // проверяем количество цифр в новом массиве типа int, в котором устранены лишние пробелы и запятые
                throw new IllegalArgumentException();
            }

            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            System.out.println(sum);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}







