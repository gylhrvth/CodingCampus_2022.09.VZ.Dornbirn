package martin.week06.TaskFotoapparat;

import java.util.Random;

public class Fotoapparat {
    private final String cReset = "\u001B[0m";
    private final String cWBG = "\u001B[7m";
    private final Random rand = new Random();
    private static int lastID = 1;
    private int id;
    private String model;
    private String hersteller;
    private int megapixel;
    private double fotoSize;
    private KameraObjektiv camOb;
    private Speicherkarte sd;
    private boolean hasCamOb;
    private boolean hasSD;
    private boolean tLS;

    public Fotoapparat() {
        id = lastID;
        lastID++;
        model = "Kartoffel";
        hersteller = "Billigsdorfer";
        megapixel = 1;
        fotoSize = 0.3 * megapixel;
        this.camOb = null;
        this.sd = null;
        hasCamOb = false;
        hasSD = false;
        tLS = false;
    }

    public Fotoapparat(int megapixel, String hersteller, String model) {
        id = lastID;
        lastID++;
        this.model = model;
        this.hersteller = hersteller;
        this.megapixel = megapixel;
        fotoSize = 0.3 * megapixel;
        this.camOb = null;
        this.sd = null;
        hasCamOb = false;
        hasSD = false;
        tLS = false;
    }

    public void setBrennweite(int brennweite) {
        if (brennweite < this.camOb.getBrennweiteMin()) {
            System.out.printf("%s%d Unterschreitet minimale Brennweite.%s%n", "\u001B[31m", brennweite, "[0m");
        } else if (brennweite > camOb.getBrennweiteMax()) {
            System.out.printf("%s%d Überschreitet maximale Brennweite.%s%n", "[31m", brennweite, "\u001B[0m");
        } else {
            this.camOb.setBrennweite(brennweite);
            System.out.printf("%sBrennweite auf %d gesetzt.%s%n", "[92m", camOb.getBrennweite(), "\u001B[0m");
        }
    }

    public int getId() {
        return id;
    }

    public int getBrennweiteMin() {
        return camOb.getBrennweiteMin();
    }

    public int getBrennweiteMax() {
        return camOb.getBrennweiteMax();
    }

    public int getMegapixel() {
        return megapixel;
    }

    public boolean getAbdeckungOffen() {
        return camOb.getAbdeckungOffen();
    }

    public void takeLS() {
        this.tLS = true;
    }

    public void fillSDcard() {
        if ((sd.getSpeicherplatzMax() - sd.getSpeicherplatzBelegt()) > fotoSize) {
            sd.addAFoto(fotoSize);
            System.out.println("*Click*");
        } else {
            System.out.println("Ungenuegend Speicherplatz");
        }
    }

    public String getSDfill() {
        return String.format("Fotos: %d%nMaximal Speicher: %.1f%nBelegterSpeicher: %.1f",
                sd.getFotos(), sd.getSpeicherplatzMax(), sd.getSpeicherplatzBelegt());
    }

    public void attachCamOb(KameraObjektiv camOb) {
        if (!camOb.isSlotted() && !this.hasCamOb) {
            this.camOb = camOb;
            camOb.setSlotted(true);
            this.hasCamOb = true;
        } else if (camOb.isSlotted()) {
            System.out.println("Das Objektiv ist bereits verbaut.");
        } else if (this.hasCamOb) {
            System.out.println("Die Kamera hat bereits ein Objektiv.");
        }
    }

    public void slotCard(Speicherkarte sd) {
        if (!sd.isSlotted() && !this.hasSD) {
            this.sd = sd;
            sd.setSlotted(true);
            this.hasSD = true;
        } else if (sd.isSlotted()) {
            System.out.println("Die Speicherkarte ist bereits verbaut.");
        } else if (this.hasSD) {
            System.out.println("Die Kamera hat bereits eine SD.");
        }
    }

    public void abdeckungAufmachen(boolean abdeckung) {
        this.camOb.setAbdeckung(abdeckung);
    }

    public void makeAPhoto() {
        if (this.camOb == null && this.sd == null) {
            System.out.println("Bring bitte zuerst Objektiv und Speicherkarte am Apparat an.");
        } else if (this.camOb == null) {
            System.out.println("Bring bitte zuerst ein Objektiv am Apparat an.");
        } else if (this.sd == null) {
            System.out.println("Bring bitte zuerst eine Speicherkarte am Apparat an.");
        } else if (!getAbdeckungOffen()) {
            fillSDcard();
        } else if (tLS) {
            printLSDahlia();
            fillSDcard();
        } else {
            printDahlia();
            fillSDcard();
        }
    }

    public String toString() {
        return String.format("Hat %d Megapixel Auflösung. Ist ein %s Modell und wurde von %s hergestellt."
                , megapixel, model, hersteller);
    }

    private String cGR() {
        int a = rand.nextInt(255);
        int b = rand.nextInt(255);
        int c = rand.nextInt(255);
        return String.format("\u001B[%d;%d;%dm", a, b, c);
    }

    public void printDahlia() {
        System.out.printf("%s|.----------------------.|%s%n", cWBG, cReset);
        System.out.printf("%s||      %s%s#SoCringe%s%s       ||%s%n", cWBG, cReset, "\u001B[48;5;124m", cReset, cWBG, cReset);
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
        System.out.printf("%s'------------------------'%s%n%n", cWBG, cReset);
    }

    public void printLSDahlia() {
        System.out.printf("%s|.----------------------.|%s%n", cGR(), cReset);
        System.out.printf("%s||   %s%sgetToTheChoppa!%s%s    ||%s%n", cWBG, cReset, "\u001B[48;5;124m", cReset, cWBG, cReset);
        System.out.printf("%s||     .-\"````\"-.       ||%s%n", cGR(), cReset);
        System.out.printf("%s||    /  _.._    `\\     ||%s%n", cGR(), cReset);
        System.out.printf("%s||   / /`    `-.   ; . .||%s%n", cGR(), cReset);
        System.out.printf("%s||   | |__  __  \\   |   ||%s%n", cGR(), cReset);
        System.out.printf("%s||.-.| | e`/e`  |   |   ||%s%n", cGR(), cReset);
        System.out.printf("%s||   | |  |     |   |'--||%s%n", cGR(), cReset);
        System.out.printf("%s||   | |  '-    |   |   ||%s%n", cGR(), cReset);
        System.out.printf("%s||   |  \\ --'  /|   |   ||%s%n", cGR(), cReset);
        System.out.printf("%s||   |   `;---'\\|   |   ||%s%n", cGR(), cReset);
        System.out.printf("%s||   |    |     |   |   ||%s%n", cGR(), cReset);
        System.out.printf("%s||   |  .-'     |   |   ||%s%n", cGR(), cReset);
        System.out.printf("%s||'--|/`        |   |--.||%s%n", cGR(), cReset);
        System.out.printf("%s||   ;    .     ;  _.\\  ||%s%n", cGR(), cReset);
        System.out.printf("%s||    `-.;_    /.-'     ||%s%n", cGR(), cReset);
        System.out.printf("%s||         ````         ||%s%n", cGR(), cReset);
        System.out.printf("%s||jgs___________________||%s%n", cGR(), cReset);
        System.out.printf("%s'------------------------'%s%n%n", cGR(), cReset);
    }
}