package alp.week03;

import java.util.Arrays;
import java.util.Random;


public class ArrayUebungen {

    public static void main(String[] args) {

        System.out.println("Aufgabe Random Number Array - Printforeach");    //name von der Aufgabe
        int[] arrayRandom1 = randomarray.main(9);
        System.out.println(Arrays.toString(arrayRandom1));
        printforeach(arrayRandom1);
        System.out.println();

        System.out.println("Aufgabe Random Number Array - Printfori");      //name von der Aufgabe
        printfori(arrayRandom1);
        System.out.println();

        System.out.println();
        System.out.println("Aufgabe Random Number Array - Printchoosennumberzahl2510");     //name von der Aufgabe
        printchoosennumberzahl2510(arrayRandom1, 1);
        printchoosennumberzahl2510(arrayRandom1, 4);
        printchoosennumberzahl2510(arrayRandom1, 9);
        System.out.println();

        System.out.println("Aufgabe Random Number Array - Print every second number");     //name von der Aufgabe
        printeverysecondnumber(arrayRandom1);
        System.out.println();


        //Neue Aufgabe
        System.out.println("Aufgabe Random Number Array Crazy Range");                //name von der Aufgabe
        System.out.println(Arrays.toString(createRandomArray(30, -50, 50)));
        System.out.println();


        //Neue Aufgabe
        System.out.println("Aufgabe Random Number Array Zählen");                    //name von der Aufgabe
        int[] abc = createRandomArray(20, 0, 100);

        //Werte grösser als 30
        System.out.println("Werte grösser als 30");                                 //name von der Aufgabe
        int count = countWerteUeber30(abc, 30);

        System.out.println(Arrays.toString(abc));
        System.out.println(count);
        System.out.println();


        //Neue Aufgabe

        // das grün geschriebene in den System.out.printLn()funktionen,welche ausgeblendet sind. Sind fleissaufgaben. wie man statt system.out.printLn()
        //auch anderst zeilenumbrüche machen kann, nämlich mit %n.  und %d bedeutet platzhalter für eine Zahl.
        // %s bedeutet platzhalter für einen String.
        //System.out.printf("Das Array hat die Länge %d,%nund der erste wert ist: %d%nund mein Name ist%n%s%n", abc.length, abc[0], "Alp");
        //System.out.println("Das Array hat die Länge " + abc.length + ",\nund der erste wert ist: " + abc[0] + "\nund mein Name ist\n" + "Alp");

        System.out.println("Aufgabe Random Number Array Summe");                        //name von der Aufgabe
        numberArraySumme(abc);
        System.out.println();

    }


    public static void printforeach(int[] arrayName) {                  //Aufgabe Random Number Array - Printforeach
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




    public static void printfori(int[] arrayName) {                     //Aufgabe Random Number Array - Printfori
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




    public static void printchoosennumberzahl2510(int[] arrayname, int index) {                 //Aufgabe Random Number Array - Printchoosennumberzahl2510
        if (index < arrayname.length) {
            System.out.println((index + 1) + ". Value of array is " + arrayname[index]);
        } else {
            System.out.println((index + 1) + ". value of array is Not available.");
        }
    }




    public static void printeverysecondnumber(int[] arrayname) {                    //Aufgabe Random Number Array - Print every second number
        System.out.print("[");
        for (int i = 1; i < arrayname.length; i += 2) {
            if (i > 1) {
                System.out.print(", ");
            }
            System.out.print(arrayname[i]);
        }
        System.out.println("]");
    }



    //100, min: -50, max: 50
    public static int[] createRandomArray(int length, int min, int max) {           //Aufgabe Random Number Array Crazy Range
        Random crazy = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = crazy.nextInt(max - min + 1) + min;
        }
        return array;
    }




    public static int countWerteUeber30(int[] arr, int min) {                       //Aufgabe Random Number Array Zählen
        int count = 0;                                                              ////Werte grösser als 30
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > min) {
                count++;
            }
        }
        return count;
    }




    public static int[] numberArraySumme(int[] arr) {                               //Aufgabe Random Number Array Summe
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
        return arr;

    }

}
