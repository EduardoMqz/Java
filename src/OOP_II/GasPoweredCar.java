package OOP_II;

public class GasPoweredCar extends Car{
    private double avgKilometerPerLiter;
    private int cylinders = 6;
    
    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKilometerPerLiter, int cylinders) {
        super(description);
        this.avgKilometerPerLiter = avgKilometerPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up, Ready%n", cylinders);
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> Usage exceeds the average: %.2f %n", avgKilometerPerLiter);
    }
    
    

}
