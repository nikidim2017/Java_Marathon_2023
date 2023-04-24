package day7;

public class Task1 {
    public static void main(String[] args) {

        Airplane airplaneA = new Airplane("Boeing", 2020, 40, 120);
        Airplane airplaneB = new Airplane("Airbus", 2018, 50, 130);

        airplaneA.setFuel(0);
        airplaneB.setFuel(0);

        airplaneA.fillUp(100);
        airplaneA.info();

        airplaneA.fillUp(50);
        airplaneA.info();

        airplaneB.fillUp(300);
        airplaneB.info();

        airplaneB.fillUp(20);
        airplaneB.info();


        Airplane.compareAirplanes(airplaneA, airplaneB);
    }
}