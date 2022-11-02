package fatima.week06.Camera;

public class Camera {

    private String model;
    private String brand;
    private double megapixel;
    private String takePhoto;
    private MemoryCard memoryCard;
    private Objective objective;


    public Camera(String brand, String model, double megapixel) {
        this.brand = brand;
        this.model = model;
        this.megapixel = megapixel;
    }

    public void setMemoryCard(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    public void setObjective(Objective objective) {
        this.objective = objective;
    }

    public String takePhoto() {
        double sizeOfPhoto = megapixel * 0.3;
        try {
            memoryCard.savePhoto((long) sizeOfPhoto);
            return """
                           
                           ---------------------------
                           |                         |
                           |     -----     -----     |
                           |       O         O       |
                           |            >            |
                           |                         |
                           |        ---------        |
                           |                         |
                           ---------------------------
                    """;
        } catch (FullMemoryCardException fmce){
            fmce.printStackTrace();
            return """
                           
                           ---------------------------
                           |                         |
                           |     -----     -----     |
                           |       O         O       |
                           |            >            |
                           |                         |
                           |         -------         |
                           |        /       \\        |
                           ---------------------------
                    """;
        }
        //Speicherbedarf von foto anhand von megapixel berechnen
        //schauen ob genügend speicherplatz auf sd karte vorhanden
        //wenn ja, foto speicher auf sd karte
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getMegapixel() {
        return megapixel;
    }

    public void setMegapixel(double megapixel) {
        this.megapixel = megapixel;
    }

    public String getTakePhoto() {
        return takePhoto;
    }

    public void setTakePhoto(String takePhoto) {
        this.takePhoto = takePhoto;
    }

    public String toString() {
        return "camera: \n" + "brand: " + brand + "\n" +
                "model: " + model + "\n" +
                "megapixel: " + megapixel;
    }
}