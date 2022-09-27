package batuhan.week03;

import java.util.Arrays;


public class Copy {
    public static void main(String[] args) {
        int[] arr = {10, 12, 20, 30};
        System.out.println("arr: " + arr);
//        System.out.println("arr: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(+arr[i] + " ");
//            System.out.println();
//            System.out.println("arr: " + Arrays.toString(arr));
            System.out.println();

        }

        int[] secondArray = makeACopy(arr);
        secondArray[0] = -100;

        System.out.println("Orig: " + Arrays.toString(arr));
        System.out.println("Copy: " + Arrays.toString(secondArray));

    }

    public static int[] makeACopy(int[] original) {
        int size = original.length;//zuerst die größe abfragen
        int[] newarray= new int[size];//neues Array erstellen
        for (int i = 0; i <size ; i++) {//größe des originals angeben
            newarray [i]= original[i];//neues Array befüllen mit den werten des Originalen Arrays

        }
        return newarray;
    }
}
