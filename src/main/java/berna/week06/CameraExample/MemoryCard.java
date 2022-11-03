package berna.week06.CameraExample;

import java.util.Vector;

public class MemoryCard {

    private int totalSizeOfCard;

    public Vector<Photo> photosSavedOnSD;


    public MemoryCard() {
        totalSizeOfCard = 1000000; //in kB
        photosSavedOnSD = new Vector<>();
    }

    public int getMemoryFree() {
        int totalSize = 0;
        for (Photo p : photosSavedOnSD) {
            totalSize += p.getSize();  // more general, photos of different sizes allowed
        }
        return totalSizeOfCard - totalSize;
    }


    public void writePhoto(Photo p) {
        if (p.getSize() <= getMemoryFree()){
            photosSavedOnSD.add(p);
            System.out.println("Photo saved on sd!");
        }else{
            System.out.println("not enough free space left! Photo not saved!!");
        }

    }

    public int getNrPhotosSaved() {
        return photosSavedOnSD.size();
    }



}
