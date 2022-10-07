package mase.week04;

import java.util.Random;
import java.util.Scanner;

public class Randommize {
   public static Random random = new Random();

    public static void main(String[] args) {
        System.out.println("Geben Sie ein Wort ein");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        randomizedString(text);
        System.out.println(randomizedString(text));
    }

    public static String randomizedString(String input) {
        char[] arr = input.toCharArray();
        for (int i = 0; i <3 * input.length(); i++) {
            int posA = random.nextInt(arr.length);
            int posB = random.nextInt(arr.length);

            char temp = arr[posA];
            arr[posA] = arr[posB];
            arr[posB] = temp;

        }
        return new String(arr);

    }
}