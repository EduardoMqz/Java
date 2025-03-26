package Lists;

public record GroceryItems(String name, String type, int count) {
    public GroceryItems(String name){
        this(name, "Dairy", 1);
    }

    @Override
    public String toString(){
        return String.format("%d %s in %s", count, name.toUpperCase(),type);
    }

}
