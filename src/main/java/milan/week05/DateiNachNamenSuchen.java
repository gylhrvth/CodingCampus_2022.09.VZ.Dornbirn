package milan.week05;

import java.io.File;

public class DateiNachNamenSuchen {
    public static void main(String[] args) {

        File f = new File("C:\\Users\\Dell\\IdeaProjects\\CodingCampus_2022.09.VZ.Dornbirn\\src\\main\\java");
        String kriterium = ".txt";
        searchThrough(f, kriterium, f);
    }

    public static void searchThrough(File start, String target, File startOriginal) {       //<<<--- startOriginal = start, wird benötigt um den relativen Pfad zu erzeugen
        if (start.isFile() && start.getName().contains(target)) {
            System.out.println(start.getAbsolutePath().substring(startOriginal.getAbsolutePath().length() + 1));
            //System.out.println(startOriginal.toURI().relativize(start.toURI()));         // <<<----- alternative mit toURI
        }
        if (start.isDirectory()) {
            File[] children = start.listFiles();
            if (children != null) {
                for (File f : children) {
                    searchThrough(f, target, startOriginal);

                }
            }
        }
    }
}
