package michel.week05;

import michel.week02.UserInputs;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class WriteFileSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(">>>");
        String text = sc.nextLine();


            try {
                File f = new File("assets/tmp/output.txt");
                f.getParentFile().mkdirs();
                PrintStream ps = new PrintStream(new FileOutputStream(f, true));
                while(!text.equals("")){
                    ps.println(text);
                    text = sc.nextLine();
                }

                ps.close();

            } catch (IOException ioe) {
                System.out.println("Ich kann nicht schreiben");
                ioe.printStackTrace();
            }


    }
}
