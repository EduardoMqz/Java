import OOP_I.BankAccount;
import OOP_I.Car;
import OOP_I.Customer;
import OOP_I.Student;

public class IV_OOP_I {
    public static void main(String[] args) throws Exception {
        car();
        bankAccount();
        bankAccountConstructor();
        constructorChaining();
        constructorChallenge();
        pojoClass();
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

    public static void bankAccountConstructor(){
        BankAccount allenAccount = new BankAccount(1578,1556,"Allen Walker","aWalker@mail.com","13045714825");
        allenAccount.withdrawingFunds(500);
        allenAccount.depositFunds(250);
        allenAccount.depositFunds(1500);
        allenAccount.withdrawingFunds(500.33);
    } 
    
    public static void constructorChaining(){
        BankAccount noAccount = new BankAccount();
        noAccount.withdrawingFunds(50);
        noAccount.depositFunds(250);
        noAccount.withdrawingFunds(150);
        noAccount.depositFunds(1500);
        noAccount.withdrawingFunds(500.33);
    }

    public static void constructorChallenge(){
        Customer noCustomer = new Customer();
        System.out.printf("The customer %s credit limit is %s%n",noCustomer.getName(),noCustomer.getCreditLimit());
        Customer noCreditCustomer = new Customer("Carlos Perez", "cPerez@mail.com");
        System.out.printf("The customer %s credit limit is %s%n",noCreditCustomer.getName(),noCreditCustomer.getCreditLimit());
        Customer customer = new Customer("Juan Flores",500,"jperez@mail.com");
        System.out.printf("The customer %s credit limit is %s%n",customer.getName(),customer.getCreditLimit());
    } 
    
    public static void pojoClass(){
        for (int i = 1; i <= 5; i++) {
            Student s = new Student("L25480"+i, 
            switch(i){
                case 1 -> "Mary";
                case 2 -> "Carol";
                case 3 -> "Albert";
                case 4 -> "Karla";
                case 5 -> "Alma";
                default -> "Default Name";
            },"25/11/17", 
            "Fundament of java");
            System.out.println(s);
        }

        
    }


}
