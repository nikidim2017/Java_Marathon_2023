package day9.Task2;

public class Triangle extends Figure {
    private double length_1;

    public Triangle(String color, double length_1, double length_2, double length_3) {
        super(color);
        this.length_1 = length_1;
        this.length_2 = length_2;
        this.length_3 = length_3;
    }

    private double length_2;
    private double length_3;


    @Override
    public double area() {
        double p = (length_1 + length_2 + length_3)/2;
        return Math.sqrt(p * (p - length_1) * (p - length_2) * (p - length_3));
    }

    @Override
    public double perimeter() {
        return length_1 + length_2 + length_3;
    }
}
