package task7.Classes;

import task7.Enemy;
import task7.Hero;

public class Warrior extends Hero {
    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy){
        System.out.println("Warrior " + getName() + " attack " + enemy.getName());
        enemy.takeDamage(3);
    }
}
