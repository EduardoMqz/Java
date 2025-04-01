package Lists;

import java.util.ArrayList;

public class Bank {
    private String name;
    private  ArrayList<Customer> customers = new ArrayList<>(500);

    public Bank(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bank [name=" + name + ", customers=" + customers + "]";
    }

    private Customer getCustomer(String customerName){
        for (Customer customer : customers) {
            if(customer.name().equalsIgnoreCase(customerName)){
                return customer;
            }
        }
        System.out.printf("Customer (%s) wasn't found %n", customerName);
        return null;
    }

    public void addNewCustomer(String customerName, double initialDeposit){
        if(getCustomer(customerName) == null){
            Customer customer = new Customer(customerName, initialDeposit);
            customers.add(customer);
            System.out.println("New customer added: " + customer);
        }
    }

    public void addTransaction(String name, double trasanctionAmount){
        Customer customer = getCustomer(name);
        if(customer != null){
            customer.transactions().add(trasanctionAmount);
        }
    }

    public void printStatement(String customerName){
        Customer customer = getCustomer(customerName);
        if(customer == null){
            return;
        }
        System.out.println("-".repeat(30));
        System.out.println("customer name: "+ customer.name());
        System.out.println("Transaction: ");
        for (double d  : customer.transactions()) {
            System.out.printf("$%10.2f (%s)%n", d, d < 0 ? "debit" : "credit");
            
        }
    }
}
