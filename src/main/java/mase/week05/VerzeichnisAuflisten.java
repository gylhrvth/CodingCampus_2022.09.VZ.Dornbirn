package mase.week05;

import java.io.File;

public class VerzeichnisAuflisten {
    public static void main(String[] args) {
        File f = new File("/Users/masecajic/IdeaProjects/CodingCampus_2022.09.VZ.Dornbirn/src/main/java/mase/week04");
        System.out.println("getAbsolutePath(): " + f.getAbsolutePath());
        System.out.println("exists(): " + f.exists());
        System.out.println("isFile(): " + f.isFile());
        System.out.println("isDirectory(): " + f.isDirectory());
        System.out.println("length(): " + f.length());



        System.out.println("Parent: " + f.getParentFile().getAbsolutePath());
        File[] childFiles = f.listFiles();
        if (childFiles != null) {
            for (int i = 0; i < childFiles.length; i++) {
                for (int j = 0; j < childFiles.length - i - 1; j++) {
                    if (childFiles[j].length() > childFiles[j + 1].length()){
                        File temp = childFiles[j];
                        childFiles[j] = childFiles[j+1];
                        childFiles[j+1] = temp;
                    }
                }
            }


            for (int i = 0; i < childFiles.length; i++) {
                System.out.printf("%6d %s\n", childFiles[i].length(), childFiles[i].getName());
            }
        } else {
            System.out.println("Es ist kein Verzeichnis");
        }
    }


}

