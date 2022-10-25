package batuhan.week06.Campackage;

public class MemoryCard {
    private static  int latsId = 1;
    private int id;
    private String memoryCardModel;
    private double memoryCapacityInMb;

    private double freeMemoryInMb;
    private int takenFotos;
    private boolean slotted;

    public MemoryCard(String memoryCardModel, long memoryCapacityInMb) {
        id = latsId;
        latsId++;
        this.memoryCardModel = memoryCardModel;
        this.memoryCapacityInMb = memoryCapacityInMb;
        this.freeMemoryInMb = memoryCapacityInMb;
    slotted = false;
    }

    public int getId() {
        return id;
    }

    public String getMemoryCardModel() {
        return memoryCardModel;
    }

    public double getMemoryCapacityInMb() {
        return memoryCapacityInMb;
    }

    public double getFreeMemoryInMb() {
        return freeMemoryInMb;
    }

    public void savePicture(double dataInMb) {
        freeMemoryInMb = freeMemoryInMb - dataInMb;
        takenFotos++;
    }

    public int getTakenFotos() {
        return takenFotos;
    }

}




