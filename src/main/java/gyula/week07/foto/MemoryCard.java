package gyula.week07.foto;

import java.util.Vector;

public class MemoryCard {
    private String description;
    private int capacity;

    private Vector<Photo> photos;

    public MemoryCard(String description, int capacity){
        this.description = description;
        this.capacity = capacity;
        photos = new Vector<>();
    }

    public boolean writePhoto(Photo p){
        if (p.getSize() < getFreeCapacity()) {
            photos.add(p);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return description + " " + capacity + "\n" +
        "    " + photos;
    }

    public int getPhotoCount(){
        return photos.size();
    }

    public Photo getPhoto(int index){
        if (index >= photos.size()) return null;
        return photos.get(index);
    }

    public void deletePhoto(Photo p){
        photos.remove(p);
    }

    public int getFreeCapacity(){
        int sumUsedStorage = 0;
        for (Photo p : photos){
            sumUsedStorage += p.getSize();
        }
        return capacity - sumUsedStorage;
    }
}
