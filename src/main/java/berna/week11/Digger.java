package berna.week11;

import java.io.File;

public class Digger extends PrintParentStructure {
        public File startDir;


    public Digger(File startDir) {
        super(startDir);
        this.startDir = startDir;
    }

    public void digTrough() {

        if (startDir.isDirectory()) {
            for (File f : startDir.listFiles()) {
                PrintParentStructure pps = new PrintParentStructure(f);
            }
        } else{
            PrintParentStructure pps = new PrintParentStructure(startDir);
        }

    }
}


