package milan.week03;

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {

        System.out.println("------------------------");
        int[] arr = RandomNumberArray.createArrayWithRandomNum(10);
        System.out.println("------------------------");
        //int[] arr = {51, 7, 92, 14};
        sortAscending(arr);
        System.out.println("Zahlen aufsteigend sortiert: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("------------------------");
        sortDescending(arr);
        System.out.println("Zahlen absteigend sortiert: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("------------------------");
    }

    public static int[] sortAscending(int[] arr) {
        int ablage = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int pos = 0; pos < arr.length - 1; pos++) {
                if (arr[pos] > arr[pos + 1]) {
                    ablage = arr[pos];
                    arr[pos] = arr[pos + 1];
                    arr[pos + 1] = ablage;
                }
            }
        }
        return arr;
    }

    public static int[] sortDescending(int[] arr) {
        int ablage = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int pos = 0; pos < arr.length - 1; pos++) {
                if (arr[pos] < arr[pos + 1]) {
                    ablage = arr[pos];
                    arr[pos] = arr[pos + 1];
                    arr[pos + 1] = ablage;
                }
            }
        }
        return arr;

    }
}



