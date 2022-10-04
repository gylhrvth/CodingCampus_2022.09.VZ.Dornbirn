package alp.week04;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        String text = readuserInput();

        String revText = reverse(text);
        System.out.println(text + " >> " + revText);
    }

    public static String readuserInput() {                              //name normal geschrieben
        System.out.println("Geben Sie Bitte einen Namen ein");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        return line;
    }

    public static String reverse(String input) {                        //name rückwärts geschrieben
        char[] arr = input.toCharArray();
        char[] rev = new char[arr.length];
        for (int i = 0; i < rev.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }
        return new String(rev);
    }
}
