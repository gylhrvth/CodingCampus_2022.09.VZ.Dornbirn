package batuhan.week03;

import java.util.Random;
import java.util.Arrays;


public class RandomNumberArray {
    public static void main(String[] args) {

        int randomNumber = 1;
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {

            Random random = new Random();
            randomNumber = new Random().nextInt(101);
            arr[i] = randomNumber;
            System.out.print(arr[i] + "  ");

        }


    }
}
