package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        Random rand = new Random();

        int[] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10000);
            System.out.println(numbers[i]);
        }

        int min = numbers[0];
        int max = numbers[0];
        int quantityZeroEnd = 0;
        int sumZeroEnd = 0;

        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            if (num % 10 == 0) {
                quantityZeroEnd++;
                sumZeroEnd += num;
            }
        }
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Количество элементов, оканчивающихся на 0: " + quantityZeroEnd);
        System.out.println("Сумма элементов, оканчивающихся на 0: " + sumZeroEnd);

    }
}
