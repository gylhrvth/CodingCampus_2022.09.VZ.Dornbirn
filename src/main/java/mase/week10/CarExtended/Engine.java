package mase.week10.CarExtended;

public class Engine  {
    public String engine;
    public int kw;
    public int kmstand;

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getKw() {
        return kw;
    }

    public void setKw(int kw) {
        this.kw = kw;
    }

    public int getKmstand() {
        return kmstand;
    }

    public void setKmstand(int kmstand) {
        this.kmstand = kmstand;
    }

    public Engine(String engine, int kw){
        this.engine= engine;
        this.kw= kw;
    }
}
