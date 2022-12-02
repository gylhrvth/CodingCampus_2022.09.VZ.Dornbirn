package michel.week10;

import java.io.File;

public class CountFiles implements IFileRecieved{
    private int count = 0;
    public CountFiles() {
    }

    @Override
    public void onFileReceived(int depth, File file) {
        if(file.isFile()) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}
