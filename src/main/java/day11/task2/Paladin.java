package day11.task2;

public class Paladin extends Hero implements Healer {

    static final int HEALTH_Himself = 25;
    static final int HEALTH_Teammate = 20;

    public Paladin() {
        physAtt = 15;
        physDef = 0.5;
        magicDef = 0.2;
    }


    @Override
    public void healHimself() {
        if (health + HEALTH_Himself > MAX_HEALTH) {
            health = MAX_HEALTH;
        } else {
            health += HEALTH_Himself;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + HEALTH_Teammate > MAX_HEALTH) {
            hero.health = MAX_HEALTH;
        } else {
            hero.health += HEALTH_Teammate;
        }
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}