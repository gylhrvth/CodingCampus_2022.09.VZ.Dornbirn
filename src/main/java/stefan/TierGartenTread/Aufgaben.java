package stefan.TierGartenTread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Aufgaben {
    private String aufganname;
    private int counter;
    private List<Arbeiter> arbeiterList;

    public Aufgaben(String aufganname) {
        this.aufganname = aufganname;
        this.counter = counter;
        arbeiterList = new ArrayList<>();
    }

    public String getAufganname() {
        return aufganname;
    }

    public void setAufganname(String aufganname) {
        this.aufganname = aufganname;
    }


}
