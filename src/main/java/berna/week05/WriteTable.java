package berna.week05;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;


import static berna.week04.TableOfData.findLargestEntry;

public class WriteTable {
    //write a well formatted table into file

    public static void main(String[] args) {
        //write a well formatted table into file

        // input data:

        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};


        //find out how much space you need for your table entries
        //--> size of the largest entry?
        System.out.println("max length of entry: ");
        System.out.println("maxlength1 = " + findLargestEntry(firstName));
        System.out.println("maxlength2 = " + findLargestEntry(lastName));
        System.out.println("maxlength3 = " + findLargestEntry(age));
        System.out.println("maxlength4 = " + findLargestEntry(place));
        System.out.println("maxlength5 = " + findLargestEntry(distanceFromCapital));

        String[] header = {"First name", "Last name", "Age", "Place", "Distance from capital"};
        System.out.println("maxlength6 = " + findLargestEntry(header));

        // for a nice format maxlength of entry + 2;

        int nrCols = firstName.length;
        int nrRows = firstName.length + 1; // because of the header

        //nicely formatted table

        try {
            File path = new File("assets/tmp/output.txt");
            path.getParentFile().mkdirs();
            FileOutputStream fos = new FileOutputStream(path, true);
            PrintStream ps = new PrintStream(fos);

            //print the header
            for (int i = 0; i < nrCols; i++) {
                ps.printf("%-17s  ", header[i]);
            }
            ps.println();
            ps.println("__________________________________________________________________________________________________");

            //print the table body
            for (int i = 0; i < nrRows - 1; i++) {

                ps.printf("%-17s  %-17s  %2d                 %-17s   %17.2f  %n", firstName[i], lastName[i], age[i], place[i], distanceFromCapital[i]);
            }

            ps.close();
            System.out.println("File created:  " + path.getName());


        } catch (IOException ioe) {
            ioe.printStackTrace();
        }



    }
}
