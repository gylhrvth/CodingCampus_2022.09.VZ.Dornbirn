package mase.week06;

import javax.imageio.IIOException;
import java.io.*;

public class ReadAFile {
    public static void main(String[] args) {
            File f = new File("/Users/masecajic/IdeaProjects/CodingCampus_2022.09.VZ.Dornbirn/assets/tmp/loggFile.txt");
            try {
                BufferedReader br = new BufferedReader(new FileReader(f));
                while (br.ready()){
                    String line = br.readLine();
                    System.out.println(line);
                }
                br.close();
            }catch (FileNotFoundException fnfe){
                fnfe.printStackTrace();
            }catch (IOException ioe){
                ioe.printStackTrace();
            }

    }
}
