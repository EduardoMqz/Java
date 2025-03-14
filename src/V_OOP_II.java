import OOP_II.Adventure;
import OOP_II.Comedy;
import OOP_II.ComputerCase;
import OOP_II.Monitor;
import OOP_II.MotherBoard;
import OOP_II.Movie;
import OOP_II.PersonalComputer;
import OOP_II.Player;
import OOP_II.Printer;
import OOP_II.SmartKitchen;


public class V_OOP_II {
    public static void main(String[] args) throws Exception {
        composition();
        compositionChallenge();
        encapsulation();
        encapsulationChallenge();
        polymorphism();

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
    }


}
