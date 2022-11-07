package stefan.week06.FotoCamera;

public class SpeicherKarte {
    private int memory;
    private double freeMemory;

    private int takenFotos;

    public SpeicherKarte(int memory) {
        this.memory = memory;
        freeMemory = memory;

    }

    public void saveFoto(double sizeOfFoto) {
        takenFotos++;
        freeMemory = (double) freeMemory - sizeOfFoto;

    }

    public void setMemory(int freeMemory) {
      this.freeMemory=freeMemory;
    }

    public int getTakenFotos() {
        return takenFotos;
    }

   public double getFreeMemory() {
        return freeMemory-takenFotos;
   }


    @Override
    public String toString() {
       return "Ganzer Speicher: "+memory+"\nFreier Speicher: "+freeMemory;
    }
}


