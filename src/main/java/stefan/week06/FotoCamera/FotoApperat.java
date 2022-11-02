package stefan.week06.FotoCamera;

public class FotoApperat {
    private SpeicherKarte memory;

    private String model;
    private String hersteller;
    private int megapixel;
    private Objektiv objektiv;
    private int fotos;

    public void setMemory(SpeicherKarte memory) {
        this.memory = memory;
    }

    public FotoApperat(String hersteller, String model) {
        megapixel = 50;
        this.hersteller = hersteller;
        this.model = model;

    }

    public int getMegapixel() {
        return megapixel;
    }


//    public void insertmemory(SpeicherKarte foAp) {
//        if (memory != null) {
//            System.out.println("Legen sie eine momeroy card ein");
//        } else {
//            memory = foAp;
//        }
//    }

    public String takephoto() {


            double sizeOfFoto = megapixel * 0.3;
            if (memory.getFreeMemory() > sizeOfFoto) {
                memory.setMemory((int) (memory.getFreeMemory() - sizeOfFoto));

        }

        //Berechnen wie groß das foto ist
        //Schauen ob genügend freier speicher auf der speicherkarte vorhanden ist
        //foto auf speicherkarte speichern


        return
                ("          _____                _____                    _____                    _____                    _____                    _____          \n" +
                        "         /\\    \\              /\\    \\                  /\\    \\                  /\\    \\                  /\\    \\                  /\\    \\         \n" +
                        "        /::\\    \\            /::\\    \\                /::\\    \\                /::\\    \\                /::\\    \\                /::\\____\\        \n" +
                        "       /::::\\    \\           \\:::\\    \\              /::::\\    \\              /::::\\    \\              /::::\\    \\              /::::|   |        \n" +
                        "      /::::::\\    \\           \\:::\\    \\            /::::::\\    \\            /::::::\\    \\            /::::::\\    \\            /:::::|   |        \n" +
                        "     /:::/\\:::\\    \\           \\:::\\    \\          /:::/\\:::\\    \\          /:::/\\:::\\    \\          /:::/\\:::\\    \\          /::::::|   |        \n" +
                        "    /:::/__\\:::\\    \\           \\:::\\    \\        /:::/__\\:::\\    \\        /:::/__\\:::\\    \\        /:::/__\\:::\\    \\        /:::/|::|   |        \n" +
                        "    \\:::\\   \\:::\\    \\          /::::\\    \\      /::::\\   \\:::\\    \\      /::::\\   \\:::\\    \\      /::::\\   \\:::\\    \\      /:::/ |::|   |        \n" +
                        "  ___\\:::\\   \\:::\\    \\        /::::::\\    \\    /::::::\\   \\:::\\    \\    /::::::\\   \\:::\\    \\    /::::::\\   \\:::\\    \\    /:::/  |::|   | _____  \n" +
                        " /\\   \\:::\\   \\:::\\    \\      /:::/\\:::\\    \\  /:::/\\:::\\   \\:::\\    \\  /:::/\\:::\\   \\:::\\    \\  /:::/\\:::\\   \\:::\\    \\  /:::/   |::|   |/\\    \\ \n" +
                        "/::\\   \\:::\\   \\:::\\____\\    /:::/  \\:::\\____\\/:::/__\\:::\\   \\:::\\____\\/:::/  \\:::\\   \\:::\\____\\/:::/  \\:::\\   \\:::\\____\\/:: /    |::|   /::\\____\\\n" +
                        "\\:::\\   \\:::\\   \\::/    /   /:::/    \\::/    /\\:::\\   \\:::\\   \\::/    /\\::/    \\:::\\   \\::/    /\\::/    \\:::\\  /:::/    /\\::/    /|::|  /:::/    /\n" +
                        " \\:::\\   \\:::\\   \\/____/   /:::/    / \\/____/  \\:::\\   \\:::\\   \\/____/  \\/____/ \\:::\\   \\/____/  \\/____/ \\:::\\/:::/    /  \\/____/ |::| /:::/    / \n" +
                        "  \\:::\\   \\:::\\    \\      /:::/    /            \\:::\\   \\:::\\    \\               \\:::\\    \\               \\::::::/    /           |::|/:::/    /  \n" +
                        "   \\:::\\   \\:::\\____\\    /:::/    /              \\:::\\   \\:::\\____\\               \\:::\\____\\               \\::::/    /            |::::::/    /   \n" +
                        "    \\:::\\  /:::/    /    \\::/    /                \\:::\\   \\::/    /                \\::/    /               /:::/    /             |:::::/    /    \n" +
                        "     \\:::\\/:::/    /      \\/____/                  \\:::\\   \\/____/                  \\/____/               /:::/    /              |::::/    /     \n" +
                        "      \\::::::/    /                                 \\:::\\    \\                                           /:::/    /               /:::/    /      \n" +
                        "       \\::::/    /                                   \\:::\\____\\                                         /:::/    /               /:::/    /       \n" +
                        "        \\::/    /                                     \\::/    /                                         \\::/    /                \\::/    /        \n" +
                        "         \\/____/                                       \\/____/                                           \\/____/                  \\/____/         \n" +
                        "                                                                                                                                                  ");


    }


    public String toString() {

        return "Name des Hesteller: " + hersteller + "\nDer Model Name: " + model + "\nMegapixel: " + megapixel;
    }
}