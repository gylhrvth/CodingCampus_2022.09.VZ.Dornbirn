package milan.week06.Fotoapparat;

public class Objektiv {

    private int minBrennweite;
    private int maxBrennweite;
    private float blende;


    public Objektiv() {
        minBrennweite = 0;
        maxBrennweite = 0;
        blende = 0f;
    }

    public String toString() {
        return "min. Brennweite: " + minBrennweite + " mm\n" +
                "max. Brennweite: " + maxBrennweite + " mm\n" +
                "Blende: " + blende + "\n";
    }

    public float getBlende() {
        return blende;
    }

    public int getMinBrennweite() {
        return minBrennweite;
    }

    public int getMaxBrennweite() {
        return maxBrennweite;
    }

    public void setBlende(float blende) {
        this.blende = blende;
    }

    public void setMinBrennweite(int minBrennweite) {
        this.minBrennweite = minBrennweite;
    }

    public void setMaxBrennweite(int maxBrennweite) {
        this.maxBrennweite = maxBrennweite;
    }
}
