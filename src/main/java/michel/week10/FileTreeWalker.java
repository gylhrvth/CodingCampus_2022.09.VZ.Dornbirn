package michel.week10;


import java.io.File;
import java.util.Vector;

public class FileTreeWalker { // Erstellt Liste/Tree
    private final Vector<IFileRecieved> fileHandlerList;

    public FileTreeWalker(IFileRecieved... iFileRecieveds) { //Interface IFileRecieved ->
        fileHandlerList = new Vector<>();
        addFileHandler(iFileRecieveds);
    }
    public void addFileHandler(IFileRecieved...iFileRecieveds){
        for (IFileRecieved ifr:iFileRecieveds) {
            if(!fileHandlerList.contains(ifr)){
                fileHandlerList.add(ifr);
            }
        }
    }
    public void processFileStructure(File f) { //Eingabe Main
        processFileStructure(0, f);
    }

    private void processFileStructure(int depth, File f){
        for (IFileRecieved fr : fileHandlerList) {
            fr.onFileReceived(depth, f);
        }
        if (f.isDirectory()){
            for (File child : f.listFiles()){
                processFileStructure(depth + 1, child);
            }
        }
    }
}
