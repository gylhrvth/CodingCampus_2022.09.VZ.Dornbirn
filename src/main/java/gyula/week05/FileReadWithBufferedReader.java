package gyula.week05;

import java.io.*;

public class FileReadWithBufferedReader {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\gyula.horvath\\Documents\\CC2022.09\\src\\main\\java\\gyula\\week05\\FileExample.java");
        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            while (br.ready()){
                String line = br.readLine();
                System.out.println(line);
            }
            br.close();
        } catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }
}
