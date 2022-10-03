package michel.week03;

import java.util.Arrays;

import static michel.week03.ArrayCounting.createRandomArray;

public class ArrayBubbleSort {

    public static void main(String[] args) {
        int[] randomNumber = createRandomArray(10, 100);
        System.out.println(Arrays.toString(randomNumber));

        doSortAscending(randomNumber);
        System.out.println("Sortierung aufsteigend:");
        System.out.println(Arrays.toString(randomNumber));

        doSortDescending(randomNumber);
        System.out.println("Sortierung absteigend:");
        System.out.println(Arrays.toString(randomNumber));
    }

    private static void doSortDescending(int[] toSortDescending) {
        int value;
        for (int i = 1; i < toSortDescending.length; i++) {
            for (int j = 0; j < toSortDescending.length - i; j++) {
                if (toSortDescending[j] < toSortDescending[j + 1]) {
                    value = toSortDescending[j];
                    toSortDescending[j] = toSortDescending[j + 1];
                    toSortDescending[j + 1] = value;
                }
            }
        }
    }

    private static void doSortAscending(int[] sortAscending) {
        int value;
        for (int i = 1; i < sortAscending.length; i++) {
            for (int j = 0; j < sortAscending.length - i; j++) {
                if (sortAscending[j] > sortAscending[j + 1]) {
                    value = sortAscending[j];
                    sortAscending[j] = sortAscending[j + 1];
                    sortAscending[j + 1] = value;
                }
            }
        }
    }
}
