package mase.week07;

public class Kamera {
    private String description;
    private int megapixel;
    private MemoryCard memoryCard;
    private int lastPhotoId = 0;

    public Kamera(String description, int megapixel){
    this.description = description;
    this.megapixel = megapixel;
    }
    public void insertMemory(MemoryCard b){
        if (memoryCard != null){
            System.out.println("Entfernen Sie zuerst die alte Speicherkartew");
        }else {
            memoryCard = b;
        }
    }
    public MemoryCard removeMemoryCard(){
        MemoryCard m = memoryCard;
        memoryCard = null;
        return m;
    }
    public boolean takePhoto(){
        ++lastPhotoId;
        Photo p = new Photo(lastPhotoId, (int)Math.ceil(megapixel * 0.3f));
        return memoryCard.writePhotos(p);
    }

    public String toString(){
        String text = "Kamera " + description + "\n";
        if(memoryCard != null){
            text += " " +memoryCard + " " + memoryCard.getFreeCapacity();
        }else {
            text+= "Keine Speicherkarte gefunden ";
        }
        return text;
    }
}
