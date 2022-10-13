package martin;

import java.util.Scanner;

public class MWerkzeuge {
    public static String readUserInputString(String aufforderung) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%s",aufforderung);
        return sc.nextLine();
    }
    public static void head(String symbol, String aufgabenTitel) {
        System.out.println(symbol.repeat(4 + aufgabenTitel.length()));
        System.out.println(symbol + " " + aufgabenTitel + " " + symbol);
        System.out.println(symbol.repeat(4 + aufgabenTitel.length())+"\n");
    }

}
