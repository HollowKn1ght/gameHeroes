package task4.Classes;

import task4.Enemy;
import task4.Hero;

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
