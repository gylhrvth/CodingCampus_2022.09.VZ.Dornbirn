package stefan.week05;

import java.io.File;

public class VerzeichnisSearchName {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\stefa\\IdeaProjects\\CodingCampus_2022.09.VZ.Dornbirn\\src\\main\\java\\stefan\\week04");

        System.out.println(f.getAbsolutePath());
        System.out.println(f.getParent());
        File[] childeren = f.listFiles();
        for (File singleFile : childeren) {
            System.out.printf("%5d %1s %s\n", singleFile.length(), (singleFile.isDirectory() ? "D" : " "), singleFile.getName());

        }



    }
}
