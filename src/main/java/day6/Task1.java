package day6;

import day5.Car;
import day5.Motorbike;

public class Task1 {
    public static void main(String[] args) {

        Car car = new Car();
        car.setModel("Subaru");
        car.setColor("White");
        car.setManufactureYear(2017);

        car.info();
        System.out.println("Разница, лет: " + car.yearDifference(2022));

        Motorbike motorbike = new Motorbike("Suzuki", "Red", 2018);

        motorbike.info();
        System.out.println("Разница, лет: " + motorbike.yearDifference(2016));
    }
}
