package stefan.week06.FotoCamera;

public class Objektiv {
    private int maxBrennweite;
    private int minBrennweite;
    private int filterdurchmesser;

    public Objektiv(int maxBrennweite) {
        maxBrennweite = maxBrennweite;
        minBrennweite = 1;
        filterdurchmesser = 3;

    }


    public int getMaxBrennweite() {
        return maxBrennweite;
    }

    public int setMaxBrennweite() {
        return maxBrennweite;
    }

    public int getMinBrennweite() {
        return minBrennweite;
    }

    public int setMinBrennweite() {
       return minBrennweite;
    }

    public int getFilterdurchmesser() {
        return filterdurchmesser;
    }

    public int setFilterdurchmesser() {
        return filterdurchmesser;
    }
}
