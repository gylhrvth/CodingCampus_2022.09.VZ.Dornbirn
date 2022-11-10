package patric.week08.CarSimulation;

public class Car {

    public String Hersteller;
    public String Model;
    public int kW;
    public int Tankinhalt;
    public String Antriebsart;
    public int Gewicht;


    public Car(String Hersteller, String Model, int kW, int Tankinhalt, String Antriebsart, int Gewicht) {
        this.Hersteller = Hersteller;
        this.Model =Model;
        this.kW = kW;
        this.Tankinhalt = Tankinhalt;
        this.Antriebsart = Antriebsart;
        this.Gewicht = Gewicht;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Hersteller='" + Hersteller + '\'' +
                ", Model='" + Model + '\'' +
                ", kW=" + kW +
                ", Tankinhalt=" + Tankinhalt +
                ", Antriebsart='" + Antriebsart + '\'' +
                ", Gewicht=" + Gewicht +
                '}';
    }
}
