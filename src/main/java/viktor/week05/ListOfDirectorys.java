package viktor.week05;

import java.io.File;

public class ListOfDirectorys {

    public static void printFiles() {

        File myFile = new File("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2022.09.VZ.Dornbirn");

        System.out.println("Ordner: " + myFile.getName());
        System.out.println("\n");

        File[] childFiles = myFile.listFiles();


        if (childFiles != null) {

            for (int i = 0; i < childFiles.length; i++) {
                System.out.println(childFiles[i].getAbsoluteFile() + "   Size:" + childFiles[i].length());
            }
        } else {
            System.out.println("Es ist kein Verzeichnis!");
        }
    }


    public static void sortFileDesc() {

        File myFile = new File("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2022.09.VZ.Dornbirn");

        System.out.println("Ordner: " + myFile.getName());
        System.out.println("\n");

        File[] childFiles = myFile.listFiles();

        for (int j = 0; j < childFiles.length - 1; j++) {
            for (int i = 0; i < childFiles.length - j - 1; i++) {
                if (childFiles[i].length() < childFiles[i + 1].length()) {
                    File temp = childFiles[i];
                    childFiles[i] = childFiles[i + 1];
                    childFiles[i + 1] = temp;

                }
            }
        }


        if (childFiles != null) {

            for (int i = 0; i < childFiles.length; i++) {
                System.out.println(childFiles[i].getAbsoluteFile() + "   Size:" + childFiles[i].length());
            }
        } else {
            System.out.println("Es ist kein Verzeichnis!");
        }
    }


    public static void main(String[] args) {

        printFiles(); //Liste mit den Dateien
        System.out.println();
        sortFileDesc();


    }

}
