package milan.week06.Fotoapparat;

public class Fotoapparat {
    enum Mode {
        DAY_MODE(1.0), NIGHT_MODE(1.5);

        private double sizeFactor;

        Mode(double sizeFactor) {
            this.sizeFactor = sizeFactor;
        }

        double calculateSize(double originalSize) {
            return originalSize * sizeFactor;
        }
    }

    private static final int FOTO_SIZE_IN_BYTES_PER_MEGAPIXEL = 300000;
    private static final int BATTERY_CONSUMPTION_IN_MILLIAMPERE = 3;
    private String model;
    private String hersteller;
    private float megapixel;
    private Objektiv objektiv;
    private Speicherkarte memoryCard;
    private Akku battery;
    private int takenFotos;

    private Mode currentMode;


    public Fotoapparat() {
        model = "NoName";
        hersteller = "NoNameCompany";
        megapixel = 12.1f;
        takenFotos = 0;
        currentMode = Mode.DAY_MODE;
    }

    public void setModus(Mode mode) {
        this.currentMode = mode;
    }

    public Mode getCurrentMode() {
        return currentMode;
    }

    public void resetFotoCounter() {
        takenFotos = 0;
    }

    public String toString() {
        return "Hersteller: " + hersteller + "\n" +
                "aktiver Modus: " + getCurrentMode() + "\n" +
                "Model: " + model + "\n" +
                "Megapixel: " + megapixel + "\n";
    }

    public String takePhoto() throws NoMemoryLeftException, NoBatteryLeftExecption {
        long photoSize = (long) (megapixel * FOTO_SIZE_IN_BYTES_PER_MEGAPIXEL * currentMode.sizeFactor);
        if (memoryCard.getFreeMemory() < photoSize) {
            throw new NoMemoryLeftException(memoryCard.getFreeMemory());
        } else if (battery.getLeftOverCapacity() < BATTERY_CONSUMPTION_IN_MILLIAMPERE) {
            throw new NoBatteryLeftExecption(battery.getLeftOverCapacity());
        } else {
            takenFotos++;
            memoryCard.setFreeMemory(memoryCard.getFreeMemory() - photoSize);
            memoryCard.setFotoCounter(memoryCard.getFotoCounter() + 1);
            battery.setLeftOverCapacity(battery.getLeftOverCapacity() - BATTERY_CONSUMPTION_IN_MILLIAMPERE);

            return "          _____                    _____                    _____            _____                    _____          \n" +
                    "         /\\    \\                  /\\    \\                  /\\    \\          /\\    \\                  /\\    \\         \n" +
                    "        /::\\____\\                /::\\    \\                /::\\____\\        /::\\    \\                /::\\____\\        \n" +
                    "       /::::|   |                \\:::\\    \\              /:::/    /       /::::\\    \\              /::::|   |        \n" +
                    "      /:::::|   |                 \\:::\\    \\            /:::/    /       /::::::\\    \\            /:::::|   |        \n" +
                    "     /::::::|   |                  \\:::\\    \\          /:::/    /       /:::/\\:::\\    \\          /::::::|   |        \n" +
                    "    /:::/|::|   |                   \\:::\\    \\        /:::/    /       /:::/__\\:::\\    \\        /:::/|::|   |        \n" +
                    "   /:::/ |::|   |                   /::::\\    \\      /:::/    /       /::::\\   \\:::\\    \\      /:::/ |::|   |        \n" +
                    "  /:::/  |::|___|______    ____    /::::::\\    \\    /:::/    /       /::::::\\   \\:::\\    \\    /:::/  |::|   | _____  \n" +
                    " /:::/   |::::::::\\    \\  /\\   \\  /:::/\\:::\\    \\  /:::/    /       /:::/\\:::\\   \\:::\\    \\  /:::/   |::|   |/\\    \\ \n" +
                    "/:::/    |:::::::::\\____\\/::\\   \\/:::/  \\:::\\____\\/:::/____/       /:::/  \\:::\\   \\:::\\____\\/:: /    |::|   /::\\____\\\n" +
                    "\\::/    / ~~~~~/:::/    /\\:::\\  /:::/    \\::/    /\\:::\\    \\       \\::/    \\:::\\  /:::/    /\\::/    /|::|  /:::/    /\n" +
                    " \\/____/      /:::/    /  \\:::\\/:::/    / \\/____/  \\:::\\    \\       \\/____/ \\:::\\/:::/    /  \\/____/ |::| /:::/    / \n" +
                    "             /:::/    /    \\::::::/    /            \\:::\\    \\               \\::::::/    /           |::|/:::/    /  \n" +
                    "            /:::/    /      \\::::/____/              \\:::\\    \\               \\::::/    /            |::::::/    /   \n" +
                    "           /:::/    /        \\:::\\    \\               \\:::\\    \\              /:::/    /             |:::::/    /    \n" +
                    "          /:::/    /          \\:::\\    \\               \\:::\\    \\            /:::/    /              |::::/    /     \n" +
                    "         /:::/    /            \\:::\\    \\               \\:::\\    \\          /:::/    /               /:::/    /      \n" +
                    "        /:::/    /              \\:::\\____\\               \\:::\\____\\        /:::/    /               /:::/    /       \n" +
                    "        \\::/    /                \\::/    /                \\::/    /        \\::/    /                \\::/    /        \n" +
                    "         \\/____/                  \\/____/                  \\/____/          \\/____/                  \\/____/         \n" +
                    "                                                                                                                     ";

        }
    }

    public void setBattery(Akku battery) {
        this.battery = battery;
    }

    public Akku getBattery() {
        return battery;
    }

    public int getTakenFotos() {
        return takenFotos;
    }

    public void setMemoryCard(Speicherkarte memoryCard) {
        this.memoryCard = memoryCard;
    }

    public void setObjektiv(Objektiv objektiv) {
        this.objektiv = objektiv;
    }

    public Objektiv getObjektiv() {
        return objektiv;
    }

    public Speicherkarte getMemoryCard() {
        return memoryCard;
    }

    public String getModel() {
        return this.model;
    }

    public String getHersteller() {
        return this.hersteller;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public void setMegapixel(float megapixel) {
        this.megapixel = megapixel;
    }

    public float getMegapixel() {
        return megapixel;
    }
}
