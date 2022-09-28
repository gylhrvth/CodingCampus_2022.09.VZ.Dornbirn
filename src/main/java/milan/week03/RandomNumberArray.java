package milan.week03;

import java.util.Arrays;
import java.util.Random;

public class RandomNumberArray {

    public static Random ran = new Random();

    public static void main(String[] args) {

        int[] template = new int[20];
        for (int i = 0; i < template.length; i++) {
            int rdm = ran.nextInt(101);
            template[i] = rdm;
        }
        System.out.println();
        System.out.println("----------------------------");
        System.out.println();
        System.out.println("Einfache Ausgabe mit Random Zahlen: ");
        System.out.println(Arrays.toString(template));

        System.out.println("Ausgabe mit foreach: ");
        for (int j : template) {
            System.out.print(j + " ");

        }
        System.out.println();

        System.out.println("Zweiter Wert im Array: " + template[1]); // zweiter Wert im Array
        System.out.println("Fünfter Wert im Array: " + template[4]); // fünfter Wert im Array
        System.out.println("Zehnter Wert im Array: " + template[9]); // zehnter Wert im Array

        System.out.println();
        System.out.println("----------------------------");
        System.out.println();
        System.out.println("Jeder zweiter Wert wird ausgegeben: ");
        for (int i = 1; i < template.length; i = i + 2) {
            System.out.print(template[i] + " ");
        }
        System.out.println();
        System.out.println("Nochmal die ganze Ausgabe (nur zum Vergleich): ");
        for (int j : template) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("----------------------------");
        System.out.println();
    }


}