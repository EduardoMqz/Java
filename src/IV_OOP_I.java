import OP_I.BankAccount;
import OP_I.Car;

public class IV_OOP_I {
    public static void main(String[] args) throws Exception {
        car();
        bankAccount();
    }

    public static void car(){
        Car car = new Car();
        car.setBrand("Honda");
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
        System.out.println("your " + car.getColor() + " car is great");
    }

    public static void bankAccount(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(11223366);
        bankAccount.setCustomerName("Allen Walker");
        bankAccount.setEmail("AWalker@bankAccount@gmail.com");
        bankAccount.setPhoneNumber("4863215687");
        bankAccount.setBalance(5);
        bankAccount.withdrawingFunds(500);
        bankAccount.depositFunds(250);
        bankAccount.depositFunds(1500);
        bankAccount.withdrawingFunds(500.33);
    }
}
