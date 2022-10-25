package batuhan.week06.Campackage;

public class Camerapackage {


    private static int lastID = 1;
    private int id;
    private String hersteller;
    private String model;
    private int megapixel;
    private MemoryCard memoryCard;
    private CameraLens CamLens;
    private boolean cover;
    private boolean slotted;
    private boolean hasCamLens;
    private boolean hasmemoryCard;


    public Camerapackage(String model, String hersteller) {

        id = lastID;
        ++lastID;
        this.model = model;
        this.hersteller = hersteller;
        megapixel = 48;
        cover = false;
        slotted = false;
        this.CamLens = null;
        this.memoryCard = null;
        hasmemoryCard = false;
    }


    public void setBrennweite(int brennweite) {
        if (brennweite < this.CamLens.getBrennweiteMin()) {
            System.out.printf("%s%d Unterschreitet minimale Brennweite.%s%n", "\u001B[31m", brennweite, "[0m");
        } else if (brennweite > CamLens.getBrennweiteMax()) {
            System.out.printf("%s%d Überschreitet maximale Brennweite.%s%n", "[31m", brennweite, "\u001B[0m");
        } else {
            this.CamLens.setBrennweite(brennweite);
            System.out.printf("%sBrennweite auf %d gesetzt.%s%n", "[92m", CamLens.getBrennweite(), "\u001B[0m");
        }
    }


    public int getId() {
        return id;
    }
    public int getBrennweiteMin(){
        return CamLens.getBrennweiteMin();
    }


    public int getBrennweiteMax(){
        return CamLens.getBrennweiteMax();
    }



    public void setMemoryCard(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }
    public String getmodel() {
        return model;
    }
    public String gethersteller() {
        return hersteller;
    }
    public int getMegapixel() {
        return megapixel;
    }

    public boolean getcover(){
        return getcover();
    }
    public void slotted(){
        this.slotted = true;
    }

    public void fillMemoryCard(){

    }







    public void takeFoto() {
        double size = 0.3;
        double photoSize = megapixel * size;
        if(memoryCard.getFreeMemoryInMb() >= photoSize) {
            System.out.println(   "            __,__\n" +
                    "   .--.  .-\"     \"-.  .--.\n" +
                    "  / .. \\/  .-. .-.  \\/ .. \\\n" +
                    " | |  '|  /   Y   \\  |'  | |\n" +
                    " | \\   \\  \\ 0 | 0 /  /   / |\n" +
                    "  \\ '- ,\\.-\"`` ``\"-./, -' /\n" +
                    "   `'-' /_   ^ ^   _\\ '-'`\n" +
                    "       |  \\._   _./  |\n" +
                    "       \\   \\ `~` /   /\n" +
                    "        '._ '-=-' _.'\n" +
                    "           '~---~'");
            //Foto machen
            memoryCard.savePicture(photoSize);
        } else {
            System.out.println("Kann kein Foto machen!");
        }
        //Ausrechnen wie groß das Foto wird Megapixel * 0.3
    }

    public String toString() {
        return "Hallo! " +
                "\n Dürfte ich von ihnen ein Foto machen mit meinem neuen "
                + model
                + " von "
                + hersteller
                + ". \nEs hat "
                + megapixel
                + " Megapixel"
                + "\n \n Achtung gleich öffnet sich die innenkamera\n";

    }

}
