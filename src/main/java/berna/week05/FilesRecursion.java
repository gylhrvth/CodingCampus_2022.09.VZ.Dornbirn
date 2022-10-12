package berna.week05;


import java.io.File;

public class FilesRecursion {
    public static void main(String[] args) {
        //datastreams, exercise 4: list all dir and subdir and files. calculate nr files, sum of bytes. use recursion

        //input paths
        File path1 = new File("C:\\Users\\Lenovo\\IdeaProjects\\CodingCampus_2022.09.VZ.Dornbirn\\src\\main\\java\\berna\\week04");
        File path2 = new File("C:\\Users\\Lenovo\\IdeaProjects\\CodingCampus_2022.09.VZ.Dornbirn\\src\\main\\java\\berna");

        System.out.println("\n");
        System.out.println("Parent: " + path2.getAbsolutePath());
        int a = countNrOfFiles(path2);
        System.out.println("nr. of files:  " +a);
        int b = calculateLengthOfFiles(path2);
        System.out.println("total size:  " +b + " bytes");

    }

    public static int countNrOfFiles(File startDir) {
        int counter = 0;

        //check if there are files or directories in startDir
        if (startDir.isFile()) {
            counter = 1;
        }
        if (startDir.isDirectory()) {
            File[] children = startDir.listFiles();
            if (children != null) {
                for (File f : children) {
                    counter = counter + countNrOfFiles(f);
                }
            }
        }
        return counter;
    }

    public static int calculateLengthOfFiles(File startDir){
        int length = 0;
        //check if there are files or directories in startDir
        if (startDir.isFile()) {
            length = (int) startDir.length();
        }
        if (startDir.isDirectory()){
            File[] children = startDir.listFiles();
            if (children != null) {
                for (File f : children) {
                    //length = length + calculateLengthOfFiles(f);
                    length += calculateLengthOfFiles(f);
                }
            }
        }
        return length;

    }


}



