package patric.week05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BuchstabenZaehlen {

    public static void main(String[] args) {
        File f = new File("assets/log/logging.txt");

        try {
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }

    }
}
