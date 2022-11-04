package batuhan.testing;

import batuhan.week03.Array;

import java.text.SimpleDateFormat;
import java.util.*;

public class Ueben {


    public static void main(String[] args) {
//        System.out.println("Hello World");
//
//        for (int i = 10; i >= 0; i--) {
//            System.out.print(i);
//
//
//        }
//        System.out.println();
//
//
//        for (int i = -30; i <= 30; i++) {
//            if (i % 3 == 0) {
//                System.out.print(i);
//            } else {
//                System.out.print(" ");
//            }
//        }
//
//        System.out.println();
//
//        int a = 0;
//        while (a < 10) {
//            if (a > 5) {
//                System.out.print(" ");
//            }
//            a++;
//            System.out.print(a);
//        }
//
//        System.out.println();
//
//
//        printLineStripple("x", 10);
//        System.out.println();
//        printLineStripple2("x", 3);
//        System.out.println();
//        printLineStripple3("x", 4);
//        System.out.println();
//        System.out.println();

//        String text = inputString();
//        int size = inputInterger();
//        ausgabe(text, size);


        System.out.println();
        System.out.println();
        String Uhrzeit = new SimpleDateFormat("dd yyyy.MM.dd ").format(Calendar.getInstance().getTime());
        System.out.println(Uhrzeit);
        int[] a = {4, 8, 5, 9, 2, 3, 10, 1, 7, 6, 0, 11};

        arrays(a);
        System.out.println(Arrays.toString(a));


    }

    public static void printLineStripple(String buchstabe, int anzahl) {
        for (int i = 0; i < anzahl; i++) {
            System.out.print(buchstabe);

        }
    }

    public static void printLineStripple2(String buchstabe, int anzahl) {
        for (int i = 0; i < anzahl; i++) {
            if (i == i) {
                System.out.println(" ");
            }
            System.out.println(buchstabe);

        }
    }

    public static void printLineStripple3(String buchstabe, int anzahl) {
        for (int i = 0; i < anzahl; i++) {
            if (i == 0) {
                System.out.print(buchstabe + buchstabe);

            } else if (i > 1) {
                System.out.println("");

            }
            System.out.println(buchstabe);

        }
    }


    public static String inputString() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welchen Satz wollen Sie verdoppeln? ");
        String text = sc.nextLine();


        return text;
    }

    public static int inputInterger() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wie oft soll der Text wiedergegeben werden?");
        int value = sc.nextInt();

        return value;

    }

    public static void ausgabe(String text, int size) {
        for (int i = 0; i < size; i++) {
            System.out.println(text);

        }
    }

    public static int[] arrays(int[] arr) {
        int value = 0;
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1] ) {
                    value = arr[j];
                    arr[j] = arr[j + 1] ;
                    arr[j + 1] = value;


                }
            }
        }
        return arr;
    }
}






