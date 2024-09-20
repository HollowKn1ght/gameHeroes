package task6.Classes;

import task6.Enemy;
import task6.Hero;

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
