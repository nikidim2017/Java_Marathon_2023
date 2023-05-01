package day11.task2;

public abstract class Hero implements PhysAttack {

    public static final int MAX_HEALTH = 100;
    public static final int MIN_HEALTH = 0;
    protected int physAtt;
    protected double physDef;
    protected double magicDef;
    protected int health = MAX_HEALTH;

    public Hero(int physAtt, double physDef, double magicDef) {
        this.physAtt = physAtt;
        this.physDef = physDef;
        this.magicDef = magicDef;
    }

    public int physicalAttack(Hero hero) {
        hero.health -= (physAtt - (int) (physAtt * hero.physDef));
        if (hero.health < MIN_HEALTH) {
            return hero.health = MIN_HEALTH;
        } else {
            return hero.health;
        }
    }
}

