package lukas.week03.day4;

import java.util.Arrays;
import java.util.Random;

public class Rehearsal {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));


        //{ ... } Schreibweise nur bei Initialisierung
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //arr2 = { 1,2,3}; Geht nicht

        int[] arr3 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //der Variable arr3 wird ein neues Array zugewiesen, dieses hat nichts mit dem alten zu tun!!!111
        arr3 = new int[]{1, 2, 3};

        for (int value : arr3) {
            System.out.println(value);
        }

        //int array der Größe 1000 mit Zufallszahlen befüllen
        Random randy = new Random();
        int[] arr4 = new int[1000000];
        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = randy.nextInt(Integer.MAX_VALUE);
        }
        int min = Integer.MAX_VALUE;
        for (int value : arr4) {
            if (value < min) {
                min = value;
            }
        }
        System.out.println(min);

        //2-Dimensionales Array - oder ein Array von Arrays
        int[][] notAMatrix = new int[10][];
        for (int row = 0; row < notAMatrix.length; row++) {
            notAMatrix[row] = new int[randy.nextInt(10) + 1];
        }

        for (int row = 0; row < notAMatrix.length; row++) {
            int[] currentRow = notAMatrix[row];
            for (int col = 0; col < currentRow.length; col++) {
                System.out.print(currentRow[col] + ",");
            }
            System.out.println();
        }

        System.out.println("Change");
    }
}
