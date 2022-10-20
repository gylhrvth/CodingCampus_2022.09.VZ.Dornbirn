package milan.week06.Fotoapparat;

public class Speicherkarte {
    private static int lastFotoCounter = 1;

    private int fotoCounter;
    private int speicherPlatz;
    private String hersteller;

    public Speicherkarte() {
        fotoCounter = lastFotoCounter;
        ++lastFotoCounter;
        hersteller = "NoName";
        speicherPlatz = 0;
    }

    public String toString() {
        return "Hersteller: " + hersteller + "\n" +
                "Speichergröße: " + speicherPlatz + " gb\n";
    }
    public int getFotoCounter(){
        return fotoCounter;
    }
    public String getHersteller() {
        return hersteller;
    }

    public int getSpeicherPlatz() {
        return speicherPlatz;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public void setSpeicherPlatz(int speicherPlatz) {
        this.speicherPlatz = speicherPlatz;
    }
}
