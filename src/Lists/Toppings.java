package Lists;

public enum Toppings {
    MUSTARD,
    PICKLES,
    BACON,
    CHEDDAR,
    TOMATO;

    public double getPrice(){
        return switch(this) {
            case BACON -> 1.15;
            case CHEDDAR -> 10.20;
            default -> 0.0;
        };
    }

}
