package task4.Classes;

import task4.Enemy;
import task4.Hero;

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
