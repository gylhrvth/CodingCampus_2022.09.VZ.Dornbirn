package batuhan.week10;

import java.io.File;

public interface FileReceived {


    abstract void onFileReceived(int depth, File file);
}


