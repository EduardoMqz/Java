package OOP_II;

public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Car -> Engine started");
    }
    
    protected void runEngine(){
        System.out.println("Car -> Engine running");
    }

    public void drive(){
        System.out.println("Car -> Driving, type is " + getClass().getSimpleName());
        runEngine();
    }

}
