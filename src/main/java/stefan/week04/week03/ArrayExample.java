package stefan.week04.week03;


import javax.naming.PartialResultException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayExample {


    public static void main(String[] args) {
        do {

            int anzahl = readUserImput("Geben sie eine Zahl ein");


            int[] arr = new int[anzahl];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i + 1;

                System.out.print(arr[i] + " ");


            }
            System.out.println();
            for (int j = 0; j < arr.length; j++) {
                arr[j] = arr.length - j;

                System.out.print(arr[j] + " ");
            }
            System.out.println();


        }while (readUserInputIntegerJN());

    }

    public static int readUserImput(String promt) {
        Scanner scanner = new Scanner(System.in);
        int num1 = -1;
        while (num1 < 1) {
            System.out.println(promt);
            String line = scanner.nextLine();
            try {
                num1 = Integer.parseInt(line);
            } catch (NumberFormatException nfe) {
            }
        }
        return num1;
    }


    public static boolean readUserInputIntegerJN() {
        System.out.println("Wollen sie eine Kopie [j/n]:");
        Scanner jn = new Scanner(System.in);
        String input = jn.next();
        if (input.equals("j")) {
            return true;
        } else {
            System.err.println(" Goodbye!!!! ");
            return false;

        }

    }
}




