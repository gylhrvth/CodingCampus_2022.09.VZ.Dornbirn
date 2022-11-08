package michel.week08.Tiergarten;


public class AnimalFeed {

    private String name;
    private double unit;
    private double unitPrice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnit() {
        return unit;
    }

    public void setUnit(double unit) {
        this.unit = unit;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }


    public AnimalFeed(String name, double unit, double unitPrice) {
        this.name = name;
        this.unit = unit;
        this.unitPrice = unitPrice;
    }

    public String toString() {
        return "Name: " + name + " Einheit: " + unit + " kg Einheitspreis: " + unitPrice + " €";
    }
}
