package milan.week06.Fotoapparat;

public class Speicherkarte {

    private int fotoCounter;
    private long freeMemory;
    private long overallMemory;
    private String hersteller;

    public Speicherkarte(long overallMemory) {
        fotoCounter = 0;
        hersteller = "NoName";
        freeMemory = overallMemory;
        this.overallMemory = overallMemory;
    }

    public void resetMemory() {
        freeMemory = overallMemory;
    }

    public String toString() {
        return "Hersteller: " + hersteller + "\n" +
                "Anzahl der erzeugten Fotos: " + fotoCounter + "\n" +
                "Freier Speicher: " + (freeMemory / 1000000) + " mb\n";
    }

    public void setFotoCounter(int fotoCounter) {
        this.fotoCounter = fotoCounter;
    }

    public int getFotoCounter() {
        return fotoCounter;
    }

    public String getHersteller() {
        return hersteller;
    }

    public long getFreeMemory() {
        return freeMemory;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public void setFreeMemory(long freeMemory) {
        this.freeMemory = freeMemory;
    }
}
