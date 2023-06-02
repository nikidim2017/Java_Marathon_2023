package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        File file1 = new File("E:\\Head_First_IT\\Java\\JavaMarathon2021\\JavaMarathon2021\\file1.txt");
        File file2 = new File("E:\\Head_First_IT\\Java\\JavaMarathon2021\\JavaMarathon2021\\file2.txt");

        fillInFiles(file1, file2);
        printResult(file2);
    }

    public static void fillInFiles(File file1, File file2) { // method fills in file1 (with random numbers) and file2 (with arithmetic means based upon the random numbers taken from file1)

        try (PrintWriter pw1 = new PrintWriter(file1);
             PrintWriter pw2 = new PrintWriter(file2);
             Scanner sc = new Scanner(file1);
        ) {
            for (int i = 0; i < 1000; i++) {
                pw1.print((int) (Math.random() * 100) + " ");
            }
            pw1.close();
            String line = sc.nextLine();
            String[] string = line.split(" ");

            double numFile2 = 0;
            double average = 0;
            int numPortion = 20;

            int i = 0;
            while (i < string.length) {
                for (int j = i; j < i + numPortion; j++) {
                    numFile2 = Double.parseDouble(string[j]);
                    average += numFile2;
                }
                average /= numPortion;              // calculate the arithmetic mean (average) for group of 20 numbers of the Array "string"
                pw2.print(average + " ");           // writes down the arithmetic mean to file2
                i += numPortion;                    // goes to next portion of 20 elements contained in the array "string"
                average = 0;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void printResult(File file2) {  // method calculates the sum of averages from file 2 and prints it out to console

        try (Scanner sc = new Scanner(file2);
        ) {
            String line = sc.nextLine();
            String[] string = line.split(" ");

            double sum = 0;
            for (String num : string) {
                sum += Double.parseDouble(num);
            }
            System.out.println((int) sum);

        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }
    }
}


