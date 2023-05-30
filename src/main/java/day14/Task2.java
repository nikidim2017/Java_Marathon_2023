package day14;

import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("day14_2");
        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file) {

        List<String> nameAge = new ArrayList<>();
        List<String> persons = new ArrayList<>();
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            String line;
            while (sc.hasNextLine()) {
                line = sc.nextLine();
                nameAge.addAll(Arrays.asList(line.split("\\s+")));        // преобразуем текст файла в массив строк
            }

            List<Integer> ages = new ArrayList<>();
            String age;
            for (int i = 1; i < nameAge.size(); i += 2) {
                age = nameAge.get(i);
                ages.add(Integer.parseInt(age.replaceAll("[^-]\\D", " ")));  // заполняем новый ArrayList значениями возраста типа int
            }

            for (Integer j : ages) {                                                        // проверяем возвраст на отрицательное значение
                if (j < 0) {
                    throw new IllegalArgumentException();
                }
            }

            for (int k = 0; k < nameAge.size(); k += 2) {
                persons.add(nameAge.get(k) + " " + nameAge.get(k + 1));              // заполняем новый ArrayList persons строками для последующего вывода в формате: [Mike 24, John 19, Anna 20, Miguel 5], без разделения имени и возраста запятой
            }

            return persons;

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        } finally {
            if (sc != null){
                sc.close();
            }
        }
        return null;
    }
}



