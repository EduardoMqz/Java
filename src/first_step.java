public class first_step {
    public static void main(String[] args) throws Exception {
        helloWorld("World");
        variables();
        expressions();
        primitiveTypes();
        wholeNumbers();

    }

    public static void helloWorld(String name) {
        System.out.printf("Hello %s%n", name);
    }

    public static void variables() {
        // Java keywords -> https://www.w3schools.com/java/java_ref_keywords.asp
        int myFirstNumber = 4;
        System.out.printf("Number %s%n", myFirstNumber);
        myFirstNumber = 10;
        System.out.printf("Number %s%n", myFirstNumber);
        myFirstNumber = 10 + 5;
        System.out.printf("Number %s%n", myFirstNumber);
        myFirstNumber = 10 + (5 + 2) * 10;
        System.out.printf("Number %s%n", myFirstNumber);
        myFirstNumber = 10 + 5 + 2 * 10;
        System.out.printf("Number %s%n", myFirstNumber);
    }

    public static void expressions() {
        int mySecondNumber = 3 * 4;
        int myThirdNumber = mySecondNumber - 6;
        System.out.printf("Number is %s%n", mySecondNumber);
        System.out.printf("Number is %s%n", myThirdNumber);
        int myTotal = myThirdNumber + mySecondNumber;
        int myLastOne = 1000 - myTotal;
        System.out.printf("Number is %s%n", myLastOne);
    }

    public static void primitiveTypes() {
        // whole numbers -> byte, short, int, long
        // real numbers -> float, double
        // single character -> char
        // boolean value -> boolean
        int myValue = 1000;
        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;
        System.out.printf("integer value range (%s to %d)%n", myMinValue, myMaxValue);
        System.out.printf("min value? %s%n", myMinValue - 1);// overflow
        int myUnderScoreValue = 2_147_483_647;
        System.out.printf("usin underscore as a numeric literal %s%n", myUnderScoreValue);
    }

    public static void wholeNumbers() {
        System.out.printf("byte value range (%s to %d)%n", Byte.MIN_VALUE, Byte.MAX_VALUE);//8 bits
        System.out.printf("short value range (%s to %d)%n", Short.MIN_VALUE, Short.MAX_VALUE);//16
        System.out.printf("integer value range (%s to %d)%n", Integer.MIN_VALUE, Integer.MAX_VALUE);//32
        System.out.printf("long value range (%s to %d)%n", Long.MIN_VALUE, Long.MAX_VALUE);//64
        long bigLontLiteralValue = 2_147_483_647_452L;
        System.out.println(bigLontLiteralValue);
    }
}
