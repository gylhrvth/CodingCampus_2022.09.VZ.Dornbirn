package michel.week05;

import java.io.File;

public class ListDirectory {
    public static void main(String[] args) {
        File f = new File("/Users/sutez/IdeaProjects/CodingCampus_2022.09.VZ.Dornbirn/src/main/java/michel/week05/");
        printFiles(sortFiles(f),f);
    }

    public static void printFiles(File[] child,File f) {
        for (int i = 0; i < child.length; i++) {
            System.out.printf("%6d %s\n", child[i].length(), child[i].getName());

        }
        System.out.println("getAbsolutePath(): " + f.getAbsolutePath());
        System.out.println("exists(): " + f.exists());
        System.out.println("isFile(): " + f.isFile());
        System.out.println("isDirectory(): " + f.isDirectory());
        System.out.println("length(): " + f.length());
        System.out.println("Parent: " + f.getParentFile().getAbsolutePath());
    }

    public static File[] sortFiles(File f) {
        File[] child = f.listFiles();
        if (child != null) {
            for (int i = 0; i < child.length; i++) {
                for (int j = 0; j < child.length - i - 1; j++) {
                    if (child[j].length() < child[j + 1].length()) {
                        File temp = child[j];
                        child[j] = child[j + 1];
                        child[j + 1] = temp;
                    }
                }
            }
        } else
            System.out.println("Es ist kein Verzeichniss! ");
        return child;
    }
}

