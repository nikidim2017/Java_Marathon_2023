package day4;

import java.util.Random;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        Random rand = new Random();

        int[][] numbers = new int[12][8];

        int sum = 0;
        int maxSum = 0;
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = rand.nextInt(50);
                System.out.print(numbers[i][j] + " "); // выводим заполненную матрицу
                sum += numbers[i][j];
            }
            System.out.println("сумма: " + sum); // выводим суммы каждой строке, для наглядности
            System.out.println();

            if (sum > maxSum) {
                sum = maxSum;
                index = i;
            }
        }

        System.out.println("Индекс строки с максимальной суммой: " + index);
    }
}








