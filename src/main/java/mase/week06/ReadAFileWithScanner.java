package mase.week06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadAFileWithScanner {
    public static void main(String[] args) {
        File f = new File("/Users/masecajic/IdeaProjects/CodingCampus_2022.09.VZ.Dornbirn/assets/tmp/loggFile.txt");

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
