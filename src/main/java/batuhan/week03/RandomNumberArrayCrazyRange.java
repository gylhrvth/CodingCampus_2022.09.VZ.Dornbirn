package batuhan.week03;

import java.util.Arrays;
import java.util.Random;


public class RandomNumberArrayCrazyRange {


    public static void main(String[] args) {

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            int numberOfComputer = new Random().nextInt(101) - 50;
            arr[i]= numberOfComputer;

        }

        for (int x : arr){
            System.out.print(x + ",");
        }

    }


}

