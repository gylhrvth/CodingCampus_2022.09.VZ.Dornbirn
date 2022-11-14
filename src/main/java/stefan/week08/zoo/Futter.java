package stefan.week08.zoo;

public class Futter {

    private String futtername;
    private double einheit;
    private int preis;

    public Futter(String futtername, double einheit, int preis) {
        this.futtername = futtername;
        this.einheit = einheit;
        this.preis = preis;
    }

    public double getEinheit() {
        return einheit;
    }

    public void setEinheit(double einheit) {
        this.einheit = einheit;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    public String getFuttername() {
        return futtername;
    }

    public void setFuttername(String futtername) {
        this.futtername = futtername;
    }

    @Override
    public String toString() {
        return "Futter{" +
                "futtername='" + futtername + '\'' +
                ", einheit=" + einheit +
                ", preis=" + preis +
                '}';

    }

}
