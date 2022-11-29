package berna.week11;

import java.io.File;

public class FilesystemTraversal {

    public static void main(String[] args) {


        File path1 = new File("C:\\Users\\Lenovo\\IdeaProjects\\CodingCampus_2022.09.VZ.Dornbirn\\src\\main\\java\\berna");


        PrintParentStructure pps = new PrintParentStructure(path1);
        System.out.println(pps);
        Digger dig = new Digger(path1);
        dig.digTrough();


    }


}
