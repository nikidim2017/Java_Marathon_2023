package day11.task2;

public class Paladin extends Hero implements Healer, PhysAttack {


    public Paladin() {
        super(15, 0.5, 0.2);
    }

    public int healHimself() {
        health += 25;
        if (health > MAX_HEALTH) {
            return health = MAX_HEALTH;
        } else {
            return health;
        }
    }

    public int healTeammate(Hero hero) {
        hero.health += 10;
        if (hero.health > MAX_HEALTH) {
            return hero.health = MAX_HEALTH;
        } else {
            return hero.health;
        }
    }


    @Override
    public String toString() {
        return "Paladin{" +
                "health = " + health +
                '}';
    }
}
