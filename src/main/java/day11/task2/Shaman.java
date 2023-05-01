package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer {
    private int magicAtt;

    public Shaman() {
        super(10, 0.2, 0.2);
        magicAtt = 15;
    }

    public int healHimself() {
        health += 50;
        if (health > MAX_HEALTH) {
            return health = MAX_HEALTH;
        } else {
            return health;
        }
    }

    public int healTeammate(Hero hero) {
        hero.health += 30;
        if (hero.health > MAX_HEALTH) {
            return hero.health = MAX_HEALTH;
        } else {
            return hero.health;
        }
    }

    @Override
    public int magicalAttack(Hero hero) {
        hero.health -= (magicAtt - (int) (hero.magicDef * magicAtt));
        if (hero.health < MIN_HEALTH) {
            return MIN_HEALTH;
        } else {
            return hero.health;
        }
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health = " + health +
                '}';
    }
}

