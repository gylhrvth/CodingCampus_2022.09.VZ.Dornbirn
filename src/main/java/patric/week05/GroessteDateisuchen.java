package patric.week05;

import java.io.File;
import java.util.Scanner;

public class GroessteDateisuchen {


    public static void main(String[] args) {
        File f = new File("C:\\Users\\pabos\\IdeaProjects\\CodingCampus_2022.09.VZ.Dornbirn\\src\\main\\java\\patric");
        File result = largestFile(f);
        System.out.println(result.getAbsoluteFile());
        System.out.println("relative path: " + result.getAbsolutePath().substring(f.getAbsolutePath().length() + 1));
        System.out.println("size of the largest file: " + result.length());
    }
    public static File largestFile(File start) {
        if (start.isFile()) return start;

        File largest = null;
        if (start.isDirectory()) {
            File[] children = start.listFiles();
            assert children != null;
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
