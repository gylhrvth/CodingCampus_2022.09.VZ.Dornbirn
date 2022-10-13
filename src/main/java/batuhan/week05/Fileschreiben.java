package batuhan.week05;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Fileschreiben {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Was wollen sie Schreiben? ");


        try {
           File f = new File("assets/tmp/output.txt.");
           f.getParentFile().mkdirs();
           PrintStream ps = new PrintStream(new FileOutputStream(f));
           String line = sc.nextLine();
           while (!line.equals("")) {
               ps.println(line);
               line = sc.nextLine();
           }
           ps.close();

       }catch (IOException ioe){
           System.out.println("Ich kann nicht schreiben");
           ioe.printStackTrace();
       }

    }


}
