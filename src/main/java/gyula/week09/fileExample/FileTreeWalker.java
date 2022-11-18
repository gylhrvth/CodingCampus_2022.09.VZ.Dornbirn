package gyula.week09.fileExample;

import java.io.File;
import java.util.Vector;

public class FileTreeWalker {


    private Vector<IFileReceived> fileHandlerList;
    public FileTreeWalker(IFileReceived... fileReceiveds){
        this.fileHandlerList = new Vector<>();
        addFileHandler(fileReceiveds);
    }

    public void addFileHandler(IFileReceived... fileReceiveds){
        for (IFileReceived fr : fileReceiveds){
            if (!fileHandlerList.contains(fr)){
                fileHandlerList.add(fr);
            }
        }
    }

    public void processFileStructure(File f) {
        processFileStructure(0, f);
    }

    private void processFileStructure(int depth, File f){
        for (IFileReceived fr : fileHandlerList) {
            fr.onFileReceived(depth, f);
        }
        if (f.isDirectory()){
            for (File child : f.listFiles()){
                processFileStructure(depth + 1, child);
            }
        }
    }


}
