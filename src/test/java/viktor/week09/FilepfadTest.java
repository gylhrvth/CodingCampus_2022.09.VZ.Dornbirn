package viktor.week09;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;


class FilepfadTest {

    private Filepfad fpfad;

    @Test
    void getPath(){
        File f = new File("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2022.09.VZ.Dornbirn\\src\\main\\java\\viktor");

        Filepfad filepfad = new Filepfad(f);

        assertEquals(f,filepfad.getPath());

    }

    @Test
    void constructorTest(){
        File f = new File("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2022.09.VZ.Dornbirn\\src\\main\\java\\viktor");
        fpfad = new Filepfad(f);
        assertEquals(f, fpfad.getPath());

    }


}