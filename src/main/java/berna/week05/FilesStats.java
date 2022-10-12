package berna.week05;

import java.io.File;

public class FilesStats {
    public static void main(String[] args) {

        //input
        File f1 = new File("C:\\Users\\Lenovo\\IdeaProjects\\CodingCampus_2022.09.VZ.Dornbirn\\src\\main\\java\\berna\\week04");
        File f2 = new File("C:\\Users\\Lenovo\\IdeaProjects\\CodingCampus_2022.09.VZ.Dornbirn\\src\\main\\java\\berna");
        System.out.println("\n");

        //exercise 1: list directory
        listDirectory(f1);
        System.out.println("\n");

        //exercise 2: number of files and sum of size
        countSumLengthFilesInDir(f1);
        System.out.println("\n");

        //exercise 3: sort the files by size, descending
        File[] sorted = sortFilesSizeDescending(f1);
        for (int i = 0; i < sorted.length; i++) {
            System.out.printf("length of : %-40s is: %6d bytes. \n",sorted[i].getName(), sorted[i].length());
        }

        //exercise 4: list all dir and subdir and files. calculate nr files, sum of bytes. use recursion

    }


    public static void listDirectory(File f) {
        File[] childFiles = f.listFiles();
        if (childFiles != null) {
            for (int i = 0; i < childFiles.length; i++) {

                System.out.println("Child: " + childFiles[i].getName());
            }
        } else {
            System.out.println("This is not a directory!");
        }

    }

    public static long countSumLengthFilesInDir(File f) {

        File[] childFiles = f.listFiles();
        int length = childFiles.length;
        System.out.println("Number of files in this directory:  " + length);

        long sumLengthFiles = 0;
        for (int i = 0; i < childFiles.length; i++) {
            sumLengthFiles = sumLengthFiles + childFiles[i].length();
            System.out.printf("length of : %-40s is: %6d bytes. \n", childFiles[i].getName(), childFiles[i].length());
        }
        System.out.println("Sum of length of files in this directory:  " + sumLengthFiles + " bytes");
        return sumLengthFiles;
    }

    public static File[] sortFilesSizeDescending(File f) {

        File[] childFiles = f.listFiles();

        for (int i = 0; i < childFiles.length - 1; i++) {


            for (int j = 0; j < childFiles.length - i - 1; j++) {

                if (childFiles[j].length() < childFiles[j + 1].length()) {
                    // switch place
                    File copy = childFiles[j];
                    childFiles[j] = childFiles[j + 1];
                    childFiles[j + 1] = copy;
                }
            }
        }
        return childFiles;

    }

}
