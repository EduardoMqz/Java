package OOP_II;

public class MotherBoard extends Product {
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public MotherBoard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public MotherBoard(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public void loadProgram(String programName){
        System.out.println("Program " + programName + " is now loading...");
    }

}
