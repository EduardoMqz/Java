package OOP_II;

public class SmartKitchen {
    private CoffeMaker brewMaster;
    private Refrigerator iceBox;
    private DishWasher dishWater;

    public SmartKitchen(){
        brewMaster = new CoffeMaker();
        iceBox = new Refrigerator();
        dishWater = new DishWasher();
    }

    public CoffeMaker getBrewMaster() {
        return brewMaster;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public DishWasher getDishWater() {
        return dishWater;
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean washerFlag){
        brewMaster.setHasWorkToDo(coffeeFlag);
        iceBox.setHasWorkToDo(fridgeFlag);
        dishWater.setHasWorkToDo(washerFlag);
    }

    public void doKitchenWork(){
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWater.doDishes();
    }

}
