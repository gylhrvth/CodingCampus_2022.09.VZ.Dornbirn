package stefan.TierGartenTread;

public class Tier {
private String tiername;
private int alter;
private String gattung;

    public Tier(String tiername, int alter, String gattung) {
        this.tiername = tiername;
        this.alter = alter;
        this.gattung = gattung;
    }

    public String getTiername() {
        return tiername;
    }

    public int getAlter() {
        return alter;
    }

    public String getGattung() {
        return gattung;
    }
}
