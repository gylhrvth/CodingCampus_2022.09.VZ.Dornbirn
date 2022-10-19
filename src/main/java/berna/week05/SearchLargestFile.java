package berna.week05;

import java.io.File;


public class SearchLargestFile {

    //exercise 4: ask user for path and look for the largest file

    public static void main(String[] args) {

        //ask user for path
        File startPath = askUserForPath();

        System.out.println("Your chosen parent is  ");
        System.out.println(startPath);
        System.out.println("\n");

        // find the largest file
        File largestFile = findLargestFile(startPath);

        System.out.println("Largest file size: " + largestFile.length() + "bytes");
        System.out.println("Largest file name: " + largestFile.getName());
        System.out.println("was found in " + largestFile.getParent());

    }


    private static File askUserForPath() {
        return new File("C:\\Users\\Lenovo\\IdeaProjects\\CodingCampus_2022.09.VZ.Dornbirn\\src\\main\\java\\berna\\week03");
    }

    public static File findLargestFile(File startPath) {

        File largestFile = startPath;

        if (startPath.isFile()) {
            largestFile = startPath;
        }

        if (startPath.isDirectory()) {

            File[] children = startPath.listFiles();

            if (children != null) {

                for (File f : children) {
                    File newChildren = findLargestFile(f);

                    if (newChildren.length() > largestFile.length()) {
                        largestFile = newChildren;
                    }
                }
            }
        }
        return largestFile;
    }

}

