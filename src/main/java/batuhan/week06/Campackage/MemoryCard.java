package batuhan.week06.Campackage;

public class MemoryCard {
    private String memoryCardModel;
    private double memorycapacity;

    private double freeMemory;
    private int takenFotos;

    public MemoryCard(String memoryCardModel, long memorycapacity) {
        this.memoryCardModel = memoryCardModel;
        this.memorycapacity = memorycapacity;
        this.freeMemory = memorycapacity;
    }

    public String getMemoryCardModel() {
        return memoryCardModel;
    }

    public double getMemorycapacity() {
        return memorycapacity;
    }

    public double getFreeMemory() {
        return freeMemory;
    }

    private void savePicture(double dataInMb) {
        freeMemory = freeMemory - dataInMb;
        takenFotos++;
    }

    public int getTakenFotos() {
        return takenFotos;
    }
}




