package viktor.week05;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class WriteTableInFile {

    public static void main(String[] args) {


        String[] header = new String[]{"Firstname", "Lastname", "Age", "Place", "Distance from Capital"};
        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};

        try {

            File myFile = new File("assets/tmp/output.txt");  // Pfad definieren
            myFile.getParentFile().mkdirs(); // das File wird in der Baumstruktur angelegt
            PrintStream ps = new PrintStream(new FileOutputStream(myFile, false)); //Printstream zum Schreiben


            for (int j = 0; j < header.length; j++){  // Header wird zum File hinzugefügt
                ps.printf("|%25s|", header[j]);
            }
            ps.println();

            for(int k = 0; k < 135; k++){            //  underline wird zum File hinzugefügt
                ps.printf("_");
            }
            ps.println();


            for (int i = 0; i < firstName.length; i++) {   // die Dateien werden zum File hinzugefügt
                ps.printf("|%25s|", firstName[i]);
                ps.printf("|%25s|", lastName[i]);
                ps.printf("|%25d|", age[i]);
                ps.printf("|%25s|", place[i]);
                ps.printf("|%25.5f|", distanceFromCapital[i]);
                ps.println();
            }

            ps.close();                                        // Das File wird abgeschlossen

        }catch (IOException ioe) {

            ioe.printStackTrace();





        }




    }
}
