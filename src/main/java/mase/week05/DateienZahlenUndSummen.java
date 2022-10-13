package mase.week05;

import java.io.File;

public class DateienZahlenUndSummen {
    public static void main(String[] args) {
        File f = new File("/Users/masecajic/IdeaProjects/CodingCampus_2022.09.VZ.Dornbirn/src/main/java/mase/week05");
        System.out.println("Can read"+ f.canRead());
        printFile(countFiles(f));
    }

    public static void printFile(File[] child){
        int sum = 0;
        for (int i = 0; i < child.length; i++) {
            System.out.printf("%6d %s\n", child[i].length(), child[i].getName());
            sum += child[i].length();
        }
        System.out.println("Anzahl der Verzeichnisse: " + child.length);
        System.out.println("Summe :" + sum);
    }
    public static File[] countFiles(File f){
        File[] child = f.listFiles();

        if (child != null){
        for (int i = 0; i < child.length; i++) {
            for (int j = 0; j < child.length - i - 1; j++) {

            }
        }
        }else
            System.out.println("Das ist kein Verzeichnis");
        return child;
    }
}
