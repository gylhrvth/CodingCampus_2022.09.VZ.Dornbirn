package batuhan.week06.Campackage;

public class CameraLens {

    private static int lastID = 1;
    private int id;


    private int brennweiteMin;
    private int brennweiteMax;
    private int brennweite;
    private boolean cover;
    private boolean slotted;                        //slotted heisst eingesteckt




    public CameraLens(int brennweiteMIn, int brennweiteMax) {
        id = lastID;
        lastID++;
        this.brennweiteMax = brennweiteMax;
        this.brennweiteMin = brennweiteMIn;
        brennweite = brennweiteMax - brennweiteMIn;
        cover = false;
        slotted = false;

    }

    public int getId(){
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

    public void setCover(boolean cover) {
        this.cover = cover;
    }

    public void setSlotted(boolean slotted) {
        this.slotted = slotted;
    }
}
