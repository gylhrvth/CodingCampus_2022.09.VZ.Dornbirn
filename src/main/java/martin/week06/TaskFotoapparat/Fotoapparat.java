package martin.week06.TaskFotoapparat;

public class Fotoapparat {
    private final String cReset = "\u001B[0m";
    private final String cWBG = "\u001B[7m";
    private static int lastID = 1;
    private int id;
    private int brennweiteMin;
    private int brennweiteMax;
    private int brennweite;
    private String model;
    private String hersteller;
    private int megapixel;

    public Fotoapparat() {
        id = lastID;
        lastID++;
        brennweiteMin = 22;
        brennweiteMax = 58;
        brennweite = 35;
        model = "Kartoffel";
        hersteller = "Billigsdorfer";
        megapixel = 1;
    }

    public Fotoapparat(int brennweiteMin, int brennweiteMax, String model, String hersteller, int megapixel) {
        id = lastID;
        lastID++;
        this.brennweiteMin = brennweiteMin;
        this.brennweiteMax = brennweiteMax;
        brennweite = brennweiteMax - brennweiteMin;
        this.model = model;
        this.hersteller = model;
        this.megapixel = megapixel;
    }

    public void setBrennweite(int brennweite) {
        if (brennweite < this.brennweiteMin) {
            System.out.printf("%s%d Unterschreitet minimale Brennweite.%s%n", "\u001B[31m", brennweite, "[0m");
        } else if (brennweite > this.brennweiteMax) {
            System.out.printf("%s%d Überschreitet maximale Brennweite.%s%n", "[31m", brennweite, "\u001B[0m");
        } else {
            this.brennweite = brennweite;
            System.out.printf("%sBrennweite auf %d gesetzt.%s%n", "[92m", brennweite, "\u001B[0m");
        }
    }

    public int getID() {
        return id;
    }

    public int getBrennweiteMin() {
        return brennweiteMin;
    }

    public int getBrennweiteMax() {
        return brennweiteMax;
    }

    public int getBrennweite() {
        return brennweite;
    }

    public String getModel() {
        return model;
    }

    public String getHersteller() {
        return hersteller;
    }

    public int getMegapixel() {
        return megapixel;
    }

    public void makeAPhoto() {
        System.out.printf("%s|.----------------------.|%s%n", cWBG, cReset);
        System.out.printf("%s||      %s%s#SoCringe%s%s       ||%s%n", cWBG,cReset,"\u001B[48;5;124m",cReset,cWBG, cReset);
        System.out.printf("%s||                      ||%s%n", cWBG, cReset);
        System.out.printf("%s||     .-\"````\"-.       ||%s%n", cWBG, cReset);
        System.out.printf("%s||    /  _.._    `\\     ||%s%n", cWBG, cReset);
        System.out.printf("%s||   / /`    `-.   ; . .||%s%n", cWBG, cReset);
        System.out.printf("%s||   | |__  __  \\   |   ||%s%n", cWBG, cReset);
        System.out.printf("%s||.-.| | e`/e`  |   |   ||%s%n", cWBG, cReset);
        System.out.printf("%s||   | |  |     |   |'--||%s%n", cWBG, cReset);
        System.out.printf("%s||   | |  '-    |   |   ||%s%n", cWBG, cReset);
        System.out.printf("%s||   |  \\ --'  /|   |   ||%s%n", cWBG, cReset);
        System.out.printf("%s||   |   `;---'\\|   |   ||%s%n", cWBG, cReset);
        System.out.printf("%s||   |    |     |   |   ||%s%n", cWBG, cReset);
        System.out.printf("%s||   |  .-'     |   |   ||%s%n", cWBG, cReset);
        System.out.printf("%s||'--|/`        |   |--.||%s%n", cWBG, cReset);
        System.out.printf("%s||   ;    .     ;  _.\\  ||%s%n", cWBG, cReset);
        System.out.printf("%s||    `-.;_    /.-'     ||%s%n", cWBG, cReset);
        System.out.printf("%s||         ````         ||%s%n", cWBG, cReset);
        System.out.printf("%s||jgs___________________||%s%n", cWBG, cReset);
        System.out.printf("%s'------------------------'%s%n", cWBG, cReset);
    }
}
