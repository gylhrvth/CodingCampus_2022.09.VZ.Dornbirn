package batuhan.week05;

import java.io.File;

public class DateienZaehlenundSummenRekursiv {

    public static void main(String[] args) {
        File f = new File("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2022.09.VZ.Dornbirn\\src\\main\\java\\batuhan");

        System.out.println(f.getAbsolutePath());
        System.out.println("Count files (rekursiv): " + getCountFilesRecursive(f));
        System.out.println("Total size: " + getSizeRecursive(f));

    }

    public static int getCountFilesRecursive(File start) {
        int counter = 0;
        if (start.isFile()) {
            counter = 1;
        }
        if (start.isDirectory()) {
            File[] childern = start.listFiles();
            if (childern != null) {
                for (File f : childern) {
                    counter = counter + getCountFilesRecursive(f);
                }
            }
        }
        //System.out.printf("%5d %s\n", counter, start.getAbsolutePath());
        return counter;
    }


    public static long getSizeRecursive(File start) {
        long size = 0;
        if (start.isFile()) {
            size = start.length();
        }
        if (start.isDirectory()) {
            File[] childern = start.listFiles();
            if (childern != null) {
                for (File f : childern) {
                    size = size + getSizeRecursive(f);
                }
            }
        }
        //System.out.printf("%5d %s\n", size, start.getAbsolutePath());
        return size;
    }


}


