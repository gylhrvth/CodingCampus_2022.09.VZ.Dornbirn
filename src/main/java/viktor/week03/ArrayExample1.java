package viktor.week03;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample1 {

    public static int readSize(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie mir die Größe des Arrays an:");
        int number = -1;

        while(number < 0) {
            if(sc.hasNextInt()) {
                number = sc.nextInt();
                if (number < 0) {
                   System.err.println("Negative Zahl ist nicht erlaubt!");
                }
            } else {
                System.err.println("Falsche Eingabe! Die Eingabe muss eine Ganzzahl sein!");
            }
            sc.nextLine();
        }
        return number;
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
