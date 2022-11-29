package berna.week11;

import java.io.File;

public class PrintParentStructure {
    private File parent;
    private File[] children;

    public PrintParentStructure(File startDir){
        this.parent = startDir;
    }


    public boolean isParentDirectory(){
        return parent.isDirectory();
    }

    public File[] setChildren() {
        if(isParentDirectory()){
            this.children = parent.listFiles();
        }else{
            this.children = null;
        }
        return children;
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder(parent.getName() + "\n");
        for(File f: setChildren()){
            text.append("   " + f.getName() + "\n");
        }
        return text.toString();
    }
}
