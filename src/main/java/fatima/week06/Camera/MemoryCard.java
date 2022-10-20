package fatima.week06.Camera;

public class MemoryCard {

    private String brand;
    private float storage;
    private float freeStorage;
    private int photoCounter;

    public MemoryCard(String brand, int storage) {
        this.brand = brand;
        this.storage = storage;
        this.freeStorage = storage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getPhotoCounter() {
        return photoCounter;
    }

    public void savePhoto(long PhotoSize) {
       freeStorage -= PhotoSize;
       photoCounter++;
    }

    public float getFreeStorage() {
        return freeStorage;
    }

    public void setPhotoCounter(int photoCounter) {
        this.photoCounter = photoCounter;
    }

    @Override
    public String toString() {
        return "Memory card: \n" +
                "brand: " + brand + "\n" +
                "storage: " + storage + " mb\n" +
                "free storage: " + freeStorage + " mb\n" +
                "taken photos: " + photoCounter;
    }
}
