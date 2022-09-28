package berna.week03;


import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class ArraysBasics {
    private static Random rand = new Random();    // in the very beginning, initiate random

    public static void main(String[] args) {

        System.out.println("\n");
        createArraysExamples();
        System.out.println("\n");
        testCopying();
        System.out.println("\n");
        randomNumberArrayexamples();
        System.out.println("\n");
        randomNumberArrayCrazyRange();

    }


    public static int askArrayLength() {

        int length = 0; //length of array
        System.out.println(" Length of your array?");

        Scanner sc = new Scanner(System.in);

        while (length == 0) {
            try {
                length = sc.nextInt();
                if (length <= 0) {
                    System.out.println("length must be > 0!!! Give new length: ");
                    length = 0;  // reset the number to zero because you defined while ==0!
                }
            } catch (InputMismatchException ime) {
                System.out.println("This was not a number! Enter an integer number:");
            }
            sc.nextLine();  // reset the user input
        }

        //System.out.println("Your array has the length " + length);
        //System.out.println("\n");
        return length;
    }

    public static void createArraysExamples() {

        System.out.println(" Two arrays will be created. Number 1 is like [1, 2, 3,...] and Number 2 is like  [..., 3, 2, 1]  ");

        int length = askArrayLength();

        int[] arr = new int[length];   //new array with length length

        for (int i = 0; i < length; i++) {      //fill the array with 1,2,3,...
            arr[i] = i + 1;
        }

        System.out.println("Here is your array number 1:");
        System.out.println(Arrays.toString(arr));
        System.out.println("\n");

        System.out.println("Here is your array number 2:");
        int[] arr2 = new int[length];
        for (int i = 0; i < length; i++) {      //fill the array with ...,3,2,1
            arr2[i] = length - i;
        }
        System.out.println(Arrays.toString(arr2));
        System.out.println("\n");

    }


    public static int[] makeACopy(int[] original) {
        System.out.println("we make a copy! ");

        int[] copy = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];

        }
        System.out.println("original was: " + Arrays.toString(copy));
        System.out.println("copy is:      " + Arrays.toString(copy));
        return copy;

    }

    public static void testCopying() {
        int[] testArr = createRandomArray(0, 100);
        int[] modified = makeACopy(testArr);
        modified[0] = -999;
        System.out.println("modified: " + Arrays.toString(modified));
    }


    public static int[] createRandomArray(int lowerbound, int upperbound) {

        System.out.println("Let´s create an array filled with random numbers!");
        int length = askArrayLength();

        int[] arr = new int[length];
        for (int i = 0; i < length; ++i) {
            // TODO: 27.09.2022 nextInt() with two parameters is a new feature in Java. Older libraries may not have. Try it with the single parameter nextInt() too :-)
            arr[i] = rand.nextInt(lowerbound, upperbound);
        }

        return arr;
    }


    public static void randomNumberArrayexamples() {


        int[] arr = createRandomArray(0, 100);
        System.out.println("Here is your random array filled with random numbers:");
        System.out.println(Arrays.toString(arr));

        System.out.println("Here is your hand-made random array made with 'foreach'");
        //foreach returns ALL VALUES of an array. to log an array which looks like [a,b,c,d] you need the values (a b c d) and commas within []

        System.out.print("[");
        //change your point of view: print a comma IN FRONT OF the value!!
        //if so, value nr. 1 is special because no comma is needed
        //define a criteria which is only valid for the first value!
        boolean isCommaNecessary = false;   //is false only for first iteration step
        for (int value : arr) {
            if (isCommaNecessary) {
                System.out.print(", ");
            }
            System.out.print(value);
            isCommaNecessary = true;        //is now true for all following iterations
        }
        System.out.println("]");


        System.out.println("\n");
        System.out.println("Here is your hand-made random array made with 'fori'");


        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println("\n");
        System.out.println("Here are the values nr. 2, 5 and 10 of your random array:");

        if (arr.length < 2) {
            System.out.println("Your array was too short, so there is no value nr. 10,  5 and 2! ");

        } else if (arr.length < 5) {
            System.out.println("Value number two = " + arr[1]);
            System.out.println("Your array was too short, so there is no value nr. 10 and no nr. 5! ");

        } else if (arr.length < 10) {
            System.out.println("Value number two = " + arr[1]);
            System.out.println("Value number five = " + arr[4]);
            System.out.println("Your array was too short, so there is no value nr. 10! ");

        } else {
            System.out.println("Value number two = " + arr[1]);
            System.out.println("Value number five = " + arr[4]);
            System.out.println("Value number ten = " + arr[9]);
        }

        System.out.println("\n");
        System.out.println("Here is every second entry of your random array:");


        System.out.print("[");
        for (int i = 1; i < arr.length; i = i + 2) {
            //System.out.println(arr[i]);       logs single values in a column!
            //if (i % 2 != 0) {         not necessary, way easier with i=i+2!
            if (i > 1) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.println("]");
    }


    public static void randomNumberArrayCrazyRange() {
        System.out.println("Here is your random array filled with random number from -50 to 50:");
        int[] arr = createRandomArray(0, 100);
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i] - 50;
        }
        System.out.println(Arrays.toString(arr));
    }


}






