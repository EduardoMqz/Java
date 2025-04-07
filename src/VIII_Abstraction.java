import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import Abstraction.Animal;
import Abstraction.AnimalInterface;
import Abstraction.ArtObject;
import Abstraction.Bird;
import Abstraction.Dog;
import Abstraction.Fish;
import Abstraction.FlightEnabled;
import Abstraction.FlightStages;
import Abstraction.Furniture;
import Abstraction.Horse;
import Abstraction.Jet;
import Abstraction.Mammal;
import Abstraction.OrderItem;
import Abstraction.ProductForSale;
import Abstraction.Trackable;

public class VIII_Abstraction {
    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();
    public static void main(String[] args) {
        abstractionImplementation();
        abstractChallenge();
        interfacesImplementation();
        interfacesAbstractions();

    }

    public static void abstractionImplementation(){
        //Animal animal = new Animal("animal", "big", 100);
        Dog dog = new Dog("Wolf", "big", 100);
        dog.makeNoise();
        doAnimalStuff(dog);

        ArrayList<Animal> animal = new ArrayList<>();
        animal.add(dog);
        animal.add(new Dog("chihuahua", "small", 5));
        animal.add(new Fish("goldfish", "small", 1));
        animal.add(new Fish("barracuda", "bif", 10));
        animal.add(new Horse("Clydesdale", "large", 100));
        for (Animal individualAnimal : animal) {
            doAnimalStuff(individualAnimal);
            if(individualAnimal instanceof Mammal currentMammal){
                currentMammal.shewdHair();
            }
        }

    }

    public static void doAnimalStuff(Animal animal){
        animal.makeNoise();
        animal.move("fast");
    }

    public static void abstractChallenge(){
        storeProducts.add(new ArtObject("Oil pinting", 2450, "Impressionistic work by ABF painted in 1820"));
        storeProducts.add(new ArtObject("Sculpture", 5470, "Bronze work by HFK, produced in 1850"));
        storeProducts.add(new Furniture("Desk", 4724, "Mahogany Desk"));
        storeProducts.add(new Furniture("Lamp", 3470, "Tiffany lamp"));

        listProducts();

        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addItemToORder(order1, 1, 2);
        addItemToORder(order1, 0, 1);
        printOrder(order1);

        System.out.println("\nOrder 2");
        var order2 = new ArrayList<OrderItem>();
        addItemToORder(order2, 3, 5);
        addItemToORder(order2, 2, 2);
        addItemToORder(order2, 3, 1);
        printOrder(order2);
    }

    public static void listProducts(){
        for (var item : storeProducts) {
            System.out.println("-".repeat(25));
            item.showDetails();
        }
    }

    public static void addItemToORder(ArrayList<OrderItem> order, int orderIndex, int qty){
        order.add(new OrderItem(15, storeProducts.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order){
        double salesTotal = 0;
        for (var item : order) {
            item.product().printPricedItem(item.qty());
            salesTotal += item.product().getSalesPrice(item.qty());
        }
        System.out.printf("Sales total: $%6.2f %n", salesTotal);
    }

    public static void interfacesImplementation(){
        Bird bird = new Bird();
        AnimalInterface animal = bird;
        FlightEnabled flier = bird;
        Trackable trached = bird;

        animal.move(); 
        //flier.move();
        //trached.move();
        flier.takeOff();
        flier.fly();
        flier.land();

        inFlight(flier);
        inFlight(new Jet());
    }

    public static void inFlight(FlightEnabled flier){
        System.out.println("-".repeat(10) + "inFlight" + "-".repeat(10));
        flier.takeOff();
        flier.transition(FlightStages.LAUNCH);
        flier.fly();
        if(flier instanceof Trackable tracked){
            tracked.track();
        }
        flier.land();
    }

    public static void interfacesAbstractions(){
        Bird bird = new Bird();
        AnimalInterface animal = bird;
        FlightEnabled flier = bird;
        Trackable trached = bird;

        LinkedList<FlightEnabled> fliers = new LinkedList<>();
        fliers.add(bird);
        List<FlightEnabled> betterFliers = new LinkedList<>();
        betterFliers.add(bird);

        triggerFliers(fliers);
        flyFliers(fliers);
        landFliers(fliers);
        triggerFliers(betterFliers);
        flyFliers(betterFliers);
        landFliers(betterFliers);


    }

    public static void triggerFliers(List<FlightEnabled> fliers){
        for (var flier : fliers) {
            flier.takeOff();
        }
    }

    public static void flyFliers(List<FlightEnabled> fliers){
        for (var flier : fliers) {
            flier.fly();
        }
    }

    public static void landFliers(List<FlightEnabled> fliers){
        for (var flier : fliers) {
            flier.land();
        }
    }

}
