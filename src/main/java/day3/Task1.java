package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            String cityName = sc.next();
            if (!cityName.equalsIgnoreCase("stop")) {

                String country = "";
                switch (cityName) {

                    case "Москва":
                    case "Владивосток":
                    case "Ростов":
                        country = "Россия";
                        break;

                    case "Рим":
                    case "Милан":
                    case "Турин":
                        country = "Италия";
                        break;

                    case "Ливерпуль":
                    case "Манчестер":
                    case "Лондон":
                        country = "Англия";
                        break;

                    case "Берлин":
                    case "Мюнхен":
                    case "Кёльн":
                        country = "Германия";
                        break;

                    default:
                        System.out.println("Неизвестная страна");
                }
                System.out.println(country);
            } else {
                System.out.println("Введено слово stop, программа завершила работу");
                break;
            }
        }
        sc.close();
    }
}