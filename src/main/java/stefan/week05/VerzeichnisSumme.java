package stefan.week05;

import java.io.File;

public class VerzeichnisSumme {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\stefa\\IdeaProjects\\CodingCampus_2022.09.VZ.Dornbirn\\src\\main\\java\\stefan\\week04");
        File[] child = f.listFiles();
        summ(child);
        count(child);
    }


    public static void summ(File[] childFiles) {
        int count = 0;
        for (int i = 0; i < childFiles.length; i++) {
            if (!childFiles[i].isDirectory() && childFiles[i].isFile()) {
                count++;
            }


        }
        System.out.println("Summe:" + count);


    }


    public static void count(File[] child) {
        long count = 0;
        for (int i = 0; i < child.length; i++) {
            if (!child[i].isDirectory() && child[i].isFile()) {
                count = count + child[i].length();
                if (child != null) {
                } else {
                    System.out.println("Es ist kein Verzeichnis");
                }


            }

        }
        System.out.println("Große der Dateien:" + count);
    }

}



