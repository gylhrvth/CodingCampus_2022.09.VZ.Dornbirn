package milan.week03;

import java.util.Arrays;

public class SortierverfahrenGnomeSort {
    public static void main(String[] args) {

        System.out.println("----------------------------------------");
        int[] arr = RandomNumberArray.createArrayWithRandomNum(10);
        System.out.println("----------------------------------------");
        gnomeSort(arr);
        System.out.println("Sortierte Ausgabe (gnomeSort): ");
        System.out.println(Arrays.toString(arr));
        System.out.println("----------------------------------------");
    }

    public static int[] gnomeSort(int[] arr) {
        int i = 1;
        int swap = -1;
        while (i <= arr.length - 1) {
            if (arr[i] >= arr[i - 1]) {
                i = i + 1;
            } else {
                swap = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = swap;
                if (i > 1) {
                    i = i - 1;
                }
            }
        }
        return arr;
    }
}
