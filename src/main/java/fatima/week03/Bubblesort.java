package fatima.week03;

public class Bubblesort {
    public static void main(String[] args) {
        int[] value = {8, 2, 5, 9, 3, 6, 1, 4, 7};
        System.out.println("Unsorted:");
        printArray(value);
        System.out.println();
        sortAscending(value);
        System.out.println("Ascending:");
        printArray(value);
        sortDescending(value);
        System.out.println();
        System.out.println("Descending:");
        printArray(value);
    }

    public static void printArray(int[] value) {
        System.out.print("[");
        for (int i = 0; i < value.length; i++) {
            System.out.print(value[i]);
            if (i < value.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void sortAscending(int[] value) {
        for (int j = 0; j < value.length; j++) {
            for (int i = 0; i < value.length - 1; i++) {
                if (value[i] > value[i+1]) {
                    int temp = value[i];
                    value[i] = value[i+1];
                    value[i + 1] = temp;
                }
            }
        }
    }

    public static void sortDescending(int[] value) {
        for (int j = 0; j < value.length; j++) {
            for (int i = 0; i < value.length - 1; i++) {
                int firstNumber = value[i];
                int secondNumber = value[i + 1];
                if (firstNumber < secondNumber) {
                    value[i] = secondNumber;
                    value[i + 1] = firstNumber;
                }
            }
        }
    }
}


