package batuhan.week06.Campackage;

public class MemoryCard {
    private String memoryCardModel;
    private double memoryCapacityInMb;

    private double freeMemoryInMb;
    private int takenFotos;

    public MemoryCard(String memoryCardModel, long memoryCapacityInMb) {
        this.memoryCardModel = memoryCardModel;
        this.memoryCapacityInMb = memoryCapacityInMb;
        this.freeMemoryInMb = memoryCapacityInMb;
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




