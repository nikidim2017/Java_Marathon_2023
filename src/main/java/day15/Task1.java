package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        writeIntoFile();
    }

    public static void writeIntoFile() {

        File readFile = new File("src/main/resources/shoes.csv");
        Scanner sc = null;

        try {
            sc = new Scanner(readFile);
            PrintWriter pw = new PrintWriter("src/main/resources/missing_shoes.txt", StandardCharsets.UTF_8);

            if (!sc.hasNextLine()) {
                throw new IllegalArgumentException();
            } else {
                String[] item;
                while (sc.hasNextLine()) {
                    String string = sc.nextLine();
                    item = string.split(";");
                    if (item.length == 3) {
                        for (String i : item) {
                            if (i.equals("0")) {
                                pw.println(Arrays.toString(item).replaceAll("^\\[|]$", ""));
                            }
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
            }
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (
                IllegalArgumentException e) {
            System.out.println("Пустой или некорректный файл");
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
