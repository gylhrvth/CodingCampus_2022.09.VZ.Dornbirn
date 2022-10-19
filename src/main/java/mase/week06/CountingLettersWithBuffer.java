package mase.week06;


import java.io.*;

public class CountingLettersWithBuffer {
    public static void main(String[] args) {
        File f = new File("/Users/masecajic/IdeaProjects/CodingCampus_2022.09.VZ.Dornbirn/src/main/resources/txt/simpleText.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            while (br.ready()) {
                String line = br.readLine();
                System.out.println(line);
            }
            br.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
    public static void countEveryLetter(){

    }

}
