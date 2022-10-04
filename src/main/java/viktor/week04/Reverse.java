package viktor.week04;

import java.awt.image.TileObserver;
import java.util.Arrays;
import java.util.Scanner;

public class Reverse {

    public static void printToReverse(String text) {

        char[] reservedText = text.toCharArray();
        char[] newString = new char[text.length()];

        int j = 0;

        for (int i = text.length() - 1; i >= 0; i--) {

            while (j < text.length() - i) {
                newString[j] = reservedText[i];
                j++;
            }
        }

        String output = new String(newString);
        System.out.println("Reserve: " + output);

    }


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Gib mir bitte einen String an: ");
        String text = sc.nextLine();

        printToReverse(text);

    }

}

