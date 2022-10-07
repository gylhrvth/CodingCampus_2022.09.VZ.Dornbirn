package michel.week04;

import java.util.Random;
import java.util.Scanner;


public class StringArrayShuffle2 {
    private static Random rand = new Random();

    public static void main(String[] args) {
        System.out.println("Bitte geben Sie einen Text ein:");
        Scanner sc = new Scanner(System.in);
        System.out.print(">>");
        String toShuffleWord = sc.nextLine();
        System.out.print(">>");
        System.out.println(shuffledString(toShuffleWord));
    }

    private static String shuffledString(String toShuffleWord) {
        char[] arr = toShuffleWord.toCharArray();
        for (int i = 0; i < 3 * toShuffleWord.length(); i++) {
            int posA = rand.nextInt(arr.length);
            int posB = rand.nextInt(arr.length);
            char temp = arr[posA];
            arr[posA] = arr[posB];
            arr[posB] = temp;
        }
        return new String(arr);
    }
}
