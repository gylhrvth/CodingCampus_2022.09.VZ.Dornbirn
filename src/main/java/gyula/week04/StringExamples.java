package gyula.week04;

import java.util.Scanner;

public class StringExamples {

    public static void main(String[] args) {
        System.out.println("Geben Sie ein Text ein:");
        System.out.print(">> ");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String revText = reverse3(text);
        System.out.println(text + " >> " + revText);
    }

    public static String reverse1(String input){
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            result += input.charAt(input.length() - 1 -i);
        }
        return result;
    }

    public static String reverse2(String input){
        char[] arr = input.toCharArray();
        char[] rev = new char[arr.length];
        for (int i = 0; i < rev.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }

        return new String(rev);
    }

    public static String reverse3(String input){
        char[] arr = input.toCharArray();
        for (int i = 0; i < arr.length / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        return new String(arr);
    }

}
