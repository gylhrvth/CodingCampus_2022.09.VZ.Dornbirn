package berna.week05;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class WriteFileUserInput {
    //exercise 6: read user input and write user inputs in a file
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your text: ");

        //String line = "bla"; // when here, this would be the first line in the file!!

        try {
            File path = new File("assets/tmp/output.txt");
            path.getParentFile().mkdirs();
            FileOutputStream fos = new FileOutputStream(path, true);
            PrintStream ps = new PrintStream(fos);
            String line = "bla"; //
            while (!line.equals("")) {
                line = sc.nextLine();
                ps.println(line);
            }
            ps.close();
            System.out.println("File created:  " + path.getName());


        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}