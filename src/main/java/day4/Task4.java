package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10000);
            System.out.println(numbers[i] + " ");
        }

        int sum3 = 0;
        int maxSum = 0;
        int index = 0;

        for (int i = 0; i < numbers.length - 2; i++) {
            sum3 = numbers[i] + numbers[i + 1] + numbers[i + 2];

            if (sum3 > maxSum) {
                maxSum = sum3;
                index = i;
            }
        }
        System.out.println("Максимальная сумма: " + maxSum);
        System.out.println("Индекс: " + index);
    }
}


