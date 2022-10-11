package batuhan.week05;

import java.io.File;

public class DateienZaehlenundSummen {


    public static void main(String[] args) {
        File f = new File("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2022.09.VZ.Dornbirn");


        System.out.println("isDirectory(): " + f.isDirectory());

        System.out.println("Parent: " + f.getParentFile().getAbsolutePath());
        File[] childFiles = f.listFiles();
        int count = 0;
        if (childFiles != null) {
            for (int i = 0; i < childFiles.length; i++) {
                if (childFiles[i].isFile()) {
                    count++;

                    System.out.println("Child: " + childFiles[i].getAbsolutePath() + " Nummber: "+count);
                }
            }
        } else {
            System.out.println("Es ist kein Verzeichnis");
        }

    }


}

