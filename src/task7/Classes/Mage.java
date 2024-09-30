package task7.Classes;

import task7.Enemy;
import task7.Hero;

public class Mage extends Hero {
    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy){
        System.out.println("Mage " + getName() + " attack " + enemy.getName());
        enemy.takeDamage(5);
    }
}
