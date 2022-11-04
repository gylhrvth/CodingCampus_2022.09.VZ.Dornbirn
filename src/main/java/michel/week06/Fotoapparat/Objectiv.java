package michel.week06.Fotoapparat;

public class Objectiv {
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    private double brennweiteMin;

    public double getBrennweiteMin() {
        return brennweiteMin;
    }

    public void setBrennweiteMin(double brennweiteMin) {
        this.brennweiteMin = brennweiteMin;
    }

    private double brennweiteMax;

    public double getBrennweiteMax() {
        return brennweiteMax;
    }

    public void setBrennweiteMax(double brennweiteMax) {
        this.brennweiteMax = brennweiteMax;
    }

    //========================================================================

    public Objectiv(String brand, String model, double brennweiteMin, double brennweiteMax) {
        this.brand = brand;
        this.model = model;
        this.brennweiteMin = brennweiteMin;
        this.brennweiteMax = brennweiteMax;
    }

    public String toString(){
        return "Hersteller: >" + brand
                + "< Model: >" + model
                + "< Brennweite min: >" + brennweiteMin
                + "mm < Brennweite max >" + brennweiteMax;
    }

}
