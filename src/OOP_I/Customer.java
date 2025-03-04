package OOP_I;

public class Customer {
    private String name;
    private int creditLimit;
    private String email;

    public Customer(String name, String email) {
        this(name, 1550, email);
    }
    public Customer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
    public Customer(){
        this("Default Name", 1000, "defaultMail@mail.com");
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }
    
    public String getEmail() {
        return email;
    }

}
