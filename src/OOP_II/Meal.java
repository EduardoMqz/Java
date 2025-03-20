package OOP_II;

public class Meal{
    private Burger burger;
    private Item drink;
    private Item side;

    public Meal(String burgerType, String drink, String side) {
        if (burgerType.equalsIgnoreCase("deluxe")) {
            this.burger = new DeluxeBurger(burgerType, 60);
        }else{
            this.burger = new Burger(burgerType, 40);
        }
        this.drink = new Item("drink", drink, 25);
        this.side = new Item("side", side, 15);
    }

    public Meal(){
        this("regular", "coke", "fries");
    }

    public double getTotalPrice(){
        if(burger instanceof DeluxeBurger){
            return burger.getAdjustedPrice();
        }
        return side.getAdjustedPrice() + drink.getAdjustedPrice() + burger.getAdjustedPrice();
    }

    public void printItemizedList(){
        burger.printItem();
        if(burger instanceof DeluxeBurger){
            Item.printItem(drink.getName(), 0);
            Item.printItem(side.getName(), 0);
        }else{
            drink.printItem();
            side.printItem();
        }
        System.out.println("-".repeat(15));
        Item.printItem("TOTAL PRICE", getTotalPrice());
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3){
        burger.addToppings(extra1, extra2, extra3);
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3, String extra4, String extra5){
        if (burger instanceof DeluxeBurger db) {
            db.addToppings(extra1, extra2, extra3, extra4, extra5);
        }else{
            burger.addToppings(extra1, extra2, extra3);
        }
        
    }

    public void setDrinkSize(String size){
        drink.setSize(size);
    }

    

}
