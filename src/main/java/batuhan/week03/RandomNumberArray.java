package batuhan.week03;

import java.util.Random;
import java.util.Arrays;


public class RandomNumberArray {
    private static Random random = new Random();

    public static void main(String[] args) {

        int randomNumber = 1;
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {

            randomNumber = random.nextInt(101);
            arr[i] = randomNumber;
            System.out.print(arr[i] + "  ");


        }
        System.out.println();
        System.out.println(Arrays.toString(arr));

        System.out.println();
        System.out.println();


//        for (int i = 1; i < arr.length; i = i + 2) {
//            System.out.print(arr[i]+" ");


//        System.out.println("Length: " + arr.length);
//
//        System.out.println(" 2. Element: " + arr[1]);
//        System.out.println(" 5. Element: " + arr[4]);
//        System.out.println("10. Element: " + arr[9]);
//        System.out.println();

//        for (int x : arr) { foreach-Schleife
//    }
    }

}

