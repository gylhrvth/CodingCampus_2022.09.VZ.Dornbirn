package stefan.Test;


import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        String text = userText();
        int number = userNumber();
        for (int i = 0; i < number; i++) {
            System.out.println(text);
        }
    }


    public static String userText() {
        System.out.println("Geben sie ein Text ein");
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        return text;
    }

    public static int userNumber() {
        System.out.println("Geben sie eine Zahl ein");
        try {
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            return number;


        } catch (InputMismatchException ime) {
            System.err.println("Es ist keine Zahl");
        }

        return userNumber();
    }


}
