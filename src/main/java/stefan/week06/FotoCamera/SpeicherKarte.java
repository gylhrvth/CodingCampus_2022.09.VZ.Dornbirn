package stefan.week06.FotoCamera;

public class SpeicherKarte {
    private int memory;
    private int freeMemory;

    private int takenFotos;

    public SpeicherKarte(int memory) {
        this.memory = memory;
        this.freeMemory = memory;

    }

    public void saveFoto(int sizeOfFoto) {
        takenFotos++;
        freeMemory = freeMemory - sizeOfFoto;
    }

    public int setMemory() {
        return memory;
    }

    public int getTakenFotos() {
        return takenFotos;
    }

    public int getFreeMemory() {
        return freeMemory;
    }

    public int getMemory() {
        return memory;
    }
}


