package michel.week03;

import java.util.Random;

public class ArrayCrazyRange {

    public static void main(String[] args) {
        Random random = new Random();
        int [] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            int randomNumber = random.nextInt(101) - 50;
            arr[i]=randomNumber;
        }
        boolean firstNumber = true;
        System.out.print("[");
        for (int value:arr) {
            if(firstNumber){
                firstNumber = false;
            }else {
                System.out.print(", ");
            }
            System.out.print(value);
        }
        System.out.println("]");



    }
}
