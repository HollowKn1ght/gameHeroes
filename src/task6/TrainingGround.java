package task6;

import task6.Classes.Archer;
import task6.Classes.Mage;
import task6.Classes.Warrior;

public class TrainingGround {
    public static void main(String[] args) {
        Enemy enemy = new Enemy(10);

        Hero heroW = new Warrior("Bob");
        Hero heroM = new Mage("Gleb");
        Hero heroA = new Archer("Troy");
        heroW.attackEnemy(enemy);
        heroM.attackEnemy(enemy);
        heroA.attackEnemy(enemy);

        System.out.println();

        if(enemy.isAlive()){
            System.out.println("Enemy is still alive");
        } else {
            System.out.println("Enemy was defeated");
        }
    }
}