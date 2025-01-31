public class first_step {
    public static void main(String[] args) throws Exception {
        helloWorld("World");
        variables();
        expressions();
        primitiveTypes();
        wholeNumbers();
        casting();
        primitiveTypesChallenge();
        floatAndDouble();

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
        System.out.printf("byte value range (%s to %d)%n", Byte.MIN_VALUE, Byte.MAX_VALUE);// 8 bits
        System.out.printf("short value range (%s to %d)%n", Short.MIN_VALUE, Short.MAX_VALUE);// 16 bits
        System.out.printf("integer value range (%s to %d)%n", Integer.MIN_VALUE, Integer.MAX_VALUE);// 32 bits
        System.out.printf("long value range (%s to %d)%n", Long.MIN_VALUE, Long.MAX_VALUE);// 64 bits
        long bigLontLiteralValue = 2_147_483_647_452L;
        System.out.println(bigLontLiteralValue);
    }

    public static void casting() {
        short myMinShortValue = Short.MIN_VALUE, myMaxShortValue = Short.MAX_VALUE;
        int myMinIntValue = Integer.MIN_VALUE, myMaxIntValue = Integer.MAX_VALUE;
        byte myMinByteValue = Byte.MIN_VALUE, myMaxByteValue = Byte.MAX_VALUE;
        int myTotal = myMinIntValue/2;
        System.out.println(myTotal);
        byte newByteValue = (byte)(myMinByteValue/2);
        System.out.println(newByteValue);
    }

    public static void primitiveTypesChallenge(){
        byte byteValue = 1;
        short shortValue = 10;
        int intValue = 100;
        long longValue = 50_000 + (10 * (byteValue + shortValue + intValue));
        System.out.println(longValue);
    }

    public static void floatAndDouble(){
        //double is default type for any decimal or real number, any number with a decimal is a double
        //floar 32 bits || double 64 bits
        System.out.printf("Float value range: (%s to %s)%n",Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("Dppuble value range: (%s to %s)%n",Double.MIN_VALUE, Double.MAX_VALUE);
        int myIntValue = 5;
        float myFloatNumber = 5;
        double myDoubleValue = 5;
        System.out.println("int="+myIntValue+"  float="+myFloatNumber+"  double="+myDoubleValue);
        myFloatNumber = 5.23f;
        myDoubleValue = 3.25d;
        System.out.println("int="+myIntValue+"  float="+myFloatNumber+"  double="+myDoubleValue);
        myFloatNumber = (float) 5.23;
        myDoubleValue = (double )3.25;
        System.out.println("int="+myIntValue+"  float="+myFloatNumber+"  double="+myDoubleValue);

    }
}
