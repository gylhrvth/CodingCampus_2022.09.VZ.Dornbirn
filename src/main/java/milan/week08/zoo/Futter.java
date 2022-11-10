package milan.week08.zoo;

public class Futter {

//    enum FutterArt{
//
//        TROCKENFUTTER(2.3),
//        NASSFUTTER(3.8);
//
//        private double priceFactor;
//
//        FutterArt(double priceFactor){
//            this.priceFactor = priceFactor;
//        }
//        double calculatePrice(double originalPrice) {
//            return originalPrice * priceFactor;
//        }
//    }

    private String name;
    private String einheit;
    private double einheitsPreis;

    public Futter(String name, double einheitsPreis){
        this.name = name;
        einheit = "kg";
        this.einheitsPreis = einheitsPreis;

    }

    public void setEinheit(String einheit) {
        this.einheit = einheit;
    }

    public void setEinheitsPreis(double einheitsPreis) {
        this.einheitsPreis = einheitsPreis;
    }

    public String getEinheit() {
        return einheit;
    }
    public void printFoodStatistic() {
        System.out.println("Futter: " + name);

    }

    public double getEinheitsPreis() {
        return einheitsPreis;
    }

    public String getName() {
        return name;
    }
}
