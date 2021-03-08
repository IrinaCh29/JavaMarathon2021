package day11.task2;

public class Paladin extends Hero implements Healer {

    static final int HEALTH_PLUS_1 = 25;
    static final int HEALTH_PLUS_2 = 20;

    public Paladin() {
        physAtt = 15;
        physDef = 0.5;
        magicDef = 0.2;
    }

    @Override
    public void healHimself() {
        if (health + HEALTH_PLUS_1 > MAX_HEALTH) {
            health = MAX_HEALTH;
        } else {
            health += HEALTH_PLUS_1;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + HEALTH_PLUS_2 > MAX_HEALTH) {
            hero.health = MAX_HEALTH;
        } else {
            hero.health += HEALTH_PLUS_2;
        }
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}