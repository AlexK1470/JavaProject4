package ZooSimulation;

public class ZooSim {

    public static void main(String[] args) {

        Animal lion = new Lion("Simba", 5);
        Animal elephant = new Elephant("Dumbo", 10);
        Animal parrot = new Parrot("Polly", 2);
        Animal eagle = new Eagle("John", 3);

        System.out.println("--- Lion ---");
        lion.eat();
        lion.sleep();
        lion.makeSound();
        lion.displayInformation();

        System.out.println("\n--- Elephant ---");
        elephant.eat();
        elephant.sleep();
        elephant.makeSound();
        elephant.displayInformation();

        System.out.println("\n--- Parrot ---");
        parrot.eat();
        parrot.sleep();
        parrot.makeSound();
        parrot.displayInformation();

        System.out.println("\n--- Eagle ---");
        eagle.eat();
        eagle.sleep();
        eagle.makeSound();
        eagle.displayInformation();
    }
}