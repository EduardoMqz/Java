package Lists;

public record GroceryItems(String name, String type, int count) {
    public GroceryItems(String name){
        this(name, "Dairy", 1);
    }

}
