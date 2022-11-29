package berna.week11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;

class ParentStructureTest {


    @Test
    void isParentDirectoryTrue() {

        File path1 = new File("C:\\Users\\Lenovo\\IdeaProjects\\CodingCampus_2022.09.VZ.Dornbirn\\src\\main\\java\\berna\\week11");
        PrintParentStructure ps1 = new PrintParentStructure(path1);
        Assertions.assertTrue(ps1.isParentDirectory(), " Directory, expect true.");

    }

    @Test
    void isParentDirectoryFalse() {
        File path2 = new File("C:\\Users\\Lenovo\\IdeaProjects\\CodingCampus_2022.09.VZ.Dornbirn\\src\\main\\java\\berna\\week11\\PrintParentStructure.java");
        PrintParentStructure ps2 = new PrintParentStructure(path2);
        Assertions.assertFalse(ps2.isParentDirectory(), " File, expect false.");

    }

    @Test
    void setChildrenTestIfCreated() {
        File path1 = new File("C:\\Users\\Lenovo\\IdeaProjects\\CodingCampus_2022.09.VZ.Dornbirn\\src\\main\\java\\berna\\week11");
        PrintParentStructure ps1 = new PrintParentStructure(path1);
        int lengthChilds = ps1.setChildren().length;
        Assertions.assertTrue(lengthChilds != 0, "check if files of dir are in File children.");

    }

    @Test
    void setChildrenTestIfEmpty() {
        File path1 = new File("C:\\Users\\Lenovo\\IdeaProjects\\CodingCampus_2022.09.VZ.Dornbirn\\src\\main\\java\\berna\\week11\\PrintParentStructure.java");
        PrintParentStructure ps1 = new PrintParentStructure(path1);
        //Assertions.assertEquals(null, ps1.setChildren(), "check if File children =null");
        Assertions.assertTrue(ps1.setChildren() == null,"check if File children =null");
    }

}