package berna.week08.ZooExample;

public class Enclosure {
    public String enclo1;
    public String enclo2;
    public String enclo3;

    public Enclosure() {
        this.enclo1 = "ALpenwiese";
        this.enclo2 = "Ried";
        this.enclo3 = "Terrarium (warm)";
    }

//    public String getEnclo1() {
//        return enclo1;
//    }
//
//    public String getEnclo2() {
//        return enclo2;
//    }
//
//    public String getEnclo3() {
//        return enclo3;
//    }

    @Override
    public String toString() {
        return  "    Gehege: " + enclo1 + "\n" +
                "    Gehege: " + enclo2 + "\n" +
                "    Gehege: " + enclo3 + "\n";
    }
}
