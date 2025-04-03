package Abstraction;

public class Dog extends Mammal {

    public Dog(String type, String size, double weight){
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
       if(speed.equals("fast")){
        System.out.println(getExplicitType() + " Running!!!");
       } else {
        System.out.println(getExplicitType() + " Walking!!");
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

    @Override
    public void shewdHair() {
        System.out.println(getExplicitType() + "shed hair all the time");
    }
}
