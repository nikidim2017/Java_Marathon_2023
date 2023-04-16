package day4;

import java.util.Random;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        Random rand = new Random();

        int[] numbers = new int[11];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10);
        }

        System.out.println(Arrays.toString(numbers));

        int numbersOver8 = 0;
        int numbersEqual1 = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;
        int numbersSum = 0;


        for (int num : numbers) {

            if (num > 8) {
                numbersOver8++;
            }

            if (num == 1) {
                numbersEqual1++;
            }

            if (num % 2 == 0) {
                evenNumbers++;
            }

            if (num % 2 != 0) {
                oddNumbers++;
            }

            numbersSum += num;
        }

        System.out.println();
        System.out.println("Длина массива: " + numbers.length);
        System.out.println("Количество чисел больше 8: " + numbersOver8);
        System.out.println("Количество чисел, равных 1: " + numbersEqual1);
        System.out.println("Количество четных чисел: " + evenNumbers);
        System.out.println("Количество нечетных чисел: " + oddNumbers);
        System.out.println("Сумма всех элементов массива: " + numbersSum);

    }
}


