package day6;

public class Task3 {
    public static void main(String[] args) {


        Airplane airplane = new Airplane("Boeing", 2018, 25, 120);

        System.out.println(airplane.fillUp(30));

        System.out.println(airplane.fillUp(25));

        airplane.info();

    }
}
