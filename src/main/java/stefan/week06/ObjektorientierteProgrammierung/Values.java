package stefan.week06.ObjektorientierteProgrammierung;

import java.util.Arrays;
import java.util.Random;

public class Values {

    public static void main(String[] args) {


        int[] values = {1, 2, 3};
        int[] arr = random();
        System.out.println(Arrays.toString(arr));
        System.out.println();
        DatenKlasse p1 = new DatenKlasse(arr);
        System.out.println(p1);
    }

    public static int[] random() {
        Random randy = new Random();
        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            int number = randy.nextInt(101);
            arr[i] = number;
        }
        return arr;
    }
}
