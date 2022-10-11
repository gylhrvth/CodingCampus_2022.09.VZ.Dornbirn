package patric.week05;

import java.io.File;

import static patric.week05.VerzeichnisAuflisten.printFiles;
import static patric.week05.VerzeichnisAuflisten.sortFiles;

public class DateienZaehlenUndSummen {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\pabos\\IdeaProjects\\CodingCampus_2022.09.VZ.Dornbirn\\src\\main\\java\\patric");
        printFiles(sortFiles(f), f);
    }





}
