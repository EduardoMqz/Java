package Abstraction;

public class Furniture extends ProductForSale {
    public Furniture(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.printf("This %s was manufactured in north carolina%n", type);
        System.out.printf("The price of the piece is %6.2f %n", price);
        System.out.println(description);
    }

}
