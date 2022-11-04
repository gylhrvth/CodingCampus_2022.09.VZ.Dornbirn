package gyula.week06;

import java.util.regex.Pattern;

public class IsLatin {
    public static void main(String[] args) {
        char[] eachChars = new char[1 + Character.MAX_VALUE];
        for (int c = 0; c < 1 + Character.MAX_VALUE; c++) {
            eachChars[c] = (char) c;
        }
        String longText = String.valueOf(eachChars);
        System.out.println(longText.replaceAll("\\P{IsLatin}", ""));

        System.out.println();
        for (int i = 0; i < 256; i++) {
            System.out.print(String.valueOf(Character.toChars(0x1f600 + i)));
            char[] t = Character.toChars(0x1f600 + i);
            System.out.printf(" %s %s\n", Integer.toHexString(t[0]), Integer.toHexString(t[1]));
        }
        System.out.println();
    }
}
