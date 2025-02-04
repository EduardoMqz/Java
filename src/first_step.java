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
        floatingPointChallenge(3);
        charAndBoolean();
        stringType();
        operators();
        abbreviatingOperators();

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

    public static void floatingPointChallenge(int mypounds){
        int myIntValue = 5;
        float myFloatNumber = 5;
        double myDoubleValue = 5;
        myIntValue = 5 /2;
        System.out.println(myIntValue);
        myFloatNumber = 5 / 2f;
        System.out.println(myFloatNumber);
        myDoubleValue = (double) 5 / 2;
        System.out.println(myDoubleValue);
        int pounds = mypounds;
        double kilogram = pounds * 0.45359237;
        System.out.printf("Your kilograms are: %s%n", kilogram);
    }

    public static void charAndBoolean(){
        //char 16 bits
        char myChar = 'D';
        System.out.println(myChar);
        myChar = 'µ';
        System.out.println(myChar);
        myChar = '\u0040';
        System.out.println(myChar);
        myChar = 64;
        System.out.println(myChar);
        myChar = '\u1F4F';
        System.out.println(myChar);
        char mySimpleChar = '?', myUnicodeChar = '\u003F', myDecimalChar = 63;
        System.out.printf("My values are: %s, %s, %s%n", mySimpleChar, myUnicodeChar, myDecimalChar);
        boolean myTrueBoolean = true, myFalseboolean = false;
    }

    public static void stringType(){
        String myString = "This is a string";
        System.out.printf("My string is equal to '%s'%n", myString);
        myString = myString + " and this is more";
        System.out.printf("My string is equal to '%s'%n", myString);
        myString = "I wish I had \u00241,000,000";
        System.out.println(myString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);
        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println(lastString);
        //string are immutable, they cant chage after they are created
        //StringBuilder is mutable, cant asign a string literal or use the plus operator
        //it is not a primitive type is a class
    }

    public static void operators(){
        int result = 1 + 2; //two operators (=, +)
        int previousResult = result;
        result = result -1;
        char charA = 'A'; // char are stored as 2 bytes numbers in memory
        char charB = 'B';
        System.out.println(charA + charB);//when you use addition with chars, the n7umbers in memory get addded together
        System.out.println("" + charA + charB);
        result = 2;
        result = result * 10;
        result = result / 4;
        //Reminder operator
        result = 5;
        result = result % 3;
        System.out.println(result);
    }

    public static void abbreviatingOperators(){
        int result = 1;
        result = result + 1;
        System.out.println("Result: " + result);
        result++;
        System.out.println("Result: " + result);
        result -= 1;
        System.out.println("Result: " + result);
        int resultChallenge = 10;
        resultChallenge -= result;
        System.out.println("Result challenge: " +resultChallenge);
    }
}
