package day11.task2;

public class Warrior extends Hero implements PhysAttack {


    public Warrior() {
        super(30, 0.8, 0);
    }


    @Override
    public String toString() {
        return "Warrior{" +
                "health = " + health +
                '}';
    }
}
