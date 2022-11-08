package stefan.week06.FotoCamera;

public class Objektiv {
    private int maxBrennweite;
    private int minBrennweite;
    private int filterdurchmesser;

    public Objektiv(int filterdurchmesser) {
       this.filterdurchmesser= filterdurchmesser;

    }

    @Override
    public String toString() {
        return "Filterdurchmesser:"+ filterdurchmesser;
    }
}
