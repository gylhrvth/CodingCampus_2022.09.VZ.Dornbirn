package mase.week06;

public class Fotoapparat {
    public String model;
    public String hersteller;
    public int megapixel;



    public Fotoapparat(String Model, String Hersteller, int megapixel) {

        this.model = Model;
        this.hersteller = Hersteller;
        this.megapixel = megapixel;


    }

    public String toString() {
        return "Das Model heißt : " + model + " und ist von: " + hersteller + "\n" + "Die Kamera hat : " + megapixel + " megapixel" + "\n";

    }

}
