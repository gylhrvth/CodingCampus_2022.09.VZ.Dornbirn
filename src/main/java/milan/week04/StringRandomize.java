package milan.week04;

import java.util.Arrays;
import java.util.Random;

public class StringRandomize {

    public static Random ran = new Random();

    public static void main(String[] args) {
        System.out.println("Bitte geben Sie einen Text ein:");
        System.out.println(">> ");
        String text = StringReverse.readInput();
        String randomText = randomizeInput(text);
        System.out.println("Die Buchstaben wurden erfolgreich vertauscht >> " + randomText);

    }

    public static String randomizeInput(String input) {

        char[] arr = input.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int rdm = ran.nextInt(arr.length);
            char hold = arr[i];
            arr[i] = arr[rdm];
            arr[rdm] = hold;
        }
        String random = new String(arr);
        return random;
    }
}
