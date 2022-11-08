package michel.week08.Tiergarten;


public class AnimalFeed {

    private String name;
    private final double unit;

    private final double unitPrice;

    public AnimalFeed(String name, double unit, double unitPrice) {
        this.name = name;
        this.unit = unit;
        this.unitPrice = unitPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public String toString() {
        return "Name: " + name + " Einheit: " + unit + " kg Einheitspreis: " + unitPrice + " €";
    }
}
