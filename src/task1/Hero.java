package task1;

public class Hero {
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    public void attackEnemy() {
        System.out.println("Hero " + getName() + " attack Enemy");
    }

    public String getName() {
        return name;
    }
}
