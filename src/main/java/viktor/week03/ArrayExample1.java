package viktor.week03;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample1 {

    public static int readSize(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie mir die Größe des Arrays an:");
        int size = sc.nextInt();
        return size;
    }

    public static int readElement(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte Element angeben:");
        return sc.nextInt();
    }


    public static void main(String[] args) {

        int s = readSize();

        int[] myArray = new int[s];

        for(int i = 0; i < myArray.length; i++){
            myArray[i] = i+1;

        }
        System.out.println("Elemente: " + Arrays.toString(myArray));

        System.out.println("-----------------------------------------");

        int s2 = readSize();
        int[] myArray2 = new int[s2];

        for(int j = 0; j < myArray2.length; j++){
            myArray2[j] = myArray2.length-j;
        }
        System.out.println("Elemente: " + Arrays.toString(myArray2));
    }
}
