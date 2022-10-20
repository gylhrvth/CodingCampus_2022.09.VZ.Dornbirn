package milan.week06.Fotoapparat;

public class Fotoapparat {

    private String model;
    private String hersteller;
    private float megapixel;

    public Fotoapparat() {
        model = "NoName";
        hersteller = "NoNameCompany";
        megapixel = 0f;

    }
    public String toString(){
        return "Hersteller: " + hersteller + "\n" +
                "Model: " + model + "\n" +
                "Megapixel: " + megapixel + "\n";
    }
    public String takePhoto(){

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



    public String getModel() {
        return model;
    }

    public String getHersteller() {
        return hersteller;
    }

    public float getMegepixel() {
        return megapixel;
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
}
