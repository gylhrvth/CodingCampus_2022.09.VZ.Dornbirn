package viktor.week03;

import java.util.Arrays;
import java.util.Random;

public class CocktailShakerSort {

    public static void readRandomNumberAndPrintout(int[] array){


        for(int i = 0; i < array.length; i++){
            Random random = new Random();
            int randomNumber = random.nextInt(101);
            array[i] = randomNumber;
        }
        System.out.println("Original Array: " + Arrays.toString(array));

    }

    public static void cocktailShakerSort(int[] array) {

        int lo = 0;
        int hi = array.length-1;
        boolean swapped = true;
        int temp = 0;

        while (swapped) {
            swapped = false;

                for (int i = lo; i < hi; i++) {
                    if (array[i] > array[i+1]) {
                        temp = array[i];
                        array[i] = array[i+1];
                        array[i+1] = temp;
                        swapped = true;
                        }
                }

                if (!swapped){
                    break;
                }
                swapped = false;
                --hi;

                for (int j = hi-1; j >= lo; j--) {
                    if (array[j] > array[j + 1]) {
                        temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;

                        swapped = true;
                    }
                }
                lo++;
        }
        System.out.println("Cocktail Shaker Sort: "+ Arrays.toString(array));
    }

    public static void main(String[] args) {

        int size = ArrayExample1.readSize();
        int[] myArray = new int[size];

        readRandomNumberAndPrintout(myArray);
        cocktailShakerSort(myArray);

    }

}
