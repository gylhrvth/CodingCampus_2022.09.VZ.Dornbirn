package fatima.week04;

import java.util.Random;
import java.util.Scanner;

public class RandomizeString {

    private static Random rand = new Random();

    public static void main(String[] args) {
        System.out.println("Welcome to random-shuffle-program!");
        System.out.println("Enter a text");
        String text = readUserInputString();
        String random = randomize(text);
        System.out.println(random);
    }

    public static String readUserInputString() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static String randomize(String input) {
        char[] arr = input.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int x = rand.nextInt(arr.length);
            int y = rand.nextInt(arr.length);
            char temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
        }
        return new String(arr);
    }
}

