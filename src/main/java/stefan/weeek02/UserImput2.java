package stefan.weeek02;


import org.w3c.dom.Text;
import stefan.week01.CountingWithFunktionen;

import javax.swing.*;
import java.util.Scanner;
import java.util.InputMismatchException;

public class UserImput2 {

    public static void main(String[] args) {


        String text = readUserInputString();
        int size = readUserInputInteger2();
        //CountingWithFunktionen.printSlash(text,size);
        System.out.println("Ergbnis:"+ text+size);
    }

    public static String readUserInputString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben sie ein Text ein");
        String line = sc.nextLine();

        return line;
    }

    public static int readUserInputInteger2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben sie eine Zahl ein");
        int value = Integer.MIN_VALUE;
        try
        {
            value = sc.nextInt();
        }catch (InputMismatchException ime) {
            System.out.println("Es ist Keine Zahl");
        }while (value==Integer.MIN_VALUE);


        return value;

    }


}