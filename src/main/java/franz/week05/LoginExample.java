package franz.week05;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class LoginExample {
    public static void main(String[] args) {
        System.out.println("Gib was ein:");
        Scanner sc = new Scanner(System.in);
        String usinput = sc.nextLine();

        try {
            File f = new File("assets\\tmp\\output.txt");
            PrintStream ps = new PrintStream(new FileOutputStream(f));
            while (!usinput.equals("")) {
                ps.println(usinput);
                usinput = sc.nextLine();
            }
            ps.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();

        }
    }
}