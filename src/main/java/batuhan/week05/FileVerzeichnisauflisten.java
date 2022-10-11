package batuhan.week05;

import java.io.File;

public class FileVerzeichnisauflisten {

    public static void main(String[] args) {
        File f = new File("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2022.09.VZ.Dornbirn");


        System.out.println("getAbsolutePath(): " + f.getAbsolutePath());
        System.out.println("exists()" + f.exists());
        System.out.println("isFile()" + f.isFile());
        System.out.println("isDirectory(): " + f.isDirectory());
        System.out.println("length(): " + f.length());

        System.out.println("Parent: " + f.getParentFile().getAbsolutePath());
        File[] childFiles = f.listFiles();
        for (int i = 0; i <childFiles.length; i++) {
            for (int j = 0; j <childFiles.length ; j++) {
                if (childFiles[i].length() > childFiles[j].length()){
                    File temp = childFiles[i];
                    childFiles[i] = childFiles[j];
                    childFiles[j] = temp;
                }

            }
            
        }
        if (childFiles != null) {
            for (int i = 0; i < childFiles.length; i++) {
                System.out.println("Child: " + childFiles[i].getAbsolutePath() + " size: " +childFiles[i].length());
            }
        } else {
            System.out.println("Es ist kein Verzeichnis");
        }

    }


}

