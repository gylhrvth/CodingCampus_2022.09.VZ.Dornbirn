package batuhan.week10;

import java.io.File;

public class FilesystemTraversal {
    public static void main(String[] args) {
        FileReceived dpfh = new DummyPrintFileHandler();
        FileReceived printInRed = new FileReceived() {

            public static final String ANST_RESET = "\u001B[0m";
            public static final String ANSI_RED = "u001B[31m";


            @Override
            public void onFileReceived(int depth, File file) {
                if (file.isDirectory()) {
                    System.out.println("  ".repeat(depth) + file.getName());

                } else {
                    System.out.println("  ".repeat(depth) + ANSI_RED + file.getName() + ANST_RESET);
                }

            }
        };


        File startFile = new File("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2022.09.VZ.Dornbirn\\src\\main\\java\\batuhan");
        FileTreeWalker ftw = new FileTreeWalker(dpfh);
        //ftw.processFileStructure(startFile);
        System.out.println("===========");
        CountFile cf = new CountFile();
        ftw = new FileTreeWalker(printInRed,cf);
        //ftw.processFileStructure(startFile);
        System.out.println("Count files:" + cf.getCount());

        System.out.println("============");
        ftw = new FileTreeWalker(new FileReceived() {
            @Override
            public void onFileReceived(int depth, File file) {
                if (!file.isDirectory()&& file.getName().endsWith(".txt")){
                    System.out.println(file.getAbsolutePath());
                }
            }
        });

     //ftw.processFileStructure(startFile);
    }
}
