package franz.week03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class ArraysExample {
    private static Random rand = new Random();

    public static void main(String[] args) {
        uebersicht();
        uebungNumberArray();


        int[] testArray = generateNumberArray();
        int[] secondArray = uebungCopy(testArray);
        int[] thirdArray = generateNumberArray2(20);


        System.out.println("original: " + Arrays.toString(testArray));
        System.out.println("copy    : " + Arrays.toString(secondArray));
        System.out.println("newarr  : " + Arrays.toString(thirdArray));

    }


    public static void uebersicht() {
        System.out.println("Übung mit Arrays");
        //Body
        int[] arr = {10, 12, 14, 22};
        System.out.println("Ausgabe Ort des Arr");
        System.out.print("arr" + arr);
        System.out.println("arr: ");

        //Umständlich
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            System.out.println();
        }
        //Variante Kurz
        System.out.println("Kurzer Print");
        System.out.println("arr: " + Arrays.toString(arr));

        System.out.println("-----------------------------------");
        System.out.println("mit double");
        double[] temperatur = new double[100];
        for (int i = 0; i < temperatur.length; i++) {
            temperatur[i] = i * 0.25;
        }
        System.out.println("temperatur" + Arrays.toString(temperatur));
        System.out.println("-----------------------------------");
        System.out.println("\n");
    }

    public static void uebungNumberArray() {
        System.out.println("Aufgabe: Number Array");
        System.out.println("Wie viel Stellen benoetigt Ihre Eingabe?");
        int size = readN();

        int[] template = new int[size];
        for (int i = 0; i < template.length; i++) {
            template[i] = i + 1;
        }
        System.out.print(Arrays.toString(template));

        System.out.println("\n");
        int[] template2 = new int[size];
        for (int j = 0; j < template2.length; j++) {
            template2[j] = template2.length - j;
        }
        System.out.print(Arrays.toString(template2));
        System.out.println("\n");
    }

    public static int[] generateNumberArray() {
        System.out.println("Wie viel Stellen benoetigt Ihre Eingabe?");
        int size = readN();

        int[] template = new int[size];
        for (int i = 0; i < template.length; i++) {
            template[i] = i + 1;
        }
        return template;
    }


    public static int readN() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            if (sc.hasNextInt()) {
                return sc.nextInt();
            } else {
                System.out.println("Geben Sie eine Ganzzahl ein");
                sc.next();
            }
        }
    }

    public static int[] uebungCopy(int[] original) {
        int[] myCopy = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            myCopy[i] = original[i];
        }
        return myCopy;
    }

    public static int arrRandom() {
        int arrRandom = rand.nextInt(0, 101);
        return arrRandom;
    }

    public static int[] generateNumberArray2(int size) {
        System.out.println("Array wird Automatisch ausgegeben");
        int[] template = new int[size];
        for (int i = 0; i < template.length; i++) {
            template[i] = rand.nextInt(0, 101);
        }
        return template;
    }
}
