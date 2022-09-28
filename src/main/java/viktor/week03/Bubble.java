package viktor.week03;

import java.util.Arrays;
import java.util.Random;

public class Bubble {

    public static void sortAsc(int[] myArray) {

        int temp1 = 0;
        for (int h = 0; h < myArray.length - 1; h++) {
            for (int i = 0; i < myArray.length - 1; i++) {
                if (myArray[i] > myArray[i + 1]) {
                    temp1 = myArray[i];
                    myArray[i] = myArray[i + 1];
                    myArray[i + 1] = temp1;
                }
            }
        }
        System.out.println("Sorted Array (asc): " + Arrays.toString(myArray));
    }


    public static void sortDesc(int[] array) {
        int temp2 = 0;
        for (int h = 0; h < array.length - 1; h++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    temp2 = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp2;
                }
            }
        }
        System.out.println("Sorted Array (desc): " + Arrays.toString(array));
    }

    public static void main(String[] args) {

        int size = ArrayExample1.readSize();
        int[] myArray = new int[size];

        for (int i = 0; i < size; i++) {
            Random random = new Random();
            int randomNumber = random.nextInt(101);
            myArray[i] = randomNumber;
        }
        System.out.println("Array:" + Arrays.toString(myArray));
        System.out.println();


        sortAsc(myArray);
        System.out.println();
        sortDesc(myArray);


    }
}
