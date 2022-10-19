package franz.week05;

import java.io.File;

public class BiggestDatei {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\franz\\IdeaProjects\\CodingCampus_2022.09.VZ.Dornbirn\\src\\main\\java\\franz");

        File result = largestFile(f);
        System.out.println(result.getAbsolutePath() + " has size: " + result.length());
        System.out.println(result.getAbsolutePath().substring(f.getAbsolutePath().length()+1));
    }

    public static File largestFile(File start) {
        if (start.isFile()) return start;

        File largest = null;
        if (start.isDirectory()) {
            File[] children = start.listFiles();
            for (File f : children) {
                File largestInSubdirectory = largestFile(f);
                if (largestInSubdirectory != null) {
                    if ((largest == null) || (largest.length() < largestInSubdirectory.length())) {
                        largest = largestInSubdirectory;
                    }
                }
            }
        }
        return largest;
    }
}
