package viktor.week05;

import java.io.File;

public class CountingAndSumAsRecursive {


    public static int getCountingOfFiles(File f) {

        int count = 0;

        if (f.isFile()) {
            count = 1;
        }

        if (f.isDirectory()) {

            File[] children = f.listFiles();

            if (children != null) {
                for (File e : children) {
                    count += getCountingOfFiles(e);
                }
            }
        }
        return count;
    }

    public static long sumOfFiles(File f) {

        long sum = 0;

        if (f.isFile()) {
            sum += f.length();
        }

        if (f.isDirectory()) {
            File[] children = f.listFiles();

            if (children != null) {

                for (File g : children) {
                    sum += sumOfFiles(g);

                }
            }
        }
        return sum;
    }


    public static void main(String[] args) {

        File myFile = new File("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2022.09.VZ.Dornbirn\\src\\main\\java\\viktor");

        System.out.println("Ordner: " + myFile.getName());
        System.out.println("Anzahl der allen Dateien innerhalb des Ordners: " + getCountingOfFiles(myFile));
        System.out.println("Summe der Größe (byte) aller Dateien innerhalb des Ordners: " + sumOfFiles(myFile));


    }
}
