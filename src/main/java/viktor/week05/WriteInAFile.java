package viktor.week05;

import java.io.*;
import java.util.Scanner;

public class WriteInAFile {

    public static void readUserInput(){


        Scanner sc = new Scanner(System.in);
        System.out.println("Gib mir bitte einen Text an: ");
        String input = sc.nextLine();

        try {
            File myFile = new File("assets/tmp/output.txt");
            myFile.getParentFile().mkdirs();
            PrintStream ps = new PrintStream(new FileOutputStream(myFile, false));

            while (!input.equals("")) {
                ps.println(input);
                input = sc.nextLine();
            }
            ps.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args) {

    readUserInput();


    }
}
