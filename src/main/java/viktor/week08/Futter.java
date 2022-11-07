package viktor.week08;

public class Futter {


    private String name;
    private String unit;
    private double unitPrice;

    public Futter(String name, String unit, double unitPrice){
        this.name = name;
        this.unit = unit;
        this.unitPrice = unitPrice;
    }

    public String getName(){
        return name;
    }

    public double getUnitPrice(){
        return unitPrice;
    }

    @Override
    public String toString() {
        return name + ", " + unit + ", " + unitPrice;
    }
}
