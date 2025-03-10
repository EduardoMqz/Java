package OOP_I;

public class Worker {
    protected String name;
    private String birthDate;
    protected String endDate;
    


public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }


public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }


public int getAge(){
    int age = 2025 - Integer.parseInt(birthDate);
    System.out.println("Your age is" + age);
    return age;
}

public double collectPay(){
    System.out.println("You've collected "+ 8*15.12);
    return 8 * 15.12;
}

public void terminate(String endDate){
    System.out.printf("%s has been terminated on %s%n", name, endDate);

}



}