package gyula.week07.foto;

public class Camera {
    private String description;
    private int megaPixel;
    private MemoryCard memoryCard;

    private int lastPhotoId = 0;

    public Camera(String description, int megaPixel){
        this.description = description;
        this.megaPixel = megaPixel;
        memoryCard = null;
    }

    public void insertMemoryCard(MemoryCard c){
        if (memoryCard != null) {
            System.out.println("Remove inserted memory card before insert a new one");
        } else {
            memoryCard = c;
        }
    }

    public MemoryCard removeMemoryCard(){
        MemoryCard m = memoryCard;
        memoryCard = null;
        return m;
    }

    public boolean takePhoto(){
        ++lastPhotoId;
        Photo p = new Photo(lastPhotoId, (int)Math.ceil(megaPixel * 0.3f));
        return memoryCard.writePhoto(p);
    }

    @Override
    public String toString() {
        String text = "Camera " + description + "\n";
        if (memoryCard != null) {
            text += "  " + memoryCard + " " + memoryCard.getFreeCapacity();
        } else {
            text += "  No memory card has found.";
        }
        return text;
    }
}
