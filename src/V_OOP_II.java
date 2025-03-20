import java.util.Scanner;
import OOP_II.*;


public class V_OOP_II {
    public static void main(String[] args) throws Exception {
        composition();
        compositionChallenge();
        encapsulation();
        encapsulationChallenge();
        polymorphism();
        polymorphismChallengue();
        burgerRestaturant();

    }

    public static void composition(){
        ComputerCase computerCase = new ComputerCase("2208", "Dell");
        Monitor monitor = new Monitor("27 inch", "Accer", 27, "2540 x 1440");
        MotherBoard motherBoard = new MotherBoard("BJ-200", "Asus", 4, 6, "v2.44");
        PersonalComputer personalComputer = new PersonalComputer("2208", "Dell", computerCase, monitor, motherBoard);

        /*personalComputer.getMonitor().drawPixelAt(10, 15, "Red");
        personalComputer.getMotherboard().loadProgram("Windows OS");
        personalComputer.getComputercase().pressPowerButton();*/
        personalComputer.powerUp();
    }

    public static void compositionChallenge(){
        SmartKitchen kitchen = new SmartKitchen();
        kitchen.getDishWater().setHasWorkToDo(true);
        kitchen.getIceBox().setHasWorkToDo(true);
        kitchen.getBrewMaster().setHasWorkToDo(true);
        kitchen.getDishWater().doDishes();
        kitchen.getIceBox().orderFood();
        kitchen.getBrewMaster().brewCoffee();

        kitchen.setKitchenState(true, false, true);
        kitchen.doKitchenWork();
    }

    public static void encapsulation(){
        Player allen = new Player("Allen",200,"Sword");
        System.out.println("Initial health is: "+ allen.healthRemaining());
    }

    public static void encapsulationChallenge(){
        Printer print = new Printer(50, true);
        System.out.println("Initial page count = "+ print.getPagesPrinted());
        int pagesPrinted = print.printPages(5);
        System.out.printf("Current Job pages: %s Printer Total: %d %n", pagesPrinted, print.getPagesPrinted());
        pagesPrinted = print.printPages(10);
        System.out.printf("Current Job pages: %s Printer Total: %d %n", pagesPrinted, print.getPagesPrinted());
    }

    public static void polymorphism(){
        Movie theMovie = new Movie("Star wars");
        theMovie.watchMovie();
        Movie advMovie = new Adventure("Mickey 17");
        advMovie.watchMovie();
        Movie comMovie = new Comedy("Scary movie");
        comMovie.watchMovie();
        Movie getMovie = Movie.createMovie("Adventure","Chihiro");
        getMovie.watchMovie();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Type (A for adventure, C for Comedy or Q to quit): ");
            String type = scan.nextLine();
            if("Qq".contains(type)){
                break;
            }
            System.out.println("Enter movie title: ");
            String title = scan.nextLine();
            Movie addMovie = Movie.createMovie(type, title);
            addMovie.watchMovie();
            
        }
    }

    public static void polymorphismChallengue(){
        Car car = new Car("2022 Ferrari");
        runrace(car);
        System.out.println("---".repeat(10));
        Car integra = new GasPoweredCar("2025 acurre integra",15.4, 6);
        runrace(integra);
        System.out.println("---".repeat(10));
        Car byd = new ElectricCar("2025 Song pro",568,75);
        runrace(byd);

    }

    public static void runrace(Car car){
        car.startEngine();
        car.drive();
    }

    public static void burgerRestaturant(){
        Item coke = new Item("drink", "coke", 15);
        coke.printItem();
        coke.setSize("large");
        coke.printItem();
        System.out.println("*******".repeat(15));
        Item avocado = new Item("Topping", "Avocado", 10);
        avocado.printItem();
        System.out.println("*******".repeat(15));
        Burger burger = new Burger("regular", 50);
        burger.addToppings("bacon", "cheese", "mayo");
        burger.printItem();
        System.out.println("*******".repeat(15));
        Meal meal = new Meal();
        meal.printItemizedList();
        System.out.println("*******".repeat(15));
        Meal regularOrder = new Meal();
        regularOrder.addBurgerToppings("bacon", "cheese", "mayo");
        regularOrder.setDrinkSize("large");
        regularOrder.printItemizedList();
        System.out.println("*******".repeat(15));
        Meal secondMeal = new Meal("turkey", "7-up", "chili");
        secondMeal.addBurgerToppings("lettuce", "cheese", "bacon");
        secondMeal.setDrinkSize("large");
        secondMeal.printItemizedList();
        System.out.println("*******".repeat(15));
        Meal delBur = new Meal("deluxe","7-up","fries");
        delBur.addBurgerToppings("cheese", "bacon", "avocado","mayo","ham");
        delBur.setDrinkSize("small");
        delBur.printItemizedList();

        
    }

    


}
