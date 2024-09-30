package task7.typesOfEnemies;

import task7.Enemy;
import task7.Hero;

import java.util.Random;

public class Skeleton extends Enemy{
    public Skeleton(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(4);
        System.out.println(getName() + " attack " + hero.getName());
    }

    @Override
    public void takeDamage(int damage) {
        Random rnd = new Random();
        if (rnd.nextBoolean())
            super.takeDamage(damage);
        else
            System.out.println(getName() + " parry attack");
    }
}
