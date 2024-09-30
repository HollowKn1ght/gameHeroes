package task7.Classes;

import task7.Enemy;
import task7.Hero;

public class Archer extends Hero {
    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy){
        System.out.println("Archer " + getName() + " attack " + enemy.getName());
        enemy.takeDamage(4);
    }
}
