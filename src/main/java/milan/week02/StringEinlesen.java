package milan.week02;

import java.util.Scanner;

public class StringEinlesen {

    public static void main(String[] args) {

        String text = readUserInputString();
        System.out.println("Ihre Eingabe: " + text);
    }

    public static String readUserInputString() { //"String" anstelle von "void" weil man als return ein String erwartet.
        Scanner sc = new Scanner(System.in); // erstellt einen Scanner
        System.out.println("Bitte geben Sie einen Text ein.");
        String line = sc.nextLine(); //hier wird der Input gelesen

        return line; //die Eingabe wird zurück gegeben

    }
}
