package fatima.week04;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("Welcome to the reverse program!");
        System.out.println("Enter a text");
        String text = readUserInputString();
        String rev = reverse(text);
        System.out.println(text + " >> " + rev);
    }

    public static String readUserInputString() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static String reverse(String input) {
        char[] arr = input.toCharArray();
        char[] rev = new char[arr.length];
        for (int i = 0; i < rev.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }
        return new String(rev);
    }
}

