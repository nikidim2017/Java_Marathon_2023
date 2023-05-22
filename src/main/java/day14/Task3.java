package day14;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.io.File;

public class Task3 {
    public static void main(String[] args) {

        File file = new File("day14_3");
        System.out.println(parseFileToObjList(file));
    }

    public static List<Person> parseFileToObjList(File file) {

        List<Person> persons = new ArrayList<>();
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        List<String> nameAge = new ArrayList<>();
        String line = " ";

        if (sc != null) {
            while (sc.hasNextLine()) {
                line = sc.nextLine();
                nameAge.addAll(Arrays.asList(line.split("\\s+")));   // преобразуем текст файла в массив строк
            }

            for (int i = 0; i < nameAge.size(); i += 2) {
                Person person = new Person(nameAge.get(i), Integer.parseInt(nameAge.get(i + 1).replaceAll("[^-]\\D", " ")));
                persons.add(person);
            }


            for (Person p : persons) {        // проверяем возвраст на отрицательное значение
                if (p.getYear() < 0) {
                    try {
                        throw new IOException();
                    } catch (IOException e) {
                        System.out.println("Некорректный входной файл");
                        return null;
                    }
                }
            }
        }
        return persons;
    }
}


