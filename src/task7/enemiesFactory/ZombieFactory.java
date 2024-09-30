package task7.enemiesFactory;

import task7.Enemy;
import task7.typesOfEnemies.Zombie;

public class ZombieFactory implements Factory{
    @Override
    public Enemy create() {
        return new Zombie("Zombie", 20);
    }
}
