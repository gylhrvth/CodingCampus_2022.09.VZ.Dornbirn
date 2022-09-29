package patric.week03;

import java.util.Arrays;

public class numberArrys {

    public static void main(String[] args) {
        int[] arrayForw = new int[10];

        for (int i = 0; i < arrayForw.length; i++) {
            arrayForw[i] = i + 1;
        }
        System.out.println("Array Forward: " + Arrays.toString(arrayForw));

        int[] arrayBackw = new int[20];
        for (int i = 0; i < arrayBackw.length; i++) {
            arrayBackw[i] = arrayBackw.length - i;

        }
        System.out.println("Array Backward: " + Arrays.toString(arrayBackw));
        int[] copy = makeACopy(arrayForw);
        System.out.println("Copy: " + Arrays.toString(copy));

        //MAnipulation von Array Forward
        arrayForw[1] = 5;

        System.out.println(Arrays.toString(arrayForw));
        System.out.println(Arrays.toString(copy));

    }

    public static int[] makeACopy(int[] orginal) {
        int[] kopie = new int[orginal.length];
        for (int i = 0; i < orginal.length; i++) {
            kopie[i]=orginal[i];
        }
        return kopie;
    }


}
