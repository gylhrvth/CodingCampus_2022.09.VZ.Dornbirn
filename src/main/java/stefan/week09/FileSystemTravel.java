package stefan.week09;

import java.io.File;

public class FileSystemTravel {
    public static void main(String[] args) {
        File f = new File("C:/Users/stefa/IdeaProjects/CodingCampus_2022.09.VZ.Dornbirn/src/main/java");
        printFileList("|-", f);
        String ANSI_RESET = "\u001B[0m";
       String ANSI_RED = "\u001B[31m";
        System.out.println(" ".repeat(0)+ANSI_RED+f.getName());

    }


    public static void printFileList(String prefix, File start){
        System.out.println(prefix + start.getName());
        if (start.isDirectory()){
            File[] children = start.listFiles();
            if (children != null){
                for (File f: children){
                    printFileList("  " + prefix, f);
                }
            }
        }
    }

}

