import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class VI_Arrays {
    public static void main(String... args) throws Exception {
        arraysFoundations();
        populatingLooping();
        sortingFiling();
        binarySearch();
        arrayChallenge();
        bestPractices();
        String[] splitString = "Hello world".split(" ");
        varargs(splitString);
        varargs("Hello", "World", "Again");
        int[] returnedArray = readIntegers();
        System.out.println(Arrays.toString(returnedArray));
        int returnedMin = findMin(returnedArray);
        System.out.println("min = "+ returnedMin);
        int[] originalArray = {10,9,8,7,6,5,4,3,2,1};
        reverseMethod(originalArray);
        array2D();
        multiDimensionalArray();
    }

    public static void arraysFoundations() {
        int[] myIntArray = new int[10];
        myIntArray[0] = 45;
        myIntArray[1] = 1;
        myIntArray[5] = 50;
        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
        System.out.println(myDoubleArray[2]);
        int[] firstTen = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("first = " + firstTen[0]);
        int arrayLenght = firstTen.length;
        System.out.println("length of array = " + arrayLenght);
        System.out.println("last = " + firstTen[arrayLenght - 1]);
        int[] newArray;
        newArray = new int[] { 5, 4, 3, 2, 1 };
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println("");
        for (int i : newArray) {
            System.out.print(i + " ");
        }
    }

    public static void populatingLooping() {
        int[] newArray;
        newArray = new int[5];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = newArray.length - i;
        }
        System.out.println("");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println();
        for (int element : newArray) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(newArray));
        Object objectVariable = newArray;
        if (objectVariable instanceof int[]) {
            System.out.println("objectVariable is really an int[]");
        }
        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = false;
        objectArray[2] = newArray;
    }

    public static void sortingFiling() {
        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));
        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));
        int[] thirdArray = Arrays.copyOf(firstArray, firstArray.length);
        System.out.println(Arrays.toString(thirdArray));

    }

    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }

    public static void binarySearch() {
        String[] sArray = { "Able", "Jane", "Mark", "Ralph", "David", "Ann", "Alphonse", "Eve" };
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if (Arrays.binarySearch(sArray, "Mark") >= 0) {
            System.out.println("Found mark in the list");
        }
        int[] iArray1 = { 4, 5, 2, 3, 6, 8 };
        int[] iArray2 = { 4, 5, 2, 3, 6, 8 };
        if (Arrays.equals(iArray1, iArray2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("They are not equal");
        }
    }

    public static void arrayChallenge() {
        int[] arrayChallenge = getRandomArray(15);
        System.out.println(Arrays.toString(arrayChallenge));
        Arrays.sort(arrayChallenge);
        int[] sortedArray = Arrays.copyOf(arrayChallenge, arrayChallenge.length);
        for (int i = 0; i < arrayChallenge.length; i++) {
            sortedArray[i] = arrayChallenge[arrayChallenge.length - (1 + i)];
        }
        System.out.println(Arrays.toString(sortedArray));
    }

    public static void bestPractices() {
        int[] intArray = new int[5];
        int[] anotherArray = intArray;
        System.out.println("intArray: " + Arrays.toString(intArray));
        System.out.println("anotherArray:" + Arrays.toString(anotherArray));
        anotherArray[0] = 1;
        modifyArray(intArray);
        System.out.println("after change intArray" + Arrays.toString(anotherArray));
        System.out.println("after change anotherArray:" + Arrays.toString(anotherArray));
    }

    public static void modifyArray(int[] array) {
        array[1] = 2;
    }

    public static void varargs(String... textList) {
        for (String text : textList) {
            System.out.println(text);
        }
    }

    private static int[] readIntegers() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by commas:");
        String rawArray = scan.nextLine();
        String[] stringArray = rawArray.split(",");
        int[] arrayValues = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            arrayValues[i] = Integer.parseInt(stringArray[i].trim());
        }
        return arrayValues;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int element : array) {
            if(element < min){
                min = element;
            }
        }
        return min;
    }

    public static void reverseMethod(int[] array){
        System.out.println(Arrays.toString(array));
        int[] reverseArray = new int[array.length];
        for (int i = 0; i < reverseArray.length; i++) {
            reverseArray[i] = array[array.length - (1 + i)];
        }
        System.out.println(Arrays.toString(reverseArray));

        int maxIndex = array.length - 1;    
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
        System.out.println(Arrays.toString(array));

        int[] thirdArray = new int[array.length];
        for (int element : array) {
            thirdArray[maxIndex--] = element;
        }
        System.out.println(Arrays.toString(thirdArray));
    }

    public static void array2D(){
        int[][] array2 = new int[4][4];
        System.out.println(Arrays.toString(array2));
        System.out.println("array2 lenght = " + array2.length);
        for (int[] arr : array2) {
            System.out.println(Arrays.toString(arr));
        }

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                array2[i][j] = (i * 10) + (j + 1);
                System.out.println(array2[i][j] +" ");
            }
            System.out.println();
        }

        for (var outer : array2) {
            for (var element : outer) {
                System.out.println(element + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(array2));
    }

    public static void multiDimensionalArray(){
        int[][] array2 = new int[4][4];
        array2[1] = new int[] {10,20,30};
        System.out.println(Arrays.deepToString(array2));
        Object[] anyArray = new Object[3];
        System.out.println(Arrays.toString(anyArray));
        anyArray[0] = new String[] {"Mokka", "Figaro", "Doggie"};
        System.out.println(Arrays.deepToString(anyArray));
        anyArray[1] = new int[][]{
            {1,2,3},
            {4,5,6,4},
            {7,8,9,10,11}};
        System.out.println(Arrays.deepToString(anyArray));
        anyArray[2] = new int[2][2][2];
        System.out.println(Arrays.deepToString(anyArray));
        for (Object element : anyArray) {
            System.out.println("Element type: " + element.getClass().getSimpleName());
            System.out.println("element toStrin(): "+element);
            System.out.println(Arrays.deepToString((Object[]) element));
        }
    }
}