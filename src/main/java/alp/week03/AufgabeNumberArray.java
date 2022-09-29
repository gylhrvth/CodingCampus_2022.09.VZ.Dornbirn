package alp.week03;

import martin.week02.UserInput;
import java.util.Arrays;
import java.util.Scanner;

public class AufgabeNumberArray {
    public static void main() {
        int arrayLength = UserInput.readUserInputInt(100, -1, "Geben sie bitte die Länge des Arrays an. %n");
        int[] array1 = numberArrayForw(arrayLength);
        int[] array2 = numberArrayBackw(arrayLength);
        System.out.println("Forw Array: " + Arrays.toString(array1));
        System.out.println("Backw Array: " + Arrays.toString(array2));
        //makeACopy(numberArray());
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
            numArrayBackw[i] = length-i;
        }
        return numArrayBackw;
    }
/*
    public static int[] makeACopy(int[] original){
        return original;
    }
*/
}