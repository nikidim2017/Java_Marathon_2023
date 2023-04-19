package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2018, 25, 120);

        airplane.info();

        airplane.setYear(2022);
        airplane.setLength(40);

        airplane.fillUp(100);
        airplane.info();

        airplane.fillUp(400);
        airplane.info();

    }
}
