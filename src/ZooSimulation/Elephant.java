package ZooSimulation;

public class Elephant extends Mammal {

    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Elephant Trumpets");
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("This is a Elephant");
    }
}
