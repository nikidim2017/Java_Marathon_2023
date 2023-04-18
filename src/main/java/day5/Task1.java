package day5;

public class Task1 {
    public static void main(String[] args) {

        Automobile automobile = new Automobile();
        automobile.setColor("Black");
        automobile.setModel("Toyota");
        automobile.setManufactureYear(2020);

        System.out.println(automobile.getColor());
        System.out.println(automobile.getModel());
        System.out.println((automobile.getManufactureYear()));

    }
}
