package franz.week05;

import java.io.*;
import java.util.Scanner;

public class Schreiben {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();

        try {
            File f = new File("assets\\tmp\\output.txt");

            PrintStream ps = new PrintStream(new FileOutputStream(f, true));

            while (!userInput.equals("")) {
                ps.println(userInput);
                userInput = sc.nextLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}