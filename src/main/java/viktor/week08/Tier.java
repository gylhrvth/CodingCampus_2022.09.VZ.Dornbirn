

import java.util.HashMap;
import java.util.Map;

public class Tier {

    private String name;
    private String gattung;
    private double quantity;


    public Tier(String name, String gattung) {
        this.name = name;
        this.gattung = gattung;
    }




    @Override
    public String toString() {
        return name + ", " + gattung + "\n";
    }

}
