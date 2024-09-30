package task7.enemiesFactory;

import task7.Enemy;

import java.util.Random;

public class RandomFactory implements Factory{
    Factory[] factories;
    Random rnd = new Random();

    public RandomFactory(Factory[] factories){
        this.factories = factories;
    }

    @Override
    public Enemy create() {
        int ind = rnd.nextInt(factories.length);
        return factories[ind].create();
    }
}
