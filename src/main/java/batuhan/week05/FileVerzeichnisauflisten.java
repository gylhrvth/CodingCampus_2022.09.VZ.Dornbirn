package batuhan.week05;

import java.io.File;

public class FileVerzeichnisauflisten {

    public static void main(String[] args) {
        File f = new File("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2022.09.VZ.Dornbirn");


        System.out.println("getAbsolutePath(): "  + f.getAbsolutePath());
        System.out.println("exists()" + f.exists());
        System.out.println("isFile()" + f.isFile());
        System.out.println("isDirectory(): "+ f.isDirectory());
        System.out.println("length(): "+ f.length());
    }
}
