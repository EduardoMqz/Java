public class VI_Arrays {
        public static void main(String[] args) throws Exception {
            arraysFoundations();
    
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
                System.out.println(newArray[i] + " ");
            }
            System.out.println("**".repeat(10));
            for (int i : newArray) {
                System.out.println(i + " ");
            }
        }
}
