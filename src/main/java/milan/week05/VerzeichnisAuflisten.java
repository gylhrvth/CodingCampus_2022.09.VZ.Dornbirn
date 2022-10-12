package milan.week05;

import java.io.File;
import java.util.Arrays;

public class VerzeichnisAuflisten {
    public static void main(String[] args) {

        File f = new File("C:\\Users\\Dell\\IdeaProjects\\CodingCampus_2022.09.VZ.Dornbirn\\src\\main\\java\\milan\\week05");

        System.out.println("Verzeichnis: " + f.getAbsolutePath());
        System.out.println("--------------------------------------");
        File[] childFiles = f.listFiles();
        if (childFiles != null) {
            for (int i = 0; i < childFiles.length; i++) {
                for (int j = 0; j < childFiles.length - 1; j++) {
                    if ((childFiles[j + 1].isDirectory()) || (!childFiles[j].isDirectory() && !childFiles[j + 1].isDirectory() && (childFiles[j].length() < childFiles[j + 1].length()))) {
                        File hold = childFiles[j];
                        childFiles[j] = childFiles[j + 1];
                        childFiles[j + 1] = hold;
                    }
                }
            }
            for (int x = 0; x < childFiles.length; x++) {
                System.out.println("Datei/Ordner & Datei Größe: " + childFiles[x].getAbsolutePath() + " " + childFiles[x].length());
            }
        } else {
            System.out.println("Es ist kein Verzeichnis");
        }
    }


}

