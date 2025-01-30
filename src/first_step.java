public class first_step {
    public static void main(String[] args) throws Exception {
        helloWorld("World");
        variables();
        expressions();
        
    }

    public static void helloWorld(String name){
        System.out.printf("Hello %s%n",name);
    }

    public static void variables(){
        //Java keywords -> https://www.w3schools.com/java/java_ref_keywords.asp
        int myFirstNumber = 4;
        System.out.printf("Number %s%n",myFirstNumber);
        myFirstNumber = 10;
        System.out.printf("Number %s%n",myFirstNumber);
        myFirstNumber = 10 + 5;
        System.out.printf("Number %s%n",myFirstNumber);
        myFirstNumber = 10 + (5 + 2) * 10;
        System.out.printf("Number %s%n",myFirstNumber);
        myFirstNumber = 10 + 5 + 2 * 10;
        System.out.printf("Number %s%n",myFirstNumber);
    }

    public static void expressions(){
        int mySecondNumber = 3 * 4;
        int myThirdNumber = mySecondNumber - 6;
        System.out.printf("Number is %s%n",mySecondNumber);
        System.out.printf("Number is %s%n",myThirdNumber);
        int myTotal = myThirdNumber + mySecondNumber;
        int myLastOne = 1000 - myTotal;
        System.out.printf("Number is %s%n",myLastOne);

    }
}
