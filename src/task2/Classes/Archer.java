package task2.Classes;

import task2.Hero;

public class Archer extends Hero {
    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(){
        System.out.println("Archer " + getName() + " attack Enemy");
    }
}
