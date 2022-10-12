package gyula.week05;

import java.io.File;

public class Rekursion3 {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\gyula.horvath\\Documents\\CC2022.09\\src\\main\\java");

        System.out.println("Count Files: " + countFilesRecursiv(f));
        System.out.println("Size of Files: " + getFileSizeRecursiv(f));
    }

    public static int countFilesRecursiv(File start){
        if (start.isFile()) return 1;

        int count = 0;
        if (start.isDirectory()){
            File[] files = start.listFiles();
            for (File f: files){
                count += countFilesRecursiv(f);
            }
        }
        return count;
    }

    public static long getFileSizeRecursiv(File start){
        if (start.isFile()) return start.length();

        long size = 0;
        if (start.isDirectory()){
            File[] files = start.listFiles();
            for (File f: files){
                size += getFileSizeRecursiv(f);
            }
        }
        return size;
    }

}
