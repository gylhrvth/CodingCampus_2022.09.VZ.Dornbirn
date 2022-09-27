package milan.week03;

import java.util.Arrays;


public class CopyArray2 {
    public static void main(String[] args) {


        //Klasse: System.arraycopy Methode
        int[] sourceArr = {23, 56, 88, 44, 15, 76, 8, 43, 9, 47, 54, 7, 1, 0, 78, 63, 50, 71, 99};
        int[] destArr = new int[sourceArr.length];

        // sourceArr = von welchem Array kopieren, srcPos0 = von welcher Position, im Source Array, gestartet wird
        // destArr = das Ziel Array welche die Daten übernimmt, destPos = start Position im Kopiertem Array
        // length: länge/anzahl der zu kopierenden Daten
        // length:10 lässt sich auch mit sourceArr.length ersetzen
        System.arraycopy(sourceArr, 0, destArr, 0, 19);
        System.out.println("Original Array: " + Arrays.toString(sourceArr));
        System.out.println("Kopiertes Array: " + Arrays.toString(destArr));
        System.arraycopy(sourceArr, 2, destArr, 0, sourceArr.length - 2);
        System.out.println("Original Array: " + Arrays.toString(sourceArr));
        System.out.println("Kopiertes Array: " + Arrays.toString(destArr));
        System.out.println("--------------------------------------------");

        //KLasse: Arrays.copyOf & Arrays.copyOfRange Methode
        int[] array = {23, 43, 55, 12};
        int newLength = array.length;
        int[] copiedArray = Arrays.copyOf(array, newLength);
        copiedArray[0] = -100;


        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("Kopiertes Array: " + Arrays.toString(copiedArray));
        int[] copiedArray2 = Arrays.copyOfRange(array, 1, 4);
        System.out.println("Kopiertes Array: " + Arrays.toString(copiedArray2));


    }


}
