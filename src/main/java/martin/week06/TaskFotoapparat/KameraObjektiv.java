package martin.week06.TaskFotoapparat;

public class KameraObjektiv {
    private static int lastID = 1;
    private int id;
    private int brennweiteMin;
    private int brennweite;
    private int brennweiteMax;
    private boolean abdeckungOffen;
    private boolean slotted;

    public KameraObjektiv(int brennweiteMin, int brennweiteMax) {
        id = lastID;
        lastID++;
        this.brennweiteMin = brennweiteMin;
        this.brennweiteMax = brennweiteMax;
        brennweite = brennweiteMax - brennweiteMin;
        abdeckungOffen = false;
        slotted = false;
    }

    public int getId() {
        return id;
    }

    public int getBrennweiteMin() {
        return brennweiteMin;
    }

    public int getBrennweite() {
        return brennweite;
    }

    public void setBrennweite(int brennweite) {
        this.brennweite = brennweite;
    }

    public int getBrennweiteMax() {
        return brennweiteMax;
    }

    public boolean getAbdeckungOffen() {
        return abdeckungOffen;
    }

    public boolean isSlotted() {
        return slotted;
    }

    public void setSlotted(boolean slotted) {
        this.slotted = slotted;
    }

    public void setAbdeckung(boolean abdeckung) {
        this.abdeckungOffen = abdeckung;
    }
}