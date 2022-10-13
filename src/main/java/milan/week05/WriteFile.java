package milan.week05;

import milan.week02.UserInput;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class WriteFile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte Text eingeben: ");
        String userInput = sc.nextLine();


        try {
            File f = new File("assets\\tmp\\output.txt");
            f.getParentFile().mkdirs();
            PrintStream ps = new PrintStream(new FileOutputStream(f, true));
            while (!userInput.equals("")) {             // Bei Objekten (Strings) equals! verwenden. != funktioniert nur bei nativen Datentypen!!!
                ps.println(userInput);
                userInput = sc.nextLine();
            }
            ps.close();
            System.out.println("Auf Wiedersehen!");
        } catch (IOException ieo) {
            ieo.printStackTrace();
        }
    }
}
