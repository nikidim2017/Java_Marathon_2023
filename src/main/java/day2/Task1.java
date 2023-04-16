package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stores = sc.nextInt();
        if (stores >= 1 && stores <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (stores >= 5 && stores <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (stores >= 9) {
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Ошибка ввода");
        }
        sc.close();
    }
}
