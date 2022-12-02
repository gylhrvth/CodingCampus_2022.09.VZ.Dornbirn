package michel.week10;

import java.io.File;

public class FileExample {
    public static void main(String[] args) {
        IFileRecieved dpfh = new DummyPrintFileHandler();
        IFileRecieved printInRed = new IFileRecieved() {
            public static final String ANSI_RESET = "\u001B[0m";
            public static final String ANSI_RED = "\u001B[31m";

            @Override
            public void onFileReceived(int depth, File file) {
                if (file.isDirectory()) {
                    System.out.println("  ".repeat(depth) + file.getName());
                } else {
                    System.out.println("  ".repeat(depth) + ANSI_RED + file.getName() + ANSI_RESET);
                }
            }
        };

        File startFile = new File("/Users/sutez/IdeaProjects/CodingCampus_2022.09.VZ.Dornbirn/src/main/java/michel");
        FileTreeWalker ftw = new FileTreeWalker(dpfh);
        ftw.processFileStructure(startFile);

        System.out.println("==========\ncount");
//         Count
        CountFiles cf = new CountFiles();
        ftw = new FileTreeWalker(printInRed, cf);
        ftw.processFileStructure(startFile);
        System.out.println("Count files: " + cf.getCount());

        System.out.println("==========");

        ftw = new FileTreeWalker(new IFileRecieved() {
            @Override
            public void onFileReceived(int depth, File file) {
                if (!file.isDirectory() && file.getName().endsWith(".txt")) {
                    System.out.println(file.getAbsolutePath());
                }
            }
        });
        ftw.processFileStructure(startFile);
    }
}
