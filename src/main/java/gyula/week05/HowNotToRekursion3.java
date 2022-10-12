package gyula.week05;

import java.io.File;

public class HowNotToRekursion3 {
    private static int fileCount = 0;
    private static long fileSize = 0;

    public static void main(String[] args) {
        File f = new File("C:\\Users\\gyula.horvath\\Documents\\CC2022.09\\src\\main\\java");
        printFileListSummary("", f);

        fileSize = 0;
        fileCount = 0;
        printFileListSummary("", f);
        System.out.println("Total: " + fileSize +" Bytes in " + fileCount + " files.");
    }


    public static void printFileListSummary(String prefix, File start){
        System.out.println(prefix + start.getName());
        if (start.isFile()){
            ++fileCount;
            fileSize += start.length();
        }
        if (start.isDirectory()){
            File[] children = start.listFiles();
            if (children != null) {
                for (File f : children) {
                    printFileListSummary("  " + prefix, f);
                }
            }
        }
    }
}
