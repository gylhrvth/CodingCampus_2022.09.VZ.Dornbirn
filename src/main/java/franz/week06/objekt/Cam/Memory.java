package franz.week06.objekt.Cam;

import java.util.ArrayList;
import java.util.List;

public class Memory {
    private String description;
    private double capitacity;
    private List<Photo> photos;

    public Memory(String description, int capitacityinMB) {
        this.description = description;
        this.capitacity = capitacityinMB;
        this.photos = new ArrayList<>();
    }

    public boolean writePhoto(Photo p) {
        if (p.getSizeinMB() <= getFreeCapacity()) {
            photos.add(p);
            return true;
        }
        return false;
    }

    public String toString() {
        return description + " " + capitacity + "\n" + " " + photos;
    }

    public Photo getPhoto(int index) {
        if (index >= photos.size()) {
            return null;
        }
        return photos.get(index);
    }

    public Photo getPhotoById(int photoId) {
        for (Photo photo : photos) {
            if (photo.getId() == photoId) {
                return photo;
            }
        }
        return null;
    }

    public void deletePhoto(Photo photo) {
        photos.remove(photo);
    }

    public void deletePhotoById(int id) {
        Photo photo = getPhotoById(id);
        deletePhoto(photo);

    }

    public double getFreeCapacity() {
        // Free storage Capacity - Saved Photos (Photosize)
        double sumPhotosize = 0;
        for (Photo photo : photos) {
            sumPhotosize = sumPhotosize + photo.getSizeinMB();
        }
        return capitacity - sumPhotosize;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public double getCapacit() {
        return capitacity;
    }
}

