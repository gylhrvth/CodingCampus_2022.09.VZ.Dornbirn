package martin.week03;

import martin.week01.MethodenUndSchleifen;
import martin.week02.UserInput;

import java.util.Arrays;
import java.util.Random;

public class ArrayPractice {
    public static void main(String[] args) {
        /*
        MethodenUndSchleifen.head("#", "Number Array");
        int arrayLength1 = UserInput.readUserInputInt(100, -1, "Geben sie bitte die Länge des Arrays an. ");
        System.out.println();
        int[] array1 = numberArrayForw(arrayLength1);
        int[] array2 = numberArrayBackw(arrayLength1);
        System.out.printf("Forward  Array 1: %s%n", Arrays.toString(array1));
        System.out.printf("Backward Array 2: %s%n%n", Arrays.toString(array2));
        MethodenUndSchleifen.head("#", "Kopie");
        int arrayChoice = UserInput.readUserInputInt(3, 0, "Geben sie an ob Array 1 oder 2 kopiert werden soll. (1/2) ");
        System.out.println();
        int[] array3;
        if (arrayChoice == 1) {
            array3 = makeACopy(array1);
        } else {
            array3 = makeACopy(array2);
        }
        System.out.printf("Copy Array: %s%n%n", Arrays.toString(array3));
        MethodenUndSchleifen.head("#", "Random Number Array");
        int arrayLength3 = UserInput.readUserInputInt(100, -1, "Geben sie bitte die Länge des Zufalls Arrays an. ");
        System.out.println();
        int[] arrayRandom1 = randArray(arrayLength3, 0,101);
        System.out.printf("Random Array: %s%n%n", Arrays.toString(arrayRandom1));

        MethodenUndSchleifen.head("#", "Random Number Array Crazy Range");
        int arrayLength4 = UserInput.readUserInputInt(101, -1, "Geben sie bitte die Länge des Zufalls Arrays an. ");
        System.out.println();
        int[] arrayRandom2 = randArray(arrayLength4, -50,51);
        System.out.printf("Crazy Random Array: %s%n%n", Arrays.toString(arrayRandom2));

        MethodenUndSchleifen.head("#", "Random Number Array Min/Max/Avg");
        int arrayLength5 = UserInput.readUserInputInt(100001, -1, "Geben sie bitte die Länge des Zufalls Arrays an. ");
        System.out.println();
        int[] arrayRandom3 = randArray(arrayLength5, 0,101);
        System.out.printf("Random Number Array Min/Max/Avg Liste = %s%n", Arrays.toString(arrayRandom3));
        System.out.printf("Das Minimum ist %d, das Maximum ist %d und der Durchschnitt ist %.2f.%n",getArrayMinimum(arrayRandom3),getArrayMaximum(arrayRandom3),getArrayAverage(arrayRandom3));
        */

        MethodenUndSchleifen.head("#", "Bubblesort mit Zahlen");
        int arrayLength6 = UserInput.readUserInputInt(101, -1, "Geben sie bitte die Länge des Zufalls Arrays an. ");
        System.out.println();
        int[] arrayRandom4 = randArray(arrayLength6, 0,101);
        System.out.printf("Bubblesort mit Zahlen Liste = %s%n", Arrays.toString(arrayRandom4));
        int[] arraySorted1 = bubbleSortAlg(arrayRandom4);
        System.out.printf("Bubblesort mit Zahlen Liste = %s%n", Arrays.toString(arraySorted1));
    }

    public static int[] numberArrayForw(int length) {
        int[] numArrayForw = new int[length];
        for (int i = 0; i < length; i++) {
            numArrayForw[i] = i + 1;
        }
        return numArrayForw;
    }

    public static int[] numberArrayBackw(int length) {
        int[] numArrayBackw = new int[length];
        for (int i = 0; i < length; i++) {
            numArrayBackw[i] = length - i;
        }
        return numArrayBackw;
    }

    public static int[] makeACopy(int[] original) {
        return original;
    }

    public static int[] randArray(int size, int minRandom, int maxRandom) {
        int[] randArray = new int[size];
        for (int i = 0; i < size; i++) {
            int randomNumber = new Random().nextInt(maxRandom - minRandom) + minRandom;
            randArray[i] = randomNumber;
        }
        return randArray;
    }

    public static int getArrayMinimum(int[] arrayName) {
        int min = arrayName[0];
        for (int j : arrayName) {
            if (j < min)
                min = j;
        }
        return min;
    }

    public static int getArrayMaximum(int[] arrayName) {
        int max = arrayName[0];
        for (int j : arrayName) {
            if (j > max)
                max = j;
        }
        return max;
    }

    public static double getArrayAverage(int[] arrayName) {
        double avg = 0;
        for (int j : arrayName) {
            avg = avg + arrayName[j];
        }
        avg = avg / arrayName.length;
        return avg;
    }

    public static int[] bubbleSortAlg(int[] sortArray) {
        int[] bubbleArray = sortArray;
        for (int j = 0; j < sortArray.length; j++) {
            for (int i = 0; i+1 < sortArray.length; i++) {
                if (bubbleArray[i] > sortArray[i + 1]) {
                    int k = sortArray[i];
                    bubbleArray[i] = sortArray[i + 1];
                    sortArray[i + 1] = k;
                }
            }
        }
        return bubbleArray;
    }
}