package Abstraction;

public interface FlightEnabled {
    void takeOff();

    void land();

    void fly(); 

    default FlightStages transition(FlightStages stage){
        System.out.println("transition not implemented on "+this.getClass().getName());
        return null;
    }

}
