package OOP_II;

public class Meal{
    private Burger burger;
    private Item drink;
    private Item side;

    public Meal(String burgerType, String drink, String side) {
        this.burger = new Burger(burgerType, 40);
        this.drink = new Item("drink", drink, 25);
        this.side = new Item("side", side, 15);
    }

    public Meal(){
        this("regular", "coke", "fries");
    }

    public double getTotalPrice(){
        return side.getAdjustedPrice() + drink.getAdjustedPrice() + burger.getAdjustedPrice();
    }

    public void printItemizedList(){
        burger.printItem();
        drink.printItem();
        side.printItem();
        System.out.println("-".repeat(15));
        Item.printItem("TOTAL PRICE", getTotalPrice());
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3){
        burger.addToppings(extra1, extra2, extra3);
    }

    public void setDrinkSize(String size){
        drink.setSize(size);
    }

    

}
