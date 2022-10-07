package patric.week04;

import lukas.data.Texts;


import java.util.Scanner;


public class HesseZaehlen {


    public static void main(String[] args) {
        String text = Texts.HESSE;
        zahlenzaehler(text);
        System.out.println();
        System.out.print(text);


        Scanner scanner = new Scanner(System.in);
        String wort;


        System.out.print("Welches Wort soll gesucht werden?\t");
        wort = scanner.next();

        int counter = 0;
        String[] txtarr = text.split(" ");
        for (int i = 0; i < txtarr.length; i++) {
            if (txtarr[i].contains(wort)) {
                counter++;
            }
        }

        System.out.println("Das Wort \"" + wort + "\" ist " + counter + " mal enthalten. ");
        System.out.println("Befindet sich an der Stelhfdhghlle");
        printWordIndex(text, wort);
        scanner.close();


    }


    public static int[] zahlenzaehler(String text) {

        int[] arr = new int[65535];
        for (int i = 0; i < text.length(); i = i + 1) {
            arr[text.charAt(i)] += 1;
        }
        return arr;

    }

    public static void printWordIndex(String text, String searchWord) {
        int index = text.indexOf(searchWord);
        while (index != -1) {
            System.out.print(index + " ");
            index = text.indexOf(searchWord, index + 1);
        }
        System.out.println();
    }


}
