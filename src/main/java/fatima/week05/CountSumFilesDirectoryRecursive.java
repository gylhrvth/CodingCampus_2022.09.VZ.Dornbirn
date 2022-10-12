package fatima.week05;

import java.io.File;

public class CountSumFilesDirectoryRecursive {
    public static void main(String[] args) {
        File file = new File("/Users/fatimadogan/IdeaProjects/CodingCampus_2022.09.VZ.Dornbirn/src/main/java/fatima/week05");
        System.out.println("Number of files in directory: " + countRecursive(file));
        System.out.println("Sum of length: " + sumRecursive(file));
    }

    public static int countRecursive(File start) {
        if (start.isFile()) return 1;
        int count = 0;
        if (start.isDirectory()) {
            File[] children = start.listFiles();
            for (File f : children) {
                count += countRecursive(f);
            }
        }
        return count;
    }

    public static long sumRecursive(File start) {
        if (start.isFile()) return start.length();
        long size = 0;
        if (start.isDirectory()) {
            File[] children = start.listFiles();
            for (File f : children) {
                size += sumRecursive(f);
            }
        }
        return size;
    }
}
