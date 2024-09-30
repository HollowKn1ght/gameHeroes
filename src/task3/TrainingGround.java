package task3;

import task3.Classes.Archer;
import task3.Classes.Mage;
import task3.Classes.Warrior;

public class TrainingGround {
    public static void main(String[] args) {
        Enemy enemy = new Enemy(10);

        Hero hero = new Hero("Alex");
        hero.attackEnemy(enemy);

        System.out.println();

        Hero heroW = new Warrior("Bob");
        Hero heroM = new Mage("Gleb");
        Hero heroA = new Archer("Troy");
        heroW.attackEnemy(enemy);
        heroM.attackEnemy(enemy);
        heroA.attackEnemy(enemy);
    }
}