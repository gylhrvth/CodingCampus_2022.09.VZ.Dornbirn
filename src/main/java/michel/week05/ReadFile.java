package michel.week05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Objects;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {

        System.out.println("Scanner: ");
        readFileScanner();
        System.out.println();
        System.out.println("Buffered Reader 1: ");
        readFileBuffered1();
        System.out.println();
        System.out.println("Buffered Reader 2: ");
        readFileBuffered2();

    }

    public static void readFileBuffered2() {
        try{
            Reader reader = new InputStreamReader(
                    Objects.requireNonNull(
                            ReadFile.class.getClassLoader().getResourceAsStream("txt/simpleText.txt")));
            BufferedReader br = new BufferedReader(reader);
            while(br.ready()){
                String line = br.readLine();
                System.out.println("Read Line with Buffered Reader: " + line);
            }br.close();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }

    public static void readFileBuffered1() {
        String fileName = "/Users/sutez/IdeaProjects/CodingCampus_2022.09.VZ.Dornbirn/assets/tmp/loggFile.txt.old";
        File f = new File(fileName);

        if (!f.canRead() || !f.isFile())
            System.exit(0);

        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println("Read Line with Buffered Reader: " + line);
            }
        } catch (IOException ie) {
            ie.printStackTrace();
        } finally {
            if (in != null)
                try {
                    in.close();
                } catch (IOException ie) {
                }
        }
    }
    public static void readFileScanner() {

        Scanner scan = null;
        try {
            scan = new Scanner(new File("/Users/sutez/IdeaProjects/CodingCampus_2022.09.VZ.Dornbirn/assets/tmp/loggFile.txt.old"));
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
        while (scan.hasNext()) {
            System.out.println("Read Line with Scanner: " + scan.nextLine());
        }
        scan.close();

    }
}
