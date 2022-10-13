package stefan.week05;

import java.io.File;

public class VerzeichnisRekursiv {


    public static void main(String[] args) {
        File f = new File("C:\\Users\\stefa\\IdeaProjects\\CodingCampus_2022.09.VZ.Dornbirn\\src\\main\\java\\stefan\\week04");
        System.out.println("Anzahl der Filese: " + anzahlData(f));
        System.out.println("size von Files: "+ sizeData(f));
    }

    public static int anzahlData(File start) {
        if (start.isFile()) return 1;
        int summ = 0;
        if (start.isDirectory()) {
            File[] fieles = start.listFiles();
            for (File f : fieles) {
                summ += anzahlData(f);

            }
        }

        return summ;
    }

    public static long sizeData(File start) {
        if (start.isFile()) return start.length();

        long size = 0;
        if (start.isDirectory()) {

            File[] files = start.listFiles();
            for (File f : files) {
                size += sizeData(f);

            }
        }
    return size;
    }
}
