package michel.week04;


import java.util.Scanner;

public class ReverseStringArray {
    public static void main(String[] args) {
        System.out.println("Wilkommen zum Reverse Programm:");
        String reverseWord = userInput();
        System.out.println("Reversed word:");
        System.out.println(reverseString(reverseWord));
    }

    public static String userInput() {
        System.out.println("Geben Sie ein Wort ein:");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        return line;
    }

    public static String reverseString(String reverseString) {
        String reversedString;
        char[] splitString = reverseString.toCharArray();
        char[] newStringCharArray = new char[reverseString.length()];
        for (int i = 0; i < reverseString.length(); i++) {
            newStringCharArray[i] = splitString[reverseString.length() - 1 - i];
        }
        reversedString = new String(newStringCharArray);
        return reversedString;
    }
}
