package stefan.week05;

import java.io.File;

public class VerzeichnisAuflisten {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\stefa\\IdeaProjects\\CodingCampus_2022.09.VZ.Dornbirn\\src\\main\\java\\stefan\\week04");

        System.out.println("getAbsolutePath(): " + f.getAbsolutePath());
        System.out.println("exists(): " + f.exists());
        System.out.println("isFile(): " + f.isFile());
        System.out.println("isDirectory(): " + f.isDirectory());
        System.out.println("length(): " + f.length());

        File[] childFiles = f.listFiles();
        if (childFiles != null) {
            // Sort result
            for (int i = 0; i < childFiles.length; i++) {
                for (int j = 0; j < childFiles.length -i - 1; j++) {
                    if (childFiles[j + 1].isDirectory() || (childFiles[j].length() < childFiles[j+1].length())) {
                        File temp = childFiles[j];
                        childFiles[j] = childFiles[j + 1];
                        childFiles[j + 1] = temp;

                    }
                }
            }

            // Print result
            for (File singleFile: childFiles ) {
                System.out.printf("%5d %1s %s\n", singleFile.length(), (singleFile.isDirectory()?"D":" "), singleFile.getName());
            }

        } else {
            System.out.println("Es ist kein Verzeichnis");
        }

    }

}
