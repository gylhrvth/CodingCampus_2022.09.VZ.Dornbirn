package gyula.week03;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] numbers = GenerateSum.generateRandomArray(20);

        System.out.println("Pre  order: " + Arrays.toString(numbers));
        heapSort(numbers);
        System.out.println("Post order: " + Arrays.toString(numbers));
    }

    public static void heapSort(int[] arr){
        buildHeap(arr);
        for (int n = arr.length -1; n > 0; n--) {
            int temp = arr[0];
            arr[0] = arr[n];
            arr[n] = temp;

            siftDown(arr, n, 0);
        }
    }

    public static void buildHeap(int[] arr){
        for (int i = arr.length/2; i >= 0; i--) {
            siftDown(arr, arr.length, i);
        }
    }

    public static void siftDown(int[] arr, int limit, int i){
        if (2 * i >= limit) return; // Do nothing

        int k = 2 * i;
        if ((2 * i + 1 < limit) && (arr[2 * i] < arr[2 * i + 1])){
            ++k;
        }
        if (arr[i] < arr[k]){
            int temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
            siftDown(arr, limit, k);
        }
    }
}
