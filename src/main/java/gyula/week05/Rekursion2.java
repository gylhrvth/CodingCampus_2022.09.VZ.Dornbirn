package gyula.week05;

import java.io.File;

public class Rekursion2 {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\gyula.horvath\\Documents\\CC2022.09\\src\\main\\java\\gyula");
        printFileList("", f);
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
