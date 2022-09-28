package alp.week03;

import alp.week03.AufgabeNumberArray;
import alp.week03.AufgabeNumberArray2;
import alp.week03.Copy;
import alp.week03.randomarray;

import java.util.Arrays;


public class ArrayUebungen {

    public static void main(String[] args) {
        /*
        AufgabeNumberArray.main();
        System.out.println();
        AufgabeNumberArray2.main();
        System.out.println();
        */
        int[] arrayRandom1 = randomarray.main(20);
        System.out.println(Arrays.toString(arrayRandom1));
        Printforeach(arrayRandom1);
        Printfori(arrayRandom1);
    }

    public static void Printforeach(int[] arrayName) {
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

    public static void Printfori(int[] arrayName) {
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
}
