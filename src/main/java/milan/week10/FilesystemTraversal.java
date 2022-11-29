package milan.week10;

import java.io.File;

public class FilesystemTraversal {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\Dell\\IdeaProjects\\CodingCampus_2022.09.VZ.Dornbirn\\src\\main\\java\\milan");
        String target = ".java";
        String prefix = "├── ";
        printFileList(prefix, f, target);
        //printFileList(prefix, f);
    }

    public static void printFileList(String prefix, File start, String target) {
        System.out.println(prefix + start.getName());
        if (start.isDirectory()) {
            File[] children = start.listFiles();
            if (children != null) {
                for (File f : children) {
                    printFileList("    " + prefix, f, target);
                }
            }
        }
    }
}
