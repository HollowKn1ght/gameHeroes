package task6;

public class Enemy implements Mortal {
    private int health;

    public Enemy(int health){
        this.health = health;
    }

    public void takeDamage(int damage){
        health -= damage;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
