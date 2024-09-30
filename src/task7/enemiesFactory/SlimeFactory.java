package task7.enemiesFactory;

import task7.Enemy;
import task7.typesOfEnemies.Slime;

public class SlimeFactory implements Factory{
    @Override
    public Enemy create() {
        return new Slime("Slime", 10);
    }
}
