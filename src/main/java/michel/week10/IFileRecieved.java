package michel.week10;

import java.io.File;

public interface IFileRecieved {
    void onFileReceived(int depth, File file);
}
