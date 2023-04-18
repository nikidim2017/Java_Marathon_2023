package day5;


public class Task2 {
    public static void main(String[] args) {

        Motobike motobike = new Motobike("Yamaha", "Red", 2021);

        System.out.println(motobike.getModel() + ", " + motobike.getColor() + ", " + motobike.getManufactureYear());

    }
}
