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
        int j = 0;
        int groupSize = 3; // Количество элементов в группе

        for (int i = 0; i < numbers.length - j; i++) { // элементы в группе суммируются через цикл
            while (j < groupSize) {
                sum3 = numbers[i + j];
                j++;
            }
            if (sum3 > maxSum) {
                maxSum = sum3;
            }
            index = i;
        }
        System.out.println("Максимальная сумма: " + maxSum);
        System.out.println("Индекс: " + index);
    }
}


