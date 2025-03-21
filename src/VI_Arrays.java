import java.util.Arrays;
import java.util.Random;

public class VI_Arrays {
        public static void main(String[] args) throws Exception {
            arraysFoundations();
            populatingLooping();
            sortingFiling();
            binarySearch();
            arrayChallenge();
    
        }

        public static void arraysFoundations(){
            int[] myIntArray = new int[10];
            myIntArray[0] = 45;
            myIntArray[1] = 1;
            myIntArray[5] = 50;
            double[] myDoubleArray = new double[10];
            myDoubleArray[2] = 3.5;
            System.out.println(myDoubleArray[2]);
            int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            System.out.println("first = " + firstTen[0]);
            int arrayLenght = firstTen.length;
            System.out.println("length of array = " + arrayLenght);
            System.out.println("last = " + firstTen[arrayLenght - 1]);
            int[] newArray;
            newArray = new int[]{5, 4, 3, 2, 1};
            for (int i = 0; i < newArray.length; i++) {
                System.out.print(newArray[i] + " ");
            }
            System.out.println("");
            for (int i : newArray) {
                System.out.print(i + " ");
            }
        }

        public static void populatingLooping(){
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

        public static void sortingFiling(){
            int[] firstArray = getRandomArray(10);
            System.out.println(Arrays.toString(firstArray));
            Arrays.sort(firstArray);
            System.out.println(Arrays.toString(firstArray));
            int[] secondArray = new int[10];
            System.out.println(Arrays.toString(secondArray));
            Arrays.fill(secondArray,5);
            System.out.println(Arrays.toString(secondArray));
            int[] thirdArray = Arrays.copyOf(firstArray, firstArray.length);
            System.out.println(Arrays.toString(thirdArray));

        }

        private static int[] getRandomArray(int len){
            Random random = new Random();
            int[] newInt = new int[len];
            for (int i = 0; i < len; i++) {
                newInt[i] = random.nextInt(100);
            }
            return newInt;
        }

        public static void binarySearch(){
            String[] sArray = {"Able", "Jane", "Mark", "Ralph", "David", "Ann", "Alphonse", "Eve"};
            Arrays.sort(sArray);
            System.out.println(Arrays.toString(sArray));
            if (Arrays.binarySearch(sArray, "Mark") >= 0) {
                System.out.println("Found mark in the list");
            }
            int[] iArray1 = {4,5,2,3,6,8};
            int[] iArray2 = {4,5,2,3,6,8};
            if(Arrays.equals(iArray1, iArray2)){
                System.out.println("Arrays are equal");
            }else{
                System.out.println("They are not equal");
            }
        }

        public static void arrayChallenge(){
            int[] arrayChallenge = getRandomArray(15);
            System.out.println(Arrays.toString(arrayChallenge));
            Arrays.sort(arrayChallenge);
            int[] sortedArray =Arrays.copyOf(arrayChallenge, arrayChallenge.length);
            for (int i = 0; i < arrayChallenge.length; i++) {
                sortedArray[i] = arrayChallenge[arrayChallenge.length - (1 + i)];
            }
            System.out.println(Arrays.toString(sortedArray));
        }

}
