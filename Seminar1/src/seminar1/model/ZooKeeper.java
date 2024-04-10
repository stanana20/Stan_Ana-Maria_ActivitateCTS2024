package seminar1.model;

public class ZooKeeper {
    private String name;
    public void feedAnimal(Animal animal, String food){
        animal.eat(food);
    }
    public ZooKeeper(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
