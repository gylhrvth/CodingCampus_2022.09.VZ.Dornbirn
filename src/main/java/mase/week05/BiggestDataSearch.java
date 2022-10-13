package mase.week05;

import java.io.File;

public class BiggestDataSearch {
    public static void main(String[] args) {
        File f = new File("/Users/masecajic/IdeaProjects/CodingCampus_2022.09.VZ.Dornbirn/src/main/java/mase/week05");
        File result = largestFile(f);
        System.out.println("relativer path: " + result.getAbsolutePath().substring(f.getAbsolutePath().length() + 1));
        System.out.println("size of the largest: " + result.length());
    }

    public static File largestFile(File start) {
        if (start.isFile()) return start;

        File largest = null;
        if (start.isDirectory()) {
            File[] files = start.listFiles();
            for (File f : files) {
                File largestInDirectory = largestFile(f);
                if (largestInDirectory != null) {
                    if ((largest == null) || (largest.length() < largestInDirectory.length())) {
                        largest = largestInDirectory;
                    }
                }
            }
        }
        return largest;


    }
}