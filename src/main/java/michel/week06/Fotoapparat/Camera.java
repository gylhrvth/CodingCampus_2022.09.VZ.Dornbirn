package michel.week06.Fotoapparat;


public class Camera {

    private String typ; // z.B. Spiegelreflex

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    private String hersteller;

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    private double megapixel;

    public double getMegapixel() {
        return megapixel;
    }

    public void setMegapixel(double megapixel) {
        this.megapixel = megapixel;
    }

    private MemoryCard memoryCard;  // Speicherkarte aufrufen
    private Objectiv objectiv;
    private int lastPhotoID = 1; // ID startet mit 0 (index)


    public Camera(String hersteller, String model, String typ, double megapixel) {  // Spezifikationen ohne Zubehör
        this.hersteller = hersteller;
        this.model = model;
        this.typ = typ;
        this.megapixel = megapixel;

        memoryCard = null;      // Keine Interne SD Card daher null.
        objectiv = null;        // Kein Obbjektiv

    }

    public void setObjektiv(Objectiv selectedObjectiv) {
        if (objectiv != null) {
            System.out.println("No Objectiv selected!");
        } else {
            objectiv = selectedObjectiv;
        }
    }

    public Objectiv takeOffObjectiv(){
        Objectiv removeObjectiv = objectiv;
        objectiv = null;
        return removeObjectiv;
    }


    public void insertMemoryCard(MemoryCard selectedMemoryCard) {  //MemoryCard mC = ausgewählte Speicherkarte m1,m2,m3,...
        if (memoryCard != null) {
            System.out.println("Please remove inserted Memory Card before insert a new one!"); // wenn bereits eine Speicherkarte im Slot ist
        } else {
            memoryCard = selectedMemoryCard; // ansonsten wird die gewünschte Sp.k. ausgewählt
        }
    }

    public MemoryCard removeMemoryCard() { // Wert wieder auf null setzen
        MemoryCard emtySlot = memoryCard;
        memoryCard = null;
        return emtySlot;
    }

    public boolean takePhoto() {
        ++lastPhotoID;
        Photo p = new Photo(lastPhotoID - 1, (int) Math.ceil(megapixel * 0.3));
        return memoryCard.savePhoto(p);
    }

    public String toString() { // Ausgabe Details
        String text = "\n=================================================="
                + "\nBrand: >" + hersteller
                + "<\nModel: >" + model
                + "<\nTyp: >" + typ
                + "<\nMegapixel: >" + megapixel + "MP <";
        if (memoryCard != null) {
            text += " \nMemory card: " + memoryCard.toString()
                    + "\nFree Memory: " + memoryCard.getFreeCapacity() + "MB."
                    + "\nSaved Pictures: " + memoryCard.getPhotoCount();
        } else {
            text += "\nEs wurde keine Speicherkarte gefunden";
        }
        text += "\n==================================================";
        return text;
    }

}
