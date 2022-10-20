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
        takenPhotos++;
    }

    public boolean checkTheCapacity(double sizeOfPhoto){
        if (freeMemory < sizeOfPhoto){
            System.out.println("You don't have enough storage space! Please change it!");
            return false;
        }else{
            return true;
        }
    }

    public double getFreeMemory() {
        return freeMemory;
    }

    public int getTakenPhotos() {
        return takenPhotos;
    }

}
