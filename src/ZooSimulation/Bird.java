package ZooSimulation;

public class Bird extends Animal {

    protected String name;
    protected int age;

    public Bird(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void displayInformation() {
        System.out.println("Bird: " + name + " Age: " + age);
    }

    @Override
    public void eat() {
        System.out.println("Bird is Eating");
    }

    @Override
    public void makeSound() {
        System.out.println("Bird Sound");
    }
}
