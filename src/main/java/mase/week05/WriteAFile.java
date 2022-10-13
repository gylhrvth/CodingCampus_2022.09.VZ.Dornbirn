package mase.week05;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class WriteAFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String space = "1";
        System.out.println("Geben Sie was ein: ");


        try {
            File f = new File("assets/tmp/output.txt");
            f.getParentFile().mkdirs();
//            System.out.println(f.getParentFile());
            PrintStream ps = new PrintStream(new FileOutputStream(f, false));

            while (!space.equals("")){
                space = sc.nextLine();
                ps.println(space);
            }
            ps.close();
        }catch (IOException ioe){
            System.out.println("Ich kann nicht schreiben");
            ioe.printStackTrace();
        }




    }
}
