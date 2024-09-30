package task3;

public class Hero {
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(1);
        System.out.println("Hero " + getName() + " attack Enemy");
    }

    public String getName() {
        return name;
    }
}
