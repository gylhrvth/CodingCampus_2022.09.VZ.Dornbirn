package stefan.week01;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Counting {


    public static void main(String[] args) {
        int[] value = newArray(10);

        System.out.print("Arrray" + Arrays.toString(value));
        verschiedeneKreise();
        System.out.println();
        System.out.println();
        weihnachtsbaum("x", 5);
        System.out.println();
        hallo("y", 4);
        System.out.println();
        count(0.1, 0.1);
        count2("_", 4);
        brunch1("number", 5);
        System.out.println();
        System.out.println("Prüfen;ob die Beute fair aufgeteilt werden kann");
        beuteAufteilen();
        helloWorld();
    }

    public static void weihnachtsbaum(String text, int hoehe) {

        // jede Zeile 1 mal durchlaufen
        for (int i = 0; i < hoehe; i++) {
            //ausgabe der Leerzeichen
            for (int j = 0; j < hoehe + 1 - i; j++) {
                System.out.print(" ");
            }
            //Sterne ausgeben
            for (int k = 0; k < i * 2 + 1; k++) {
                System.out.print(text);
            }
            System.out.println();

        }

    }

    public static void hallo(String text, int stuck) {
        for (int i = 0; i < stuck; i++) {
            for (int j = 0; j < stuck; j++) {
                if (i + j == stuck - 1) {
                    System.out.print(text);

                } else {
                    System.out.print(".");
                }

            }
            System.out.println();
        }


    }

    public static void count(double anzahl, double size) {
        for (double i = 0.1; i < 100.0; i++) {
            System.out.print(i);
            System.out.println();
        }
    }

    public static void count2(String text, double size) {
        {
            System.out.print(size / 3 + (size / 10f));
            System.out.println();
        }

    }

    public static void brunch1(String number, double size) {
        for (double i = 0.1; i <= 100.00; i += 0.1) {

            System.out.print("nummber" + i);
            System.out.println();
        }


        System.out.println("-----------------------");
        for (double i = 1; i < 1000; i++) {
            System.out.println("number" + (i / 10f));
        }
    }

    public static int[] newArray(int size) {
        Random randy = new Random(100);
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = randy.nextInt(100);
        }
        return arr;
    }


    public static void verschiedeneKreise() {

        int x = 100;
        int y = 110;
        double r = 20.5;

        System.out.println("<svg height=\"100\"with=\1000\">");
        System.out.print("<circle cx=\"");
        System.out.print(x);
        System.out.print("\" cy=\"");
        System.out.print(y);
        System.out.print("\" r=\"");
        System.out.print(r);
        System.out.println("\" />");
        System.out.println("</svg>");
    }

    public static void beuteAufteilen() {
        System.out.println("Number of bottles in total");
        int bottles = new Scanner(System.in).nextInt();


        int captainciao = bottles / 2;
        int crew = bottles - captainciao;

        System.out.println("Bottles for the captain:" + captainciao);
        System.out.println("Bottles for all the crew remainder" + crew);
        System.out.println("Number of the crew members:");
        int crewMemers = new Scanner(System.in).nextInt();
        System.out.println("Fair share without remainder" + (crewMemers % crew == 0));

    }


    public static void helloWorld() {
        for (int i = 1; i <= 10; ++i) {

            System.out.print(i);

            if (i == 1) {
                System.out.print("st ");
            } else if (i == 2) {
                System.out.print("nd ");
            } else


                System.out.print("th ");
            System.out.println("Hello World");

        }


    }
}


