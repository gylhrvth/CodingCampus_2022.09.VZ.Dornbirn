package milan.week04;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {
        System.out.println("Bitte geben Sie ein Text für Reverse ein:");
        System.out.print(">> ");
        String text = readInput();
        String revText = reverseInput(text);
        System.out.println(text + " >> " + revText);
    }


    public static String readInput(){

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        return input;

    }

    public static String reverseInput(String input) {

        char[] arr = input.toCharArray();

        for (int j = 0; j < arr.length / 2; j++) {
            char hold = arr[j];
            arr[j] = arr[arr.length - 1 - j];
            arr[arr.length - 1 - j] = hold;
        }
        String reverse = new String(arr);
        return reverse;
    }
}
