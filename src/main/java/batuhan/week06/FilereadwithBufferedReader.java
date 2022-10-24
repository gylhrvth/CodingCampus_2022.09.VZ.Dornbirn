package batuhan.week06;

import java.io.*;

public class FilereadwithBufferedReader {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2022.09.VZ.Dornbirn\\src\\main\\java\\batuhan\\week06\\Logger.java");
        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            while (br.ready()) {
                String line = br.readLine();
                System.out.println(line);
            }
            br.close();
        }catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
