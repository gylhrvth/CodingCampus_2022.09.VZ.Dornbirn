package batuhan.week06.Campackage;

public class Camerapackage {


    private static int lastID = 1;

    private int id;
    private String hersteller;
    private int brennweite;
    private String model;
    private int brennweiteMax;
    private int brennweiteMin;
    private int megapixel;
    private MemoryCard memoryCard;


    public Camerapackage(String model, String hersteller) {


        id = lastID;
        ++lastID;

        this.model = model;
        this.hersteller = hersteller;
        brennweite = 38;
        brennweiteMax = 50;
        brennweiteMin = 25;
        megapixel = 1;
    }

    public void setbrennweite(int brennweite) {
        this.brennweite = brennweite;
    }

    public void setBrennweiteMax(int brennweiteMax) {
        this.brennweiteMax = brennweiteMax;
    }

    public void setBrennweiteMin(int brennweiteMin) {
        this.brennweiteMin = brennweiteMin;
    }

    public void setMegapixel(int megapixel) {
        this.megapixel = megapixel;
        
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

    public int getBrennweite() {
        return brennweite;
    }

    public int getBrennweiteMax() {
        return brennweiteMax;
    }

    public int getBrennweiteMin() {
        return brennweiteMin;
    }

    public int getMegapixel() {
        return megapixel;
    }

    public MemoryCard getMemoryCard() {
        return memoryCard;
    }

    public void takeFoto() {
        double size = 0.3;
        double photoSize = megapixel * size;
        if(memoryCard.getFreeMemoryInMb() >= photoSize) {
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
                + "\n \n \n \n \nAchtung gleich öffnet sich die innenkamera\n" +
                "\n\n\n\n\n\n\n\n\n\n" +
                "            __,__\n" +
                "   .--.  .-\"     \"-.  .--.\n" +
                "  / .. \\/  .-. .-.  \\/ .. \\\n" +
                " | |  '|  /   Y   \\  |'  | |\n" +
                " | \\   \\  \\ 0 | 0 /  /   / |\n" +
                "  \\ '- ,\\.-\"`` ``\"-./, -' /\n" +
                "   `'-' /_   ^ ^   _\\ '-'`\n" +
                "       |  \\._   _./  |\n" +
                "       \\   \\ `~` /   /\n" +
                "        '._ '-=-' _.'\n" +
                "           '~---~'";
    }

}
