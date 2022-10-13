package patric.week05;

import java.io.File;

public class DateienZaehlenUndSummenRekursiv {

    public static void main(String[] args) {
        File f = new File("C:\\Users\\pabos\\IdeaProjects\\CodingCampus_2022.09.VZ.Dornbirn\\src\\main\\java\\");
        printFileInformation(f);
        System.out.println("Count: " + countFilesRecursive(f));
    }


    public static int countFilesRecursive(File start) {
        if (start.isFile()) return 1;

        int count = 0;
        if (start.isDirectory()) {
            File[] children = start.listFiles();
            if (children != null) {
                for (File f : children) {
                    count += countFilesRecursive(f);
                }
            }
        }
        return count;
    }

    public static void printFileInformation(File parent) {
        int summ = 0;
        if (parent.exists() && parent.isDirectory()) {
            File[] child = parent.listFiles();

            for (int i = 0; i < child.length; i++) {
                System.out.printf("%6d %s\n", child[i].length(), child[i].getName());
                summ += child[i].length();
            }
            System.out.println("Anzahl der Dateien im Verzeichnis:    " + child.length);
            System.out.println("Gesamtg Groesse der Dateien " + summ);
        }
    }

}
