package task7;

public abstract class Enemy implements Mortal {
    private String name;
    private int health;

    public Enemy(String name, int health){
        this.name = name;
        this.health = health;
    }

    public void takeDamage(int damage){
        health -= damage;
    }

    public abstract void attackHero(Hero hero);

    public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
