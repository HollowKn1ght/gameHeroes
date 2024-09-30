package task7.typesOfEnemies;

import task7.Enemy;
import task7.Hero;

public class Slime extends Enemy{
    public Slime(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(2);
        System.out.println(getName() + " attack " + hero.getName());
    }
}
