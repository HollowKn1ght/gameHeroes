package task5.Classes;

import task5.Enemy;
import task5.Hero;

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
