package stefan.week08.CarV2;

import java.util.ArrayList;
import java.util.List;

public class Engine {
    private int leistung;


    public Engine(int kw) {
        leistung = kw;

    }


    public int getLeistung() {
        return leistung;
    }

    public void setLeistung(int leistung) {
        this.leistung = leistung;
    }

}
