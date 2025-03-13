import OOP_II.ComputerCase;
import OOP_II.Monitor;
import OOP_II.MotherBoard;
import OOP_II.PersonalComputer;
import OOP_II.SmartKitchen;


public class V_OOP_II {
    public static void main(String[] args) throws Exception {
        composition();
        compositionChallenge();
       

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

}
