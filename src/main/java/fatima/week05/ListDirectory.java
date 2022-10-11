package fatima.week05;

import java.io.File;

public class ListDirectory {
    public static void main(String[] args) {
        File startDirectory = new File("/Users/fatimadogan/IdeaProjects/CodingCampus_2022.09.VZ.Dornbirn/src/main/java/fatima/week05");

        File[] children = startDirectory.listFiles();
        if (children != null) {
            for (int i = 0; i < children.length; i++) {
                for (int j = 0; j < children.length - i - 1; j++) {
                    if (children[j + 1].isDirectory() ||
                            (children[j].isFile() && (children[j].length() < children[j + 1].length()))) {
                        File temp = children[j];
                        children[j] = children[j + 1];
                        children[j + 1] = temp;
                    }
                }
            }
            for (File f : children) {
                System.out.printf("%5d %s%n", f.length(), f.getName());
            }
        } else {
            System.out.println("Es ist kein Verzeichnis");
        }
    }
}

