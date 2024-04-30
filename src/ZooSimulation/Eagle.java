package ZooSimulation;

public class Eagle extends Bird {

    public Eagle(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Eagle Screeches");
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("This is a Eagle");
    }
}
