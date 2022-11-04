package patric.week08.Zoo;

public class Futter {
    private String name;
    private String einheit;
    private double einheitPreis;

    public Futter(String name, String einheit, double einheitPreis) {
        this.name = name;
        this.einheit = einheit;
        this.einheitPreis = einheitPreis;
    }

    public String getName() {
        return name;
    }

    public double getEinheitPreis() {
        return einheitPreis;
    }

    public String getEinheit() {
        return einheit;
    }

    @Override
    public String toString() {
        return "Futter{" +
                "name='" + name + '\'' +
                ", einheit=" + einheit +
                ", einheitPreis=" + einheitPreis +
                '}';
    }
}
