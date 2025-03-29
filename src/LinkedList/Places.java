package LinkedList;

public record Places(String name, int distance){

    @Override
    public String toString(){
        return String.format("%s (%d)", name.toUpperCase(),distance);
    }
}
