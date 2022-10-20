package franz.week05;

import java.io.File;

public class FileSort {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\franz\\IdeaProjects\\CodingCampus_2022.09.VZ.Dornbirn\\src\\main\\java\\franz\\week04");
        System.out.println("count" + countFilesRecursiv(f));
        System.out.println("size" + getFileSizeRecursive(f));

    }

    public static int countFilesRecursiv(File start) {
        if (start.isFile()) return 1;
        int count = 0;
        if (start.isDirectory()) {
            File[] files = start.listFiles();

            assert files != null;
            for (File f : files) {
                count += countFilesRecursiv(f);
            }
        }
        return count;
    }

    public static long getFileSizeRecursive(File start) {
        if (start.isFile()) return start.length();
        int size = 0;
        if (start.isDirectory()) {
            File[] files = start.listFiles();
            assert files != null;
            for (File f : files) {
                size += getFileSizeRecursive(f);
            }
        }
        return size;
    }
}



