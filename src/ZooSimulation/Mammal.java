package ZooSimulation;

public class Mammal extends Animal {

    protected String name;
    protected int age;

    public Mammal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void displayInformation() {
        System.out.println("Mammal: " + name + " Age: " + age);
    }

    @Override
    public void eat() {
        System.out.println("Mammal is Eating");
    }

    @Override
    public void makeSound() {
        System.out.println("Mammal Sound");
    }
}
