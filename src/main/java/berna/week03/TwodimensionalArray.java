package berna.week03;




import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class TwodimensionalArray {
    public static void main(String[] args) {
        //if (Math.random() > 0.5) {
        //  throw new RuntimeException("Hi Berna, was geht ab?");

        //createTwoDimArray();
        twoDimArraySum();

    }

    public static int[][] createTwoDimArray() {

        // Create a 2d-array and fill it with random numbers

        int length = ArraysBasics.askArrayLength();             //ask user which length of array
        Random randy = new Random();                            //initialize random numbers
        int[][] twodim = new int[length][];                     //the (main) array into which other arrays will be written in !


        for (int twodimCol = 0; twodimCol < length; twodimCol++) {      // in each col of the main array...
            int[] newArr = new int[length];                             // ...create a new array...
            for (int newArrCol = 0; newArrCol < newArr.length; newArrCol++) {     //... and fill its columns
                newArr[newArrCol] = randy.nextInt(100);
            }

            twodim[twodimCol] = newArr;             // write the array newArr into one column of the (main) array
        }
        System.out.print(Arrays.deepToString(twodim));
        return twodim;

    }

    public static void twoDimArraySum() {
        System.out.println("So you want to calculate the sum of a 2D-Array? ");
        System.out.println("Do you need the sum of the rows (type 1!) or the sum of the columns (type 2!)");
        Scanner sc = new Scanner(System.in);

        int wish = 0;
        while (wish == 0) {
            try {
                wish = sc.nextInt();
                if ((wish < 1) || (wish > 2)) {
                    System.out.println("there are only task 1 or 2! choose again: ");
                    wish = 0;  // reset the number to zero because you defined while ==0!
                }
            } catch (InputMismatchException ime) {
                System.out.println("This was not a number! Enter an integer number:");
            }
            sc.nextLine();  // reset the user input
        }

        int[][] arr = createTwoDimArray();
        System.out.println();


        if (wish == 1) {
            //sum of the rows
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                int[] newArr = new int[arr.length];
                newArr = arr[i];
//TODO: not yet correct, does sum1+sum2+sum3!!
                for (int k = 0; k < arr.length; k++) {
                    sum = sum + newArr[k];
                }
                System.out.println(sum);
            }
        }
    }
}