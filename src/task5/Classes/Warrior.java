package task5.Classes;

import task5.Enemy;
import task5.Hero;

public class Warrior extends Hero {
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy){
        enemy.takeDamage(3);
        System.out.println("Warrior " + getName() + " attack Enemy");
    }
}
