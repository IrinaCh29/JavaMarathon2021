package day11.task2;

public class Shaman extends Hero implements MagicAttack,Healer{

    static final int HEALTH_PLUS_1 = 50;
    static final int HEALTH_PLUS_2 = 30;
    private int magicAtt;

    public Shaman() {
        physAtt = 10;
        magicAtt = 15;
        physDef = 0.2;
        magicDef = 0.2;
    }

    @Override
    public void magicalAttack(Hero hero) {
        double attack = magicAtt * (1 - hero.magicDef);
        if (hero.health - attack < MIN_HEALTH){
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= attack;
        }
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
}