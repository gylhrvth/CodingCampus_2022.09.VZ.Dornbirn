package batuhan.week05;

import java.io.File;

public class TheBiggestFile {

    public static void main(String[] args) {
        File f = new File("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2022.09.VZ.Dornbirn\\src\\main\\java\\batuhan");

        File result = findLargestFile(f);
        System.out.println("Die Größte Datei ist : " + result.getAbsolutePath());
        System.out.println("Size: " + result.length());
        System.out.println("Relative Pfad: " + result.getAbsolutePath().substring(f.getAbsolutePath().length() + 1));

    }

    public static File findLargestFile(File start) {
        //System.out.println(prefix + start.getName() + " ");
        if (start.isFile()) {//geht den path durch und schaut ob am ende des path nur eine Datei ist
            return start;
        }

        File biggest = null;
        if (start.isDirectory()) {//sollte am ende nicht eine Datei sonder ein Ordner sein trifft diese Funktion auf und durchsucht alle ordner
            File[] children = start.listFiles();//gib dir zurück was am ende des Path ist
            if (children != null) {
                for (File f : children) {
                    File testFile = findLargestFile(f);
                    if (testFile != null){
                        if ((biggest == null) || (testFile.length() > biggest.length())){
                            biggest = testFile;
                        }
                    }
                }
            }
        }
        return biggest;


    }
}