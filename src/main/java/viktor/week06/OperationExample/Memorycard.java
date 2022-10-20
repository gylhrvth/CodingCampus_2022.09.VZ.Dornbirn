package viktor.week06.OperationExample;

public class Memorycard {

    private String model;
    private String producer;
    private double sizeOfMemoryCard;
    private double freeMemory;
    private int takenPhotos = 0;


    public Memorycard(String model, String producer, int sizeOfMemoryCard){
        this.model = model;
        this.producer = producer;
        this.sizeOfMemoryCard = sizeOfMemoryCard;
        this.freeMemory = sizeOfMemoryCard;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getSizeOfMemoryCard() {
        return sizeOfMemoryCard;
    }



    public void savePhoto(double sizeOfPhoto) {
        freeMemory -= sizeOfPhoto;
        if(freeMemory == 0){
            System.out.println("Your memory card is full! Please change it!");
        }
        takenPhotos++;
    }

    public double getFreeMemory() {
        return freeMemory;
    }

    public int getTakenPhotos() {
        return takenPhotos;
    }
}
