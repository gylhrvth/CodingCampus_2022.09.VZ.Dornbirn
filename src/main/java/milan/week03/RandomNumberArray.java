package milan.week03;

import java.util.Arrays;
import java.util.Random;

public class RandomNumberArray {

    public static Random ran = new Random();

    public static void main(String[] args) {

        //int[] template = new int[20];
        System.out.println("----------------------------");
        System.out.println();
        int[] template = createArrayWithRandomNum(10);              //!!! int[] template vor der Methode!!!!
        System.out.println();
        System.out.println("----------------------------");
        System.out.println();
        forEachAusgabe(template);                                       // Werte die an die Methode geschickt werden, werden in der () angegeben zBs "template"
        System.out.println();
        System.out.println();
        System.out.println("----------------------------");
        System.out.println();
        forEachAusgabeZweiteWert(template);
        System.out.println();
        System.out.println();
        System.out.println("----------------------------");
        printIndex(2, template);
        printIndex(5, template);
        printIndex(25, template);
    }

    public static int[] createArrayWithRandomNum(int size) {            //public static int[] weil ich das Array wieder retour gebe
        System.out.println("Einfache Ausgabe mit Random Zahlen: ");
        int[] template = new int[size];
        for (int i = 0; i < template.length; i++) {
            int rdm = ran.nextInt(101);
            template[i] = rdm;
        }
        System.out.println(Arrays.toString(template));
        return template;                                                // gibt template zurück damit die anderen Methoden das Array haben!
    }

    public static void forEachAusgabe(int[] template) {                 //(int[] template weil die Methode das Array braucht
        System.out.println("Ausgabe mit foreach: ");
        for (int j : template) {
            System.out.print(j + " ");

        }

    }

    public static void forEachAusgabeZweiteWert(int[] template) {
        System.out.println("Jeder zweiter Wert wird ausgegeben: ");
        for (int i = 1; i < template.length; i = i + 2) {
            System.out.print(template[i] + " ");
        }

    }


    public static void printIndex(int size, int[] template) {
        if (size < template.length) {
            System.out.println("Position " + size + " im Array = " + template[size - 1]);
        } else {
            System.out.println("Position " + size + " ist im Array nicht vorhanden!!!");
        }
    }


}