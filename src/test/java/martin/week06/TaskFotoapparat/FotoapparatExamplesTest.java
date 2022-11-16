package martin.week06.TaskFotoapparat;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class FotoapparatExamplesTest {
    static String briBitt ="Bring bitte zuerst ";


    @Test
    void testMissingObjectivUndSpeicherkarte() {
        /* Prepare Mock-Up */
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream oldSystemOut = System.out;
        System.setOut(new PrintStream(baos));

        /* Prepare Objects */
        Fotoapparat testCam = new Fotoapparat();
        /* The core of the test */
        testCam.makeAPhoto();
        /* Evaluate Result from Mock-Up */
        String testString = "Objektiv und Speicherkarte";
        assertTrue(baos.toString().contains(briBitt+testString),
                "\"" + baos + "\" doesn't contains \""+ briBitt+testString  +"\"");
        /* Repair Mock-up */
        System.setOut(oldSystemOut);

    }
    @Test
    void testMissingObjectiv() {
        /* Prepare Mock-Up */
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream oldSystemOut = System.out;
        System.setOut(new PrintStream(baos));

        /* Prepare Objects */
        Fotoapparat testCam = new Fotoapparat();
        Speicherkarte testKarte = new Speicherkarte(10, 7, 5);
        testCam.slotCard(testKarte);
        /* The core of the test */
        testCam.makeAPhoto();
        /* Evaluate Result from Mock-Up */
        String testString = "ein Objektiv";
        assertTrue(baos.toString().contains(briBitt+testString),
                "\"" + baos + "\" doesn't contains \""+ briBitt+testString  +"\"");

        /* Repair Mock-up */
        System.setOut(oldSystemOut);

        /* Evaluate Result from Mock-Up */
        assertTrue(baos.toString().contains(briBitt+testString),
                "\"" + baos + "\" doesn't contains \""+ briBitt+testString  +"\"");
    }


    @Test
    void testMissingMemoryCard() {
        /* Prepare Mock-Up */
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream oldSystemOut = System.out;
        System.setOut(new PrintStream(baos));

        /* Prepare Objects */
        Fotoapparat testCam = new Fotoapparat();
        KameraObjektiv testObjectiv = new KameraObjektiv(3, 11);
        testCam.attachCamOb(testObjectiv);

        /* The core of the test */
        testCam.makeAPhoto();

        /* Repair Mock-up */
        System.setOut(oldSystemOut);

        /* Evaluate Result from Mock-Up */
        String testString = "eine Speicherkarte";
        assertTrue(baos.toString().contains(briBitt+testString),
                "\"" + baos + "\" doesn't contains \""+ testString  +"\"");
    }

    @Test
    void testAbdeckZu() {
        /* Prepare Mock-Up */
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream oldSystemOut = System.out;
        System.setOut(new PrintStream(baos));

        /* Prepare Objects */
        Fotoapparat testCam = new Fotoapparat();
        KameraObjektiv testObjectiv = new KameraObjektiv(3, 11);
        Speicherkarte testKarte = new Speicherkarte(10, 7, 5);
        testCam.attachCamOb(testObjectiv);
        testCam.slotCard(testKarte);

        /* The core of the test */
        testCam.makeAPhoto();

        /* Repair Mock-up */
        System.setOut(oldSystemOut);

        /* Evaluate Result from Mock-Up */
        String testString = "*Click*";
        assertTrue(baos.toString().contains(testString),
                "\"" + baos + "\" doesn't contains \""+ testString  +"\"");
    }
    @Test
    void testMaketLSPhoto() {
        /* Prepare Mock-Up */
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream oldSystemOut = System.out;
        System.setOut(new PrintStream(baos));

        /* Prepare Objects */
        Fotoapparat testCam = new Fotoapparat();
        KameraObjektiv testObjectiv = new KameraObjektiv(3, 11);
        Speicherkarte testKarte = new Speicherkarte(10, 7, 5);
        testCam.attachCamOb(testObjectiv);
        testCam.slotCard(testKarte);
        testCam.takeLS();
        testCam.abdeckungAufmachen(true);

        /* The core of the test */
        testCam.makeAPhoto();

        /* Repair Mock-up */
        System.setOut(oldSystemOut);

        /* Evaluate Result from Mock-Up */
        String testString = "getToTheChoppa";
        assertTrue(baos.toString().contains(testString),
                "\"" + baos + "\" doesn't contains \""+ testString  +"\"");
    }
    @Test
    void testMakeNormalPhoto() {
        /* Prepare Mock-Up */
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream oldSystemOut = System.out;
        System.setOut(new PrintStream(baos));

        /* Prepare Objects */
        Fotoapparat testCam = new Fotoapparat();
        KameraObjektiv testObjectiv = new KameraObjektiv(3, 11);
        Speicherkarte testKarte = new Speicherkarte(10, 7, 5);
        testCam.attachCamOb(testObjectiv);
        testCam.slotCard(testKarte);
        testCam.abdeckungAufmachen(true);

        /* The core of the test */
        testCam.makeAPhoto();

        /* Repair Mock-up */
        System.setOut(oldSystemOut);

        /* Evaluate Result from Mock-Up */
        String testString = "#SoCringe";
        assertTrue(baos.toString().contains(testString),
                "\"" + baos + "\" doesn't contains \""+ testString  +"\"");
    }
}