package viktor.week06.OperationExample;

import javax.management.OperationsException;
import java.util.Arrays;
import java.util.Random;

public class OpratationSimulation {

    private static Operation getMinMaxAvg(int[] arr){

        int min = arr[0];
        int max = arr[0];
        double sum = 0;

        for (int i:arr) {
            if(min > i){
                min = i;
            }
            if(max < i){
                max = i;
            }
            sum += i;
        }
        double avg = sum / arr.length;

        return new Operation(min, max, avg);
    }


    public static void main(String[] args) {

        Random random = new Random();

        int[] ranArr2 = new int[10];
        int[] ranArr = new int[10];

        for(int i = 0 ; i < ranArr.length; i++) {
            ranArr[i] = random.nextInt(101);

        }
        System.out.println(Arrays.toString(ranArr));
        Operation op = getMinMaxAvg(ranArr);
        System.out.println(op.toString());
        System.out.println();

        for (int j = 0; j < ranArr2.length; j++) {
            ranArr2[j] = random.nextInt(50)-51;
        }
        System.out.println(Arrays.toString(ranArr2));
        Operation op2 = getMinMaxAvg(ranArr2);
        System.out.println(op2.toString());


    }
}
