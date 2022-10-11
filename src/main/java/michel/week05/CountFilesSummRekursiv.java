package michel.week05;

import java.io.File;

public class CountFilesSummRekursiv {
    public static void main(String[] args) {
        File f = new File("/Users/sutez/IdeaProjects/CodingCampus_2022.09.VZ.Dornbirn/src/main/java/michel");
        printFileInformation(f);
        System.out.println("Dateien im Verzeichniss: " + countFilesRecursive("", f));
    }

    public static int countFilesRecursive(String prefix, File start) {
        System.out.println(prefix + start.getName());
        if (start.isFile()) return 1;
        int count = 0;
        if (start.isDirectory()) {
            File[] child = start.listFiles();
            if (child != null) {
                for (File f : child) {
                    count += countFilesRecursive("   " + prefix, f);
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