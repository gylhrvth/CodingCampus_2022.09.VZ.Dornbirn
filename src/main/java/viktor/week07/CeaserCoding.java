package viktor.week07;

import javax.print.DocFlavor;
import java.util.Arrays;

public class CeaserCoding {

    private static String encryptWithThreeChars(String text) {

        char[] result = new char[text.length()];  // hier werden die neuen Charakters gesammelt
        StringBuilder sb = new StringBuilder();  // am Ende der Funktion wird das Chararray als StringBuilder zurückgegeben

        for (int i = 0; i < text.length(); i++) {

            int c = text.charAt(i);

            if ((c >= 97 && c + 3 <= 122) || (c >= 65 && c + 3 <= 90)) {   // wenn es Klein - oder Großbuchtstaben sind
                c = c + 3;                                                // die zusammen mit den verschobenen Stellen 'z' oder 'Z'
                result[i] = (char) c;                                    // noch nicht erreicht haben, dann wird der Buchstabe um 3 Stellen verschoben

            } else if ((c + 3 > 90) && (c + 3 < 97)) {                  // wenn ein Großbuchtsabe zusammen mit den verschobenen Stellen nach 'Z' wäre,
                int b = (c + 3) - 90 - 1;                              // dann wird der Buchstabe auf Kleinbuchstaben gewechselt und der Kreis geht mit Kleinbuchstaben weiter
                int valueOfSmallLetterFromBigLetter = (int) 'a' + b;    // Siehe Beispiel: 'X' -> a
                result[i] = (char) valueOfSmallLetterFromBigLetter;

            } else if (c >= 220 && c <= 252) {                      //falls der Buchstabe 'ü', 'ö', 'ß', 'ä' wäre, dann bleibt der Buchtabe unverändert
                result[i] = (char) c;

            } else if (c + 3 > 122) {                                // wenn ein Kleinbuchstabe zusammen mit den 3 verschobenen Stellen nach 'z' wäre,
                int r = (c + 3) - 122 - 1;                         // dann wird auf Großbuchstaben gewechselt und der Kreis geht mit Großbuchstaben weiter
                int valueOfBigLetterFromSmallLetter = (int) 'A' + r;    // Siehe Beispiel: 'x' -> 'A'
                result[i] = (char) valueOfBigLetterFromSmallLetter;

            } else {                                                // wenn die obigen Bedingungen nicht erfüllt sind, dann bleibt der Charakter unverändert.
                result[i] = (char) c;                               // Siehe Sonderzeihen: Comma, Point, Space
            }
        }
        sb.append(result);
        return sb.toString();
    }

    private static String decryptWithThreeChars(String text) {

        char[] result = new char[text.length()];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {

            int c = text.charAt(i);

            if ((c >= 100 && c <= 122) || (c >= 68 && c <= 90)) {   // wenn die Kleinbuchstaben zwischen 'z' und 'd' sind, dann kann der Kleinbuchstabe um 3 Stellen abgezogen werden
                c = c - 3;                                          // das Gleiche gilt für die Großbuchstaben
                result[i] = (char) c;

            } else if (c >= 65 && c <= 67 && c - 3 < 65) {          // wenn es 'A', 'B', 'C' wäre und wenn es zusammen mit den 3 abgezogenen Stellen kleiner als 65 ('A') wäre
                int b = 65 - (c - 3) - 1;                           // dann wird es auf Kleinbuchstaben gewechselt und von hinten, von 'z' geht der Kreis weiter,
                int valueOfSmallLetterFromBigLetter = (int) 'z' - b; //  Beispiel: 'A' -> x
                result[i] = (char) valueOfSmallLetterFromBigLetter;

            } else if (c >= 220 && c <= 252) {                     //Falls der Buchstabe 'ü', 'ö', 'ß', 'ä' wäre, dann bleibt der Buchtabe unverändert
                result[i] = (char) c;

            } else if (c >= 97 && c < 100 && c - 3 < 97) {    // wenn es 'a', 'b', 'c' wäre und wenn es zusammen mit den 3 abgezogenen Stellen kleiner als 97 ('a') wäre
                int r = 97 - (c - 3) - 1;                    // dann wird es auf Großbuchstaben gewechselt und von hinten, von 'Z' geht der Kreis weiter,
                int valueOfBigLetterFromSmallLetter = (int) 'Z' - r; // Beispiel: 'a' -> 'X'
                result[i] = (char) valueOfBigLetterFromSmallLetter;

            } else {                                       // wenn die obigen Bedingungen nicht erfüllt sind, dann bleibt der Charakter unverändert.
                result[i] = (char) c;                      // Siehe Sonderzeihen: Comma, Point, Space
            }
        }
        sb.append(result);
        return sb.toString();
    }

    public static void main(String[] args) {

        String text = "Dies ist ein Beispieltext der mit einem Klick verschlüsselt werden kann. Hier kann auch\n" +
                "ein eigenen Text herein geschrieben, oder ein Geheimcode zum Entschlüsseln herein\n" +
                "kopiert werden.";

        System.out.println("Encrypted text:\n" + encryptWithThreeChars(text) + "\n");

        String decryptText = encryptWithThreeChars(text);
        System.out.println("Decrypted text: \n" + decryptWithThreeChars(decryptText) + "\n");

    }
}
