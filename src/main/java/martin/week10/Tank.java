package martin.week10;

public class Tank {

    private static int globalIdCounter = 0;
    private int id;
    private final int tankInhaltMax;
    private int tankInhalt;
    public Tank(int tankInhaltMax) {
        globalIdCounter++;
        id = globalIdCounter;
        this.tankInhaltMax = tankInhaltMax;
        this.tankInhalt = tankInhaltMax;
    }
    public int getTankInhaltMax() {
        return tankInhaltMax;
    }

    public int inhalt() {
        return tankInhalt;
    }

    public void fill(int tankInhalt) {
        this.tankInhalt = tankInhalt;
    }
}