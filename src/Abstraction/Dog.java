package Abstraction;

public class Dog extends Animal {

    public Dog(String type, String size, double weight){
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
       if(speed.equals("fast")){
        System.out.println("Running!!!");
       } else {
        System.out.println("Walking!!");
       }
        
    }

    @Override
    public void makeNoise() {
        if(type == "wolf"){
            System.out.println("Howling!");
        } else {
            System.out.println("Woof!");
        }
    }
}
