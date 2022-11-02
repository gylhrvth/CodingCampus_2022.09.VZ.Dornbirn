package mase.week06;

import java.util.Vector;

public class Speicherkarte {
    public int speicherplatz;
    public String hersteller;


    public Speicherkarte(int speicherplatz, String hersteller) {
        this.hersteller = hersteller;
        this.speicherplatz = speicherplatz;

    }

    public String toString() {
        return "Der Speicherplatz beträgt : " + speicherplatz + " GB" + "\n" + "Der Hersteller ist : " + hersteller + "\n";
    }
}
