package gyula.week09.fileExample;

import java.io.File;

public class CountFiles implements IFileReceived{
    private int count = 0;

    CountFiles(){
    }

    @Override
    public void onFileReceived(int depth, File file) {
        if (!file.isDirectory()) {
            ++count;
        }
    }

    public int getCount() {
        return count;
    }
}
