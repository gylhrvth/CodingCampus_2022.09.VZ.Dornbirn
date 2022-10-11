package gyula.week05;

import java.io.File;

public class FileExample {
    public static void main(String[] args) {
//        File f = new File("HelloWorld.txt");
        File f = new File("C:\\Users\\gyula.horvath\\Documents\\CC2022.09\\src\\main\\java\\gyula\\week05\\FileExample.java");

        System.out.println("getAbsolutePath(): " + f.getAbsolutePath());
        System.out.println("exists(): " + f.exists());
        System.out.println("isFile(): " + f.isFile());
        System.out.println("isDirectory(): " + f.isDirectory());
        System.out.println("length(): " + f.length());

        System.out.println("Parent: " + f.getParentFile().getAbsolutePath());
        File[] childFiles = f.listFiles();
        if (childFiles != null) {
            for (int i = 0; i < childFiles.length; i++) {
                System.out.println("Child: " + childFiles[i].getAbsolutePath());
            }
        } else {
            System.out.println("Es ist kein Verzeichnis");
        }

    }
}
