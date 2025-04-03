package Abstraction;

public class Fish extends Animal {

    public Fish(String type, String size, double weight){
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
       if(speed.equals("fast")){
        System.out.println("darting frantically!!!");
       } else {
        System.out.println("Lazy swimming!!");
       }
        
    }

    @Override
    public void makeNoise() {
        if(type == "goldfish"){
            System.out.println("swish!");
        } else {
            System.out.println("splash!");
        }
    }

}
