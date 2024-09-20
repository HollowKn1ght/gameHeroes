package task2.Classes;

import task2.Hero;

public class Warrior extends Hero {
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(){
        System.out.println("Warrior " + getName() + " attack Enemy");
    }
}
