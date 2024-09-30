package task2;

import task2.Classes.*;

public class TrainingGround {
    public static void main(String[] args) {
        Hero hero = new Hero("Alex");
        hero.attackEnemy();

        System.out.println();

        Hero heroW = new Warrior("Bob");
        Hero heroM = new Mage("Gleb");
        Hero heroA = new Archer("Troy");
        heroW.attackEnemy();
        heroM.attackEnemy();
        heroA.attackEnemy();
    }
}