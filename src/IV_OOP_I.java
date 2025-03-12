import OOP_I.Animal;
import OOP_I.BankAccount;
import OOP_I.Car;
import OOP_I.Customer;
import OOP_I.Dog;
import OOP_I.LPAStudent;
import OOP_I.SalariedEmployee;
import OOP_I.Student;

public class IV_OOP_I extends Object {
    public static void main(String[] args) throws Exception {
        car();
        bankAccount();
        bankAccountConstructor();
        constructorChaining();
        constructorChallenge();
        pojoClass();
        javaRecords();
        Animal animal = new Animal("Generic animal", "Huge", 400);
        doAnimalStuff(animal, "Slow");
        Dog dog = new Dog();
        doAnimalStuff(dog, "Fast");
        Dog yorkie = new Dog("Yorkie", 15);
        doAnimalStuff(yorkie, "Fast");
        Dog retriever = new Dog("Labrador", 65, "Flooppy", "Swimmer");
        doAnimalStuff(retriever, "slow");
        Dog wolf = new Dog("Wolf", 40);
        doAnimalStuff(wolf, "fast");
        inheritanceChallenge();
        textBlock();
        stringMethods("This world is mine");
        stringMethods("");
        stringMethods("\t \n");
        stringManipulation();
        String helloWorld = "Hello " + "world";
        helloWorld.concat("and goodbye");
        StringBuilder helloWorldBuilder =new StringBuilder("Hello " + "world ") ;
        helloWorldBuilder.append("and goodbye");
        stringBuilder(helloWorld);
        stringBuilder(helloWorldBuilder);
        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(57));
        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(17));
        stringBuilder(emptyStart);
        stringBuilder(emptyStart32);
        StringBuilder builderPlus =new StringBuilder("Hello " + " world") ;
        builderPlus.append("and goodbye");
        builderPlus.deleteCharAt(16).insert(16, 'ñ');
        System.out.println(builderPlus);
        builderPlus.replace(16, 17, "G");
        System.out.println(builderPlus);
        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);
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

    public static void javaRecords(){
        for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("L25480"+i, 
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
            System.out.printf("%s is taking %s%n",s.name(),s.classList());
        }
    }

    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _ _ ");  
    }

    public static void inheritanceChallenge(){
        SalariedEmployee anna = new SalariedEmployee("Anna", "2010", "2085", 45876249, "2040", 1005090, true);
        anna.getAge();
        anna.collectPay();
        anna.terminate("2050");
        anna.retire();
    }

    public static void textBlock(){
        String bulletId = "Print a bullet list:\n"+
        "\t\u2022 First point\n"+
        "\t\t\u2022 Sub point";
        System.out.println(bulletId);
        String textBlock = """
                Print a bulleted List:
                    \u2022 first point
                        \u2022 sub point""";
        System.out.println(textBlock);
    }

    public static void stringMethods(String information){
        int length = information.length();
        System.out.printf("Length = %d %n", length);
        if(information.isEmpty()){
            System.out.println("Empty string");
            return;
        }
        if (information.isBlank()) {
            System.out.println("Blank string");
            return;
        }
        System.out.printf("First char = %c %n",information.charAt(0));
        System.out.printf("Last char = %c %n",information.charAt(length - 1));
        System.out.printf("Index of e = %d %n",information.indexOf('e'));
        System.out.printf("Index of l = %d %n",information.indexOf('l'));
        System.out.printf("Last index of l = %d %n",information.lastIndexOf('l'));
        System.out.printf("Index of 'is' = %d %n",information.indexOf("mine"));
        String inforationUpper = information.toUpperCase();
        if (information.equals(inforationUpper)) {
            System.out.println("values match exactly");
        }
        if (information.equalsIgnoreCase(inforationUpper)) {
            System.out.println("values match ignoring case");
        }
        if(information.startsWith("This")){
            System.out.println("String starts with 'This'");
        }
        if(information.endsWith("mine")){
            System.out.println("String starts with 'mine'");
        }
        if(information.contains("world")){
            System.out.println("String contains 'world'");
        }
    }

    public static void stringManipulation(){
        String birthDate = "25/11/2025";
        int startingIndex = birthDate.indexOf("2025");
        System.out.println("starting index "+startingIndex);
        System.out.println("Birth year = "+birthDate.substring(startingIndex));
        System.out.println("Month = "+ birthDate.substring(3, 5));
        String newDate = String.join("/", "03","13","2025");
        System.out.println("newDate = "+ newDate);
        newDate = "03";
        newDate = newDate.concat("/");
        newDate = newDate.concat("14");
        newDate = newDate.concat("/");
        newDate = newDate.concat("2025");
        System.out.println("newDate = "+ newDate);
        newDate = "03"+"/"+"15"+"/"+"2025";
        System.out.println("newDate = "+ newDate);
        newDate = "03".concat("/").concat("16").concat("/").concat("2025");
        System.out.println("newDate = "+ newDate);
        System.out.println(newDate.replace('/', '-'));
        System.out.println(newDate.replace("2", "00"));
        System.out.println(newDate.replaceFirst("/", "--"));
        System.out.println(newDate.replaceAll("/", "---"));
        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));
        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));
        System.out.println("    ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));
    }

    public static void stringBuilder(String string){
        System.out.println("String = " + string);
        System.out.println("Length = " + string.length());
    }

    public static void stringBuilder(StringBuilder builder){
        System.out.println("String = " + builder);
        System.out.println("Length = " + builder.length());
        System.out.println("Capacity = " + builder.capacity());

    }



}
