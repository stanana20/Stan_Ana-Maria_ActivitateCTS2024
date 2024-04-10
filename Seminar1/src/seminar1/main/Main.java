package seminar1.main;

import seminar1.model.*;

import java.util.HashMap;

public class Main {
    public enum FeedType{
        OMNIVORE,
        HERBIVORE,
        CARNIVORE
    }

    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper("Ion");
        Zoo zoo = new Zoo("Zoo",zooKeeper,new HashMap<>());

        Animal anotherAnimal = new Zebra("Marty", 21);

        zoo.addAnimal(anotherAnimal, "grass");

        zoo.addAnimal(new Lion("Simba", 10), "Marty");

        zoo.addAnimal(new Pisica("Tom", 2), "pliculet");

        zoo.feedAllAnimals();

        FeedType feedType  = FeedType.CARNIVORE;
    }
}
