package mase.week07;

import java.util.Vector;

public class MemoryCard {
    private String description;
    private int capacity;
    private Vector<Photo> photos;

    public MemoryCard(String description, int capacity){
        this.capacity = capacity;
        this.description = description;
        photos = new Vector<>();
    }

    public boolean writePhotos(Photo b){
        if (b.getSize() < getFreeCapacity()){
            photos.add(b);
            return true;
        }
        return false;
    }

    public int getFreeCapacity(){
        int sumUsedStorage = 0;
        for (Photo b : photos){
            sumUsedStorage += b.getSize();
        }
        return capacity -sumUsedStorage;
    }
}

