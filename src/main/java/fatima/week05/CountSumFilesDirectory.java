package fatima.week05;

import java.io.File;

public class CountSumFilesDirectory {
    public static void main(String[] args) {
        File file = new File("/Users/fatimadogan/IdeaProjects/CodingCampus_2022.09.VZ.Dornbirn/src/main/java/fatima/week05");
        System.out.println("Number of files in directory: " + countFiles(file));
        System.out.println("Sum of length: " + sumLength(file));
    }

    public static int countFiles(File file) {
        File[] children = file.listFiles();
        int count = 0;
        if (children != null) {
            for (File f : children) {
                if (f.isFile()) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int sumLength(File file) {
        File[] children = file.listFiles();
        int size = 0;
        if (children != null) {
            for (File f : children) {
                if (f.isFile()) {
                    size += f.length();
                }
            }
        }
        return size;
    }
}
