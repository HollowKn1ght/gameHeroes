package task4;

public class Enemy {
    private int health;

    public Enemy(int health){
        this.health = health;
    }

    public void takeDamage(int damage){
        health -= damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
