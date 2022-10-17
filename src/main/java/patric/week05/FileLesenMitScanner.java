package patric.week05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileLesenMitScanner {

    public static void main(String[] args) {
        File f = new File("C:\\Users\\pabos\\IdeaProjects\\CodingCampus_2022.09.VZ.Dornbirn\\assets\\log\\logging.txt");

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
