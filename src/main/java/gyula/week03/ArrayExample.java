package gyula.week03;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] arr = {10, 12, 14, 22};

        System.out.println("arr: " + arr);
        System.out.print("arr: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("arr: " + Arrays.toString(arr));

        System.out.println("-----------------------");
        double[] temp = new double[100];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = i * 0.25;
        }
        System.out.println("temp: " + Arrays.toString(temp));

        // System.out.println(temp[100]);
    }
}
