package batuhan.week05;

import java.io.File;
import java.util.Scanner;

public class DateinachNamesuchen {


    public static void main(String[] args) {

        File f = new File("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2022.09.VZ.Dornbirn\\src\\main\\java\\batuhan");
        String kriterium = ".java";
        findthefile(f,kriterium,f);


    }

    public static void findthefile(File start, String kriterium,File startoriginal) {
        if (start.isFile() && start.getName().contains(kriterium)) {//wenn es ein File ist && das File das such kriterium (java) beinhaltet dann wird es ausgeführt
            System.out.println(start.getAbsolutePath().substring(startoriginal.getAbsolutePath().length()+1));
        }
        if (start.isDirectory()) {//wenn nicht ein File ist sucht er in einem Ordner durch (.isDircetory)
            File[] children = start.listFiles();
            if (children != null) {
                for (File f : children) {
                    findthefile(f, kriterium,startoriginal);

                }
            }
        }
    }


}







