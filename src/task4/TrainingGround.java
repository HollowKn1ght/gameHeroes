package task4;

import task4.Classes.Archer;
import task4.Classes.Mage;
import task4.Classes.Warrior;

public class TrainingGround {
    public static void main(String[] args) {
        Enemy enemy = new Enemy(10);

        Hero heroW = new Warrior("Bob");
        Hero heroM = new Mage("Gleb");
        Hero heroA = new Archer("Troy");
        heroW.attackEnemy(enemy);
        heroM.attackEnemy(enemy);
        heroA.attackEnemy(enemy);
    }
}