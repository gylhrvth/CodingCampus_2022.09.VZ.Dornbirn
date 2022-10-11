package milan.week05;

import java.io.File;

public class RekursionZaehlenUndSumme {
    public static void main(String[] args) {


        File f = new File("C:\\Users\\Dell\\IdeaProjects\\CodingCampus_2022.09.VZ.Dornbirn\\src\\main\\java\\milan");
        int anzahl = countFilesInList("", f);
        long size = countSizeInList("", f);
        System.out.println("Anzahl der Dateien: " + anzahl);
        System.out.println("Größe aller Dateien: " + size + " Byte.");
    }

    public static int countFilesInList(String prefix, File start) {
        int count = 0;
        //System.out.println(prefix + start.getName() + " ");
        if (start.isFile()) {
            count = 1;
        }
        if (start.isDirectory()) {
            File[] children = start.listFiles();
            if (children != null) {
                for (File f : children) {
                    count = count + countFilesInList("  " + prefix, f);
                }
            }
        }
        return count;
    }

    public static long countSizeInList(String prefix, File start) {
        long size = 0;
        //System.out.println(prefix + start.getName() + " ");
        if (start.isFile()) {
            size = start.length();
        }
        if (start.isDirectory()) {
            File[] children = start.listFiles();
            if (children != null) {
                for (File f : children) {
                    size = size + countSizeInList("  " + prefix, f);
                }
            }
        }
        return size;

    }
}
