package martin.week06;

import martin.MWerkzeuge;

import java.io.*;
import java.util.Objects;

public class CSVpractice {
    public static void main(String[] args) {
        MWerkzeuge.head("#", "Read and Display");
        MWerkzeuge.Log(3, "Initialisiere Read and Display");
        Reader redr = new InputStreamReader(Objects.requireNonNull(CSVpractice.class.getClassLoader().getResourceAsStream("csv/sales_100.csv")));
        File filePath1 = new File("csv/sales_100.csv");
        System.out.println(redr.toString());
        printCSVtoArray(filePath1);
    }

    public static void printCSVtoArray(File directory) {
        int rows = 0;
        int columns = 0;
        String analyseLine="";
        String[][] CSVArray = new String[rows][];
        BufferedReader redrA = new BufferedReader(new InputStreamReader(Objects.requireNonNull(CSVpractice.class.getClassLoader().getResourceAsStream(directory.toString()))));
        BufferedReader redrB = new BufferedReader(new InputStreamReader(Objects.requireNonNull(CSVpractice.class.getClassLoader().getResourceAsStream(directory.toString()))));
        try {
            while (redrA.ready()) {
                analyseLine=redrA.readLine();
                rows++;
            }
            System.out.println(rows);
            for (int i = 0; i < analyseLine.length(); i++) if (analyseLine.charAt(i)==',') columns++;
            if (columns>=0)columns++;
            System.out.println(columns);
            redrA.close();
            while (redrB.ready()) {

            }

        } catch (IOException ioe) {

        }

    }
}
