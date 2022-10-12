package fatima.week05;

import java.io.File;

public class FindLargestFile {
    public static void main(String[] args) {
        File file = new File("/Users/fatimadogan/IdeaProjects/CodingCampus_2022.09.VZ.Dornbirn/src/main/java");

        File result = largestFile(file);
        System.out.println(result.getAbsoluteFile());
        System.out.println("relative path: " + result.getAbsolutePath().substring(file.getAbsolutePath().length() + 1));
        System.out.println("size of the largest file: " + result.length());
    }

    public static File largestFile(File start) {
        if (start.isFile()) return start;

        File largest = null;
        if (start.isDirectory()) {
            File[] children = start.listFiles();
            for (File f : children) {
                File largestInSubdirectory = largestFile(f);
                if (largestInSubdirectory != null){
                    if ((largest == null) || (largest.length() < largestInSubdirectory.length())) {
                        largest = largestInSubdirectory;
                    }
                }
            }
        }
        return largest;
    }

}

