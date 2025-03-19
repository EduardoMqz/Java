package OOP_II;

public class ElectricCar extends Car {
    private double avgKilometerPerCharge;
    private int batterySize = 6;
    
    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double avgKilometerPerCharge, int batterySize) {
        super(description);
        this.avgKilometerPerCharge = avgKilometerPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    protected void runEngine() {
        System.out.printf("BEV -> -> Switch %d kWh battery on, Ready%n", batterySize);
    }

    @Override
    public void startEngine() {
        System.out.printf("BEV -> Usage under the average: %.2f %n", avgKilometerPerCharge);
    }
    
}
