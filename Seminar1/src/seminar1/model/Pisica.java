package seminar1.model;

public class Pisica extends Animal{

    public Pisica(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(String food) {
        System.out.println("The pet cat "+this.getName()+" eats "+food);
    }
}
