package martin.week06.TaskFotoapparat;

public class Speicherkarte {
    private static int lastID = 1;
    private int id;
    private double speicherplatzMax;
    private int fotos;
    private double speicherplatzBelegt;
    private boolean slotted;

    public Speicherkarte(double speicherplatzMax) {
        id = lastID;
        lastID++;
        this.speicherplatzMax = speicherplatzMax;
        slotted = false;
    }

    public Speicherkarte(double speicherplatzMax, double speicherplatzBelegt, int fotos) {
        id = lastID;
        lastID++;
        this.speicherplatzMax = speicherplatzMax;
        this.fotos=fotos;
        this.speicherplatzBelegt = speicherplatzBelegt;
        slotted = false;
    }

    public int getId() {
        return id;
    }

    public double getSpeicherplatzMax() {
        return speicherplatzMax;
    }

    public int getFotos() {
        return fotos;
    }

    public void addAFoto(double fotoSize) {
        fotos++;
        speicherplatzBelegt += fotoSize;
    }

    public double getSpeicherplatzBelegt() {
        return speicherplatzBelegt;
    }

    public void setSpeicherplatzBelegt(double speicherplatzBelegt) {
        this.speicherplatzBelegt = speicherplatzBelegt;
    }

    public boolean isSlotted() {
        return slotted;
    }

    public void setSlotted(boolean slotted) {
        this.slotted = slotted;
    }
}