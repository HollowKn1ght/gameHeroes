package task7.typesOfEnemies;

import task7.Enemy;
import task7.Hero;

public class Zombie extends Enemy {
    private boolean isRevive = false;
    private int maxHP;

    public Zombie(String name, int health) {
        super(name, health);
        maxHP = health;
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(4);
        System.out.println(getName() + " attack " + hero.getName());
    }

    @Override
    public boolean isAlive(){
        if(!isRevive){
            super.setHealth(maxHP);
            isRevive = true;
            System.out.println(getName() + " resurrected");
        }
        return super.getHealth() > 0;
    }
}
