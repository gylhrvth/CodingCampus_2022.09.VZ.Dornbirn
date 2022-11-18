package gyula.week09.fileExample;

import java.io.File;

public interface IFileReceived {
    abstract void onFileReceived(int depth, File file);
}
