package OOP_II;

public class PersonalComputer extends Product{
    private ComputerCase computerCase;
    private Monitor monitor;
    private MotherBoard motherboard;
    
    public PersonalComputer(String model, String manufacturer, ComputerCase computerCase, Monitor monitor,
    MotherBoard motherboard) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    private void drawLogo(){
        monitor.drawPixelAt(1200, 50, "Red");
    }

    public void powerUp(){
        computerCase.pressPowerButton();
        drawLogo();
    }



    /*
    public ComputerCase getComputercase() {
        return computerCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public MotherBoard getMotherboard() {
        return motherboard;
    }
        */


}
