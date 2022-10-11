package milan.week05;

import java.io.File;

public class DateiZaehlenUndSumme {
    public static void main(String[] args) {

        File f = new File("C:\\Users\\Dell\\IdeaProjects\\CodingCampus_2022.09.VZ.Dornbirn\\src\\main\\java\\milan\\week05");

        System.out.println("Verzeichnis: " + f.getAbsolutePath());
        System.out.println("--------------------------------------");
        File[] childFiles = f.listFiles();

        int anzahl = countFiles(childFiles);
        long size = countSize(childFiles);
        System.out.println("Anzahl Dateien im Verzeichnis: " + anzahl + "\nDie Summe der Dateigrößen berträgt: " + size + " Byte");
    }

    public static long countSize(File[] childFiles) {
        long size = 0;
        if (childFiles != null) {
            for (int j = 0; j < childFiles.length; j++) {
                if (!childFiles[j].isDirectory() && childFiles[j].isFile()) {
                    size = size + childFiles[j].length();
                }
            }
        } else {
            System.out.println("Es ist kein Verzeichnis");
        }
        return size;

    }

    public static int countFiles(File[] childFiles) {
        int count = 0;
        if (childFiles != null) {
            for (int j = 0; j < childFiles.length; j++) {
                if (!childFiles[j].isDirectory() && childFiles[j].isFile()) {
                    ++count;
                }
            }
        } else {
            System.out.println("Es ist kein Verzeichnis");
        }
        return count;
    }
}
