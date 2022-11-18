package gyula.week09.fileExample;

import java.io.File;

public class FileExample {

    public static void main(String[] args) {
        IFileReceived dpfh = new DummyPrintFileHandler();
        IFileReceived printInRed = new IFileReceived() {
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


        File startFile = new File("C:\\Users\\gyula.horvath\\Documents\\CC2022.09\\src\\main\\resources");
        FileTreeWalker ftw = new FileTreeWalker(dpfh);
        ftw.processFileStructure(startFile);
        System.out.println("==========");
        CountFiles cf = new CountFiles();
        ftw = new FileTreeWalker(printInRed, cf);
        ftw.processFileStructure(startFile);
        System.out.println("Count files: " + cf.getCount());

        System.out.println("==========");
        ftw = new FileTreeWalker(new IFileReceived() {
            @Override
            public void onFileReceived(int depth, File file) {
                if (!file.isDirectory() && file.getName().endsWith(".txt")){
                    System.out.println(file.getAbsolutePath());
                }
            }
        });
        ftw.processFileStructure(startFile);
    }


}
