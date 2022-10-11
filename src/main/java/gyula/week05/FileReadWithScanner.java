package gyula.week05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadWithScanner {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\gyula.horvath\\Documents\\CC2022.09\\src\\main\\java\\gyula\\week05\\FileExample.java");

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
