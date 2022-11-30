package batuhan.week10;

import java.io.File;

public class DummyPrintFileHandler implements FileReceived {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    @Override
    public void onFileReceived(int depth, File file) {
        if (file.isDirectory()) {
            System.out.println("  ".repeat(depth) + file.getName());
        } else {
            System.out.println("  ".repeat(depth) + ANSI_GREEN + file.getName() + ANSI_RESET);
        }
    }
}

