package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("day14_1");
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {

        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        String line = sc.nextLine();
        String[] stringNumbers = line.split("\\s+");

        if (stringNumbers.length != 10) {           // проверяем файл на количество цифр и выбрасываем исключение
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("Некорректный входной файл");
            }
        }

        int sum = 0;
        int[] numbers = new int[15];
        int i = 0;

        for (String num : stringNumbers) {
            numbers[i] = Integer.parseInt(num.replaceAll("[^-]\\D", ""));
            i++;
        }

        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);

        sc.close();
    }
}



