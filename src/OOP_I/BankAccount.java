package OOP_I;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this(63251,100, "Default Name", "Default address", "Default Phone");
        System.out.println("Empty Constructor");
    }

    public BankAccount(int accNumber, double balance, String cusName, String email, String phoneNumber){
        System.out.println("Account constructor with parameters called");
        accountNumber = accNumber;
        this.balance = balance;
        customerName = cusName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double deposit){
        balance += deposit;
        System.out.printf("%s's current balance is $%s%n",customerName,balance);
    }

    public void withdrawingFunds(double amount){
        if(balance - amount < 0){
            System.out.println("You are not allowed to withdraw money");
        }else{
            balance-= amount;
        }
        System.out.printf("%s's current balance is $%s%n",customerName,balance);
    }

}
