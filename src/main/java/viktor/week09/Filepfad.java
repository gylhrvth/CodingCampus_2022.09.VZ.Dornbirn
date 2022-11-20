package viktor.week09;

import java.io.File;


public class Filepfad {

    private File path;

    public Filepfad(File path) {
        this.path = path;

    }

    public File getPath() {
        return path;
    }

    public void printFileList(String pre, File file) {

        System.out.println(pre + file.getName());

        if (file.isDirectory()) {
            java.io.File[] child = file.listFiles();

            if (child != null) {
                for (java.io.File f : child) {
                    printFileList("   " + pre, f);
                }
            }
        }
    }



}
