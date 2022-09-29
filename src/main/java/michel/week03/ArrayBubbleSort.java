package michel.week03;

import static michel.week03.ArrayCounting.createRandomArray;

public class ArrayBubbleSort {

    public static void main(String[] args) {
        int[] randomNumber = createRandomArray(10, 1000);

        int[] sortAscending = doSortAscending(randomNumber);

        int[] sortDescending = doSortDescending(randomNumber);

        for (int i = 0; i < sortAscending.length; i++) {
            System.out.println(i + 1 + ": " + sortAscending[i]);
        }
        for (int i = 0; i < sortDescending.length; i++) {
            System.out.println(i + 1 + ": " + sortDescending[i]);
        }

    }

    private static int[] doSortDescending(int[] sortDescending) {
        int value;
        for (int i = 1; i < sortDescending.length; i++) {
            for (int j = 0; j < sortDescending.length - i; j++) {
                if (sortDescending[j] > sortDescending[j + 1]) {
                    value = sortDescending[j];
                    sortDescending[j] = sortDescending[j + 1];
                    sortDescending[j + 1] = value;
                }
            }
        }
        return sortDescending;
    }

    private static int[] doSortAscending(int[] sortAscending) {
        int value;
        for (int i = 1; i < sortAscending.length; i++) {
            for (int j = 0; j < sortAscending.length - i; j++) {
                if (sortAscending[j] < sortAscending[j + 1]) {
                    value = sortAscending[j];
                    sortAscending[j] = sortAscending[j + 1];
                    sortAscending[j + 1] = value;
                }
            }
        }
        return sortAscending;
    }


}
