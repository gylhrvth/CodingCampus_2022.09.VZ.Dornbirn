package alp.week04;

import java.util.Random;
import java.util.Scanner;

public class Randomize {

    public static void main(String[] args) {
        System.out.println("Bitte geben Sie einen Text ein");
        String text = readuserInput();

        String randomrevText = randomReverse(text);
        System.out.println(text + ">>" + randomrevText );




    }

    public static String readuserInput() {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        return line;
    }

    public static String randomReverse(String input) {
        char[] arr = input.toCharArray();
        char[] rev = new char[arr.length];
        for (int i = 0; i < rev.length; i++) {
            Random rand = new Random();
            rev[i] = arr[rand.nextInt(arr.length)];
        }
        return new String(rev);
    }

}
