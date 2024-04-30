package ZooSimulation;

public abstract class Animal implements AnimalBehavior {

    @Override
    public void sleep() {
        System.out.println("Animal is Sleeping");
    }

    public abstract void displayInformation();


}
