package task3.Classes;

import task3.Enemy;
import task3.Hero;

public class Archer extends Hero {
    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy){
        enemy.takeDamage(4);
        System.out.println("Archer " + getName() + " attack Enemy");
    }
}
