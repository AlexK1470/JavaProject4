package ZooSimulation;

public class Parrot extends Bird {

    public Parrot(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Parrot Chirps");
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("This is a Parrot");
    }
}
