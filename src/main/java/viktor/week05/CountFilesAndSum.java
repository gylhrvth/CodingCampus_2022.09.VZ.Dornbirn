package viktor.week05;

import java.io.File;

public class CountFilesAndSum {


    public static void printFiles() {

        File myFile = new File("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2022.09.VZ.Dornbirn");

        System.out.println("Ordner: " + myFile.getName());
        System.out.println("\n");

        File[] childFiles = myFile.listFiles();
        int count = 0;
        int sum = 0;

        if (childFiles != null) {


            for (int i = 0; i < childFiles.length; i++) {

                if (childFiles[i].isFile()) { // Wenn es eine Datei ist, dann zähle ich und gebe zur Summe
                    count++;
                    sum += childFiles[i].length();
                }

                System.out.println(childFiles[i].getAbsoluteFile() + "   Size:" + childFiles[i].length());
            }
        } else {
            System.out.println("Es ist kein Verzeichnis!");
        }
        System.out.println();
        System.out.println("Anzahl der Dateien: " + count);
        System.out.println("Summe der Dateien (byte): " + sum);

    }


    public static void main(String[] args) {

        printFiles();


    }
}
