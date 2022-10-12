package viktor.week05;

import java.io.File;

public class LargestSizeofFiles {


    public static File biggestSizeOfFiles(File f) {

        if (f.isFile()) {
            return f;
        }

        File max = null;
        if (f.isDirectory()) {
            File[] children = f.listFiles();
            if (children != null) {
                for (File g : children) {
                    File testFile = biggestSizeOfFiles(g);
                    if ((max == null) || (testFile != null) && (testFile.length() > max.length())){
                        max = testFile;
                    }
                }
            }
        }
        return max;

    }






    public static void main(String[] args) {

        File myFile = new File("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2022.09.VZ.Dornbirn\\src\\main\\java\\viktor");


        File result = biggestSizeOfFiles(myFile);
        System.out.println("Die Größte Datei ist : " + result.getAbsolutePath());
        System.out.println("Size: " + result.length());
        System.out.println("Relative Pfad: " + result.getAbsolutePath().substring(myFile.getAbsolutePath().length() + 1));



    }
}
