package OP_I;

public class Car {
    private String brand;
    private String color;
    private int year;
    private int price;
    private static int velocity = 0;
    private static boolean isOn = false;
    private static int gas = 100;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getVelocity() {
        return velocity;
    }

    public static void setVelocity(int velocity) {
        Car.velocity = velocity;
    }

    public static boolean isOn() {
        return isOn;
    }

    public static void setOn(boolean isOn) {
        Car.isOn = isOn;
    }

    public static int getGas() {
        return gas;
    }

    public static void setGas(int gas) {
        Car.gas = gas;
    }

    public void start() {
        isOn = true;
        System.out.println("Engine started");
    }

    public void accelerate() {
        if (isOn) {
            velocity += 5;
            gas -= 5;
            System.out.printf("the car is going to %d km/h%n", velocity);
        } else {
            System.out.println("start your engine");
        }
    }

    public void fullAccelerate() {
        if (isOn) {
            velocity += 50;
            gas -= 20;
            System.out.printf("the car is going to %d km/h%n", velocity);
        } else {
            System.out.println("start your engine");
        }
    }

    public void reduceVel(){
        if (isOn) {
            velocity -= 5;
            gas -= 5;
            System.out.printf("the car is going to %d km/h%n", velocity);
        } else {
            System.out.println("start your engine");
        }
    }

    public void fullReduceVel(){
        if (isOn) {
            velocity -= 50;
            gas -= 5;
            System.out.printf("the car is going to %d km/h%n", velocity);
        } else {
            System.out.println("start your engine");
        }
    }

    public void stop(){
        if(velocity <= 0){
            System.out.println("Your car has stopped");
        }else{
            System.out.println("Reduce your speed to stop the car");
        }
    }

}
