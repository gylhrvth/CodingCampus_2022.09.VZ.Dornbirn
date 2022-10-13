package michel.week05;

import michel.week02.UserInputs;

import java.io.File;

public class FindLargestFile {
    public static void main(String[] args) {
        File f = new File(UserInputs.userInputString());

        File largest = fileSize(f);
        System.out.println("Die Größte Datei ist : " + largest.getAbsolutePath());
        System.out.println("Size: " + largest.length());
        System.out.println("Relative Pfad: " + largest.getAbsolutePath().substring(f.getAbsolutePath().length() + 1));
    }

    private static File fileSize(File start) {
        if (start.isFile()){
            return start;
        }
        File largest = null;
        if (start.isDirectory()) {
            File[] files = start.listFiles();
            for (File f : files) {
                File testFile = fileSize(f);
                if ((largest == null) || (testFile != null) && (testFile.length() > largest.length())){
                    largest = testFile;
                }

            }
        }
        return largest;
    }
}
