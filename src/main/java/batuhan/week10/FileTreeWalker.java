package batuhan.week10;

import java.io.File;
import java.util.Vector;

public class FileTreeWalker {

    private Vector<FileReceived> fileHandlerList;
    public FileTreeWalker(FileReceived...fileReceivers){
        this.fileHandlerList = new Vector<>();
        addFileHandler(fileReceivers);
    }


    public void addFileHandler(FileReceived...fileReceivers){
        for (FileReceived fr:fileReceivers) {
            if (!fileHandlerList.contains(fr) ){
                fileHandlerList.add(fr);
            }

        }

    }

    public void processFileStructure(int depth, File f) {
        for (FileReceived fr: fileHandlerList) {
            fr.onFileReceived(depth,f);

        }

        if (f.isDirectory()){
            for (File child:f.listFiles()) {
                processFileStructure(depth+1 , child);

            }
        }

    }
}
