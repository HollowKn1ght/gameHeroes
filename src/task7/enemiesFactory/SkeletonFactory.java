package task7.enemiesFactory;

import task7.Enemy;
import task7.typesOfEnemies.Skeleton;

public class SkeletonFactory implements Factory{
    @Override
    public Enemy create() {
        return new Skeleton("Skeleton", 15);
    }
}
