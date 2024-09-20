package task2.Classes;

import task2.Hero;

public class Mage extends Hero {
    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(){
        System.out.println("Mage " + getName() + " attack Enemy");
    }
}
