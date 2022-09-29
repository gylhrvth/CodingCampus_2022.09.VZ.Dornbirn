package batuhan.week03;

import java.util.Arrays;

public class BubblesortmitZahlen {

    public static void main(String[] args) {

        int[] arr = RandomNumberArraySumme.generateRandomValues(5);
        System.out.println(Arrays.toString(arr));
        realBubbleUp(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleup(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void realBubbleUp(int[] arr) {
        System.out.println("Anfang:      " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            //Nach jedem Durchlauf der folgenden Schleife ist am Ende des Arrays eine Zahl mehr richtig
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //Vergleich ob das aktuelle Element größer als das nächste ist
                if (arr[j] > arr[j + 1]) {
                    //Element an der Stelle j mit dem Element an der Stelle j + 1 tauschen
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println("Durchlauf: " + i + " " + Arrays.toString(arr));
        }
    }
}
