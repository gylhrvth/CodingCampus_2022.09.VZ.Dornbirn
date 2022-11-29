package viktor.week09;

import java.io.File;
import java.io.FileNotFoundException;

public class FileSystem {



    public static void main(String[] args)  {

        File f = new File("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2022.09.VZ.Dornbirn\\src\\main\\java\\viktor");

        Filepfad filepfad = new Filepfad(f);
        System.out.println(filepfad.getPath());

        filepfad.printFileList(" ", f);








    }
}
