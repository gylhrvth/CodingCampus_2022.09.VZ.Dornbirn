package viktor.week06.OperationExample;

import java.util.Arrays;
import java.util.Random;

public class OpratationSimulation {

    public static void main(String[] args) {

        Random random = new Random();

        int[] ranArr2 = new int[10];
        int[] ranArr = new int[10];

        for (int i = 0; i < ranArr.length; i++) {
            ranArr[i] = random.nextInt(101);
        }
        System.out.println(Arrays.toString(ranArr));

        Operation op2 = new Operation(ranArr);
        System.out.println(op2.toString());

        for (int j = 0; j < ranArr2.length; j++) {
            ranArr2[j] = random.nextInt(50) - 51;
        }
        System.out.println(Arrays.toString(ranArr2));

        Operation op3 = new Operation(ranArr2);
        System.out.println(op3.toString());

    }
}
