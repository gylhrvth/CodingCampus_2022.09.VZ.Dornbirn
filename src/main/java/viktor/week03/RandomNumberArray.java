package viktor.week03;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

public class RandomNumberArray {
    public static void main(String[] args) {



        int size = ArrayExample1.readSize();
        int[] myArray = new int[size];

        System.out.println();
        for(int i = 0; i < size; i++){
            Random random = new Random();
            int randomNumber = random.nextInt(101);
            myArray[i] = randomNumber;
        }

        System.out.println("toString: " + Arrays.toString(myArray));

        System.out.println();
        System.out.println("Foreach: ");

        boolean comma = false;
        System.out.print("[");

        for(int i: myArray){
            if(comma) {
                System.out.print(", ");
            }
            System.out.print(i);
            comma=true;
        }
        System.out.print("]");


        System.out.println();

        System.out.println("\n");           //output with for
        System.out.println("For");

        System.out.print("[");
        for(int j = 0; j < size; j++) {
            if (j == size - 1) {
                System.out.print(myArray[j]);
            } else {
                System.out.print(myArray[j] + ", ");
            }
        }
        System.out.print("]");

        System.out.println("\n");
        System.out.println("Zweites, fünftes, zehntes Element:");
        for(int h = 0; h < size; h++){
            if ((h == 1) || (h == 4) || (h==9)){
                System.out.print(myArray[h] + " ");
            }
        }

        System.out.println("\n");
        System.out.println("Jedes zweites Element:");
        for(int k =1; k < size; k+=2){
            System.out.print(myArray[k]+ " ");
        }
    }
}
