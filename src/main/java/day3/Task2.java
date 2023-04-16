package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = 0;
        while (i < 3) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();

            if (b != 0) {
                double quot = a / b;
                System.out.println(quot);
            } else {
                break;
            }
        }
        sc.close();
    }
}

