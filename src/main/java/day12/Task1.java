package day12;
import java.util.List;
import java.util.ArrayList;
public class Task1 {
    public static void main(String[] args) {

       List<String> cars = new ArrayList<>(6);
       cars.add("Mercedes");
       cars.add("BMW");
       cars.add("Porsche");
       cars.add("Volkswagen");
       cars.add("Toyota");

       cars.add(2, "Subaru");
       cars.remove(0);

        System.out.println(cars);



    }
}
