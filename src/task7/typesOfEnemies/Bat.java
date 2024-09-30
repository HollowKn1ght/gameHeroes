package task7.typesOfEnemies;

import task7.Enemy;
import task7.Hero;

import java.util.Random;

public class Bat extends Enemy{
    public Bat(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(4);
        System.out.println(getName() + " attack " + hero.getName());

        Random rnd = new Random();
        if (rnd.nextBoolean()) {
            hero.setNegativeEffectBleeding(3);
        }
    }
}
