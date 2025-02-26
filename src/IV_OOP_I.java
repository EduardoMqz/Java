import OP_I.Car;

public class IV_OOP_I {
    public static void main(String[] args) throws Exception {
        car();
    }

    public static void car(){
        Car car = new Car();
        car.setBrand("BMW");
        car.setColor("Red");
        car.setPrice(500_100);
        car.setYear(1960);
        car.start();
        car.accelerate();
        car.accelerate();
        car.stop();
        car.fullAccelerate();
        car.reduceVel();
        car.fullReduceVel();
        car.stop();
        car.reduceVel();
        car.stop();
        System.out.println("your " + car.getColor() + "car is great");
    }
}
