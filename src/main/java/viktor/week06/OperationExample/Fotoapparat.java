package viktor.week06.OperationExample;

public class Fotoapparat {

    private int brenn_min_max;
    private String model;
    private String producer;
    private double mp;
    private int count = 0;

    private static final double PICTURE_SIZE_PER_MEGAPIXEL = 0.3;

    public Fotoapparat(int brenn_min_max, String model, String producer, double mp){
        this.brenn_min_max = brenn_min_max;
        this.model = model;
        this.producer = producer;
        this.mp = mp;
    }

    public double getSizeOfPicture(){
        return mp * PICTURE_SIZE_PER_MEGAPIXEL;
    }


    public int getBrenn_min_max() {
        return brenn_min_max;
    }

    public void setBrenn_min_max(int brenn_min_max) {
        this.brenn_min_max = brenn_min_max;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public String takePhoto(){
        count++;

        return "A photo succesfully was created!" + " Number of pictures: " + count ;
    }


    public String toString(){

        return "Brennweite min/max: " + brenn_min_max + "\n"+
                "Model: " + model + "\n" +
                "Hersteller: " + producer + "\n" +
                "MP: " + mp + "\n";
    }
}
