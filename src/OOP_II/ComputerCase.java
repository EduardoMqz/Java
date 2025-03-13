package OOP_II;

public class ComputerCase extends Product{
    private String powerSupply;

    public ComputerCase(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }
    public ComputerCase(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }
}
