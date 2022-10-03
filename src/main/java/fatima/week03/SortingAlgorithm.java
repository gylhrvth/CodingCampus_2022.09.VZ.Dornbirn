package fatima.week03;

public class SortingAlgorithm {
    public static void main(String[] args) {
        int[] value = {8, 2, 5, 9, 3, 6, 1, 4, 7};
        System.out.println("Unsorted:");
        Bubblesort.printArray(value);
        System.out.println();
        System.out.println("Sorted with Selection Sort:");
        selectionSort(value);
        Bubblesort.printArray(value);
    }

    public static void selectionSort(int[] value) {
        for (int i = 0; i < value.length; i++) {
            int min = i;
            for (int j = i + 1; j < value.length; j++) {
                if (value[j] < value[min]) {
                    min = j;
                }
                int temp = value[i];
                value[i] = value[min];
                value[min] = temp;
            }
        }
    }
}

