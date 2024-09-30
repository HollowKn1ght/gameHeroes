package task3.Classes;

import task3.Enemy;
import task3.Hero;

public class Mage extends Hero {
    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy){
        enemy.takeDamage(5);
        System.out.println("Mage " + getName() + " attack Enemy");
    }
}
