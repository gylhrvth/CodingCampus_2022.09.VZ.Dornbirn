package batuhan.week10;

import java.io.File;

public class CountFile  implements FileReceived{
    private int count = 0;
    CountFile(){


    }




    @Override
    public void onFileReceived(int depth, File file) {
     if (!file.isDirectory()){
         count++;
     }
    }


    public int getCount() {
        return count;
    }
}
