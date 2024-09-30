package task7;

public abstract class Hero implements Mortal {
    private String name;
    private int health;
    private int dotCount;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public abstract void attackEnemy(Enemy enemy);

    public void takeDamage(int damage){
        health -= damage;
    }

    public void setNegativeEffectBleeding(int dotCount){
        this.dotCount = dotCount;
        System.out.println("Enemy applied bleeding to " + getName());
    }

    public void takeDOT(){
        if (dotCount != 0) {
            health--;
            System.out.println(getName() + " loses his life from bleeding");
            dotCount--;
        }
    }

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
