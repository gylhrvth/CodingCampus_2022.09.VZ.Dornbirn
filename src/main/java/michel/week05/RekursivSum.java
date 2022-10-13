package michel.week05;

import java.io.File;

public class RekursivSum {
    public static void main(String[] args) {
        File f = new File("/Users/sutez/IdeaProjects/CodingCampus_2022.09.VZ.Dornbirn/src/main/java");


        System.out.println("Files im Verzeichniss: " + countFiles(f));
        System.out.println("Größe aller Dateien: " + countFileSize(f) + " Byte");

    }

    private static int countFiles(File start) {
        if (start.isFile()) return 1;

        int count = 0;

        if (start.isDirectory()) {
            File[] files = start.listFiles();
            for (File f : files) {
                count += countFiles(f);
            }
        }
        return count;
    }

    private static long countFileSize(File start) {
        if (start.isFile()) return start.length();

        long size = 0;

        if (start.isDirectory()) {
            File[] files = start.listFiles();
            for (File f : files) {
                size += countFileSize(f);
            }
        }
        return size;
    }

}
