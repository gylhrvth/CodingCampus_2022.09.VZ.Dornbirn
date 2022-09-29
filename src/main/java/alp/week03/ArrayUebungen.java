package alp.week03;

import java.util.Arrays;
import java.util.Random;


public class ArrayUebungen {

    public static void main(String[] args) {
        /*
        AufgabeNumberArray.main();
        System.out.println();
        AufgabeNumberArray2.main();
        System.out.println();
        */
        int[] arrayRandom1 = randomarray.main(9);
        System.out.println(Arrays.toString(arrayRandom1));
        printforeach(arrayRandom1);
        System.out.println();
        printfori(arrayRandom1);
        System.out.println();
        printchoosennumberzahl2510(arrayRandom1, 1);
        printchoosennumberzahl2510(arrayRandom1, 4);
        printchoosennumberzahl2510(arrayRandom1, 9);
        System.out.println();
        printeverysecondnumber(arrayRandom1);
        System.out.println();
        // crazyRange(new int[100]);
        // System.out.println();
        System.out.println(Arrays.toString(createRandomArray(30, -50, 50)));
        System.out.println();

        int [] abc =createRandomArray(100,0,100);
        int count = countWerteUeber30(abc, 30);
        System.out.println(Arrays.toString(abc));
        System.out.println(count);

    }

    public static void printforeach(int[] arrayName) {
        System.out.print("[");
        boolean firstLine = true;
        for (int i : arrayName) {
            if (firstLine) {
                firstLine = false;
            } else {
                System.out.print(", ");
            }
            System.out.print(i);
        }
        System.out.println("]");
    }

    public static void printfori(int[] arrayName) {
        System.out.print("[");
        boolean firstLine = true;
        for (int i = 0; i < arrayName.length; i++) {
            if (firstLine) {
                firstLine = false;
            } else {
                System.out.print(", ");
            }
            System.out.print(arrayName[i]);

        }
        System.out.print("]");

    }

    public static void printchoosennumberzahl2510(int[] arrayname, int index) {
        if (index < arrayname.length) {
            System.out.println((index + 1) + ". Value of array is " + arrayname[index]);
        } else {
            System.out.println((index + 1) + ". value of array is Not available.");
        }
    }

    public static void printeverysecondnumber(int[] arrayname) {
        System.out.println("Print every second number.");
        System.out.print("[");
        for (int i = 1; i < arrayname.length; i += 2) {
            if (i > 1) {
                System.out.print(", ");
            }
            System.out.print(arrayname[i]);
        }
        System.out.println("]");
    }

//    public static void crazyRange(int[] array5) {
//        Random crazy = new Random();
//        System.out.print("[");
//        for (int i = 0; i < array5.length; i++) {
//            int randomNumber = crazy.nextInt(101) - 50;
//            array5[i] = randomNumber;
//            System.out.print(randomNumber + " ,");
//        }
//    }

    //100, min: -50, max: 50
    public static int[] createRandomArray(int length, int min, int max) {
        Random crazy = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = crazy.nextInt(max - min + 1) + min;
        }
        return array;
    }

    public static int countWerteUeber30(int[] arr, int min) {
       // System.out.println("[");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > min) {
                count++;
            }
        }
        return count;
    }
}
