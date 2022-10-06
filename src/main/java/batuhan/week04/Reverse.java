package batuhan.week04;

import java.util.Scanner;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {

        System.out.println("Bitte geben Sie ein Text für Reverse ein:");
        System.out.print(">> ");
        String text = ReadInput();
        String revText = reverseInput(text);
        System.out.println(text + " >> " + revText);


    }
    public static String ReadInput() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        return input;

    }

    public static String reverseInput(String Input) {
        char[] arr = Input.toCharArray();


        for (int j = 0; j < arr.length / 2; j++) {
            char hold = arr[j];
            arr[j] = arr[arr.length - 1 - j];
            arr[arr.length - 1 - j] = hold;
        }


        String reverse = new String(arr);
        return reverse;
    }


}






