package task5;

import task5.Classes.Archer;
import task5.Classes.Mage;
import task5.Classes.Warrior;

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