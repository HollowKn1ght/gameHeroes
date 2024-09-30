package task7;

import task7.Classes.Mage;
import task7.enemiesFactory.*;
import task7.typesOfEnemies.Bat;
import task7.typesOfEnemies.Skeleton;
import task7.typesOfEnemies.Slime;
import task7.typesOfEnemies.Zombie;

public class BattleGround {
    public static void main(String[] args) {
        RandomFactory factory = new RandomFactory(new Factory[]{
                new SlimeFactory(),
                new BatFactory(),
                new ZombieFactory(),
                new SkeletonFactory()
        });

        Hero mainHero = new Mage("Bob", 30);

        int countDefeatedEnemies = 0;

        while(true){
            Enemy enemy = factory.create();
            System.out.println(enemy.getName() + " gets in the way");
            while (enemy.isAlive() && mainHero.isAlive()){
                System.out.println("----battle summary----");

                mainHero.attackEnemy(enemy);
                enemy.attackHero(mainHero);
                mainHero.takeDOT();

                System.out.println("----------------------");

                if(enemy.isAlive()){
                    System.out.println(enemy.getName() + " is still alive");
                } else {
                    System.out.println(enemy.getName() + " was defeated");
                    countDefeatedEnemies++;
                }

                System.out.println("----------------------");
            }
            System.out.println();

            if(mainHero.isAlive()){
                System.out.println(mainHero.getName() + " is still alive and continues his adventure");
            } else {
                System.out.println(mainHero.getName() + " was defeated. During the whole adventure he defeated " + countDefeatedEnemies + " enemies");
                break;
            }

            System.out.println();
        }
    }
}
