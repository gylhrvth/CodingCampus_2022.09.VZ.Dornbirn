package franz.week05;

import java.io.File;
import java.io.File;
import java.io.IOException;

public class Countfiles {



        public static void main(String[] args) {
            File f = new File("C:\\Users\\franz\\IdeaProjects\\CodingCampus_2022.09.VZ.Dornbirn\\src\\main\\java\\franz\\week04");
            printFileInformation(countFilesSize(f));
        }

        private static void printFileInformation(File[] child) {
            int summ = 0;
            for (int i = 0; i < child.length; i++) {
                System.out.printf("%6d %s\n", child[i].length(), child[i].getName());
                summ += child[i].length();

            }
            System.out.println("Anzahl der Dateien im Verzeichniss: " + child.length);
            System.out.println("Summe der Groesse der Dateien: " + summ);

        }

        public static File [] countFilesSize(File f){
            File [] child = f.listFiles();

            if(child != null){
                for (int i = 0; i < child.length; i++) {
                    for (int j = 0; j < child.length - i - 1; j++) {

                    }
                }
            }else
                System.out.println("Das ist kein Verzeichniss");

            return child;
        }
}

