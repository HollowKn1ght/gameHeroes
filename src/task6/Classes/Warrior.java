package task6.Classes;

import task6.Enemy;
import task6.Hero;

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
