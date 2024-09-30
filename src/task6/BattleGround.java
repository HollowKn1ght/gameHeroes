package task6;

import task6.Classes.Archer;
import task6.Classes.Mage;
import task6.Classes.Warrior;

public class BattleGround {
    public static void main(String[] args) {
        Enemy slime = new Enemy(10);

        Hero mainHero = new Mage("Bob");

        while (slime.isAlive()){
            mainHero.attackEnemy(slime);

            if(slime.isAlive()){
                System.out.println("Enemy is still alive");
            } else {
                System.out.println("Enemy was defeated");
            }

            System.out.println();
        }
    }
}
