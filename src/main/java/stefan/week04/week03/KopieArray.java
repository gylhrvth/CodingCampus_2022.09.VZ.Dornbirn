package stefan.week04.week03;

import java.util.Arrays;

public class KopieArray {
    public static void main(String[] args) {
        int arr[] = {17, 22, 24, 40};


        int arr1[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }


        arr1[0]++;
        System.out.print("Orginal:  ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        System.out.print("Kopie:  ");
        for (int i= 0; i < arr1.length; i++)
            System.out.print(arr1[i] + " ");

    }
}




