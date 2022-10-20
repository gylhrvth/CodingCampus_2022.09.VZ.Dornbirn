package fatima.week06.DataClass;

import java.util.Random;

public class DataClassSimulation {

    public static void main(String[] args) {
        int[] array = randomArray(20, -300, 300);

        DataClass dc = new DataClass(array);
        System.out.println(dc);
        System.out.printf("Min: %2d\n", dc.getMin());
        System.out.printf("Max: %4d\n", dc.getMax());
        System.out.printf("Avg: %6.1f", dc.getAvg());
    }

    private static int[] randomArray(int size, int min, int max) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(max - min) + min;
        }
        return arr;
    }
}