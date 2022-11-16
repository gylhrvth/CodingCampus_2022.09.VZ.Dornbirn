package franz.week06.objekt.Cam;


public class Fotoapparat {

    private String description;

    private int megaPixel;

    private Memory memory;

    private int lastPhotoId = 0;

    public Fotoapparat(String description, int megaPixel) {
        this.description = description;
        this.megaPixel = megaPixel;
        memory = null;
    }

    public void insertMemory(Memory newMemory) {
        if (memory != null) {
            System.out.println("Remove inserted memory card before insert a new one");
        } else {
            memory = newMemory;
        }

    }

    public Memory removeMemoryCard() {
        Memory m = memory;
        memory = null;
        return m;
    }

    public int getTotelPhotoCreatedbyThisCamera() {
        return lastPhotoId;
    }

    public int photoCountOnMemory() {
        return memory.getPhotos().size();

    }

    public double getFreeCapacity() {
        return memory.getFreeCapacity();
    }

    public boolean takePhoto() {
        if (memory == null) {
            return false;
        }
        Photo p = new Photo(lastPhotoId, (int) Math.ceil(megaPixel * 0.3f));
        System.out.println("Nice pic 😊");
        boolean saved = memory.writePhoto(p);
        if (saved) {
            ++lastPhotoId;
        }
        return saved;
    }

    public String toString() {
        String text = "Camera" + description + "\n";
        if (memory != null) {
            text += "" + memory + " " + memory.getFreeCapacity();
        } else {
            text += "No memory has found";
        }
        return text;
    }


}




