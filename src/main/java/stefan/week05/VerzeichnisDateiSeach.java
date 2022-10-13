package stefan.week05;

import java.io.File;
import java.util.Scanner;

public class VerzeichnisDateiSeach {
    public static void main(String[] args) {
        File f = new File(userImput());
        File result = findLargestFileInDirectory(f);
        System.out.println(result.getAbsolutePath());
        System.out.println(result.length());
        System.out.println(result.getAbsolutePath().substring(f.getAbsolutePath().length() + 1));
    }

    public static File findLargestFileInDirectory(File start) {
        if (start.isFile()) return start;

        File myBigestFile = null;
        if (start.isDirectory()) {
            File[] children = start.listFiles();
            if (children != null) {
                for (File child : children) {
                    File bigestFromChild = findLargestFileInDirectory(child);
                    if (bigestFromChild != null) {
                        if ((myBigestFile == null) || (bigestFromChild.length() > myBigestFile.length())) {
                            myBigestFile = bigestFromChild;
                        }
                    }
                }
            }
        }
        return myBigestFile;
    }

    public static String userImput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben sie ein Dateinpfad ein");
        String line = sc.nextLine();
        return line;
    }

}

