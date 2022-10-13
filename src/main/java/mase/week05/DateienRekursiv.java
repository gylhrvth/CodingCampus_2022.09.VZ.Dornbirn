package mase.week05;

import java.io.File;

public class DateienRekursiv {
    public static void main(String[] args) {
        File f = new File("/Users/masecajic/IdeaProjects/CodingCampus_2022.09.VZ.Dornbirn/src/main/java/mase");
        System.out.println("Count Files:  " + printRekursion(f));
        System.out.println("Size of Files: " + printFile(f));

    }

    public static int printRekursion(File start) {
        if (start.isFile()) return 1;
        int count = 0;
        if (start.isDirectory()) {
            File[] files = start.listFiles();
            for (File f : files) {
                count += printRekursion(f);
            }
        }
        return count;
    }

    public static long printFile(File first) {
        if (first.isFile()) return first.length();
        long size = 0;

        if (first.isDirectory()) {
            File[] child = first.listFiles();

                for (File f : child) {
                    size += printFile(f);

                }

        }
        return size;
    }
}

