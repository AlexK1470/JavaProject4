package ZooSimulation;

public class Lion extends Mammal {

    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Lion Roars");
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("This is a Lion");
    }


}
