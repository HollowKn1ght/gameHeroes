package task7.enemiesFactory;

import task7.Enemy;
import task7.typesOfEnemies.Bat;

public class BatFactory implements Factory{
    @Override
    public Enemy create() {
        return new Bat("Bat", 10);
    }
}
