package franz.week05;

import java.io.File;

public class FileExample {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\franz\\IdeaProjects\\CodingCampus_2022.09.VZ.Dornbirn\\src\\main\\java\\franz\\week04");

        File[] childFiles = f.listFiles();
        if (childFiles != null) {
            for (int i = 0; i < childFiles.length; i++) {
                for (int j = 0; j < childFiles.length - i - 1; j++) {
                    if (childFiles[j].length() < childFiles[j + 1].length()) {
                        File temp = childFiles[j];
                        childFiles[j] = childFiles[j + 1];
                        childFiles[j + 1] = temp;
                    }
                }
            }

            for (int i = 0; i < childFiles.length; i++) {
                System.out.println("Child " + childFiles[i].getAbsolutePath() + " (" + childFiles[i].length() + ")");
            }
        } else {
            System.out.println("Es ist kein Verzeichnis");
        }
   }
}