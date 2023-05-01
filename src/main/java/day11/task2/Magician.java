package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {

    private int magicAtt;

    public Magician() {
        super(5, 0, 0.8);
        magicAtt = 20;
    }

    public int magicalAttack(Hero hero) {
        hero.health -= (magicAtt - (int) (magicAtt * hero.magicDef));
        if (hero.health < MIN_HEALTH) {
            return MIN_HEALTH;
        } else {
            return hero.health;
        }
    }


    @Override
    public String toString() {
        return "Magician{" +
                "health = " + health +
                '}';
    }
}
