package martin.week06.TaskFotoapparat;

public class FotoapparatExamples {
    public static void main(String[] args) {
        Fotoapparat meinHandy = new Fotoapparat();
        Fotoapparat markusAugen = new Fotoapparat(
                10, 70, "Oculus", "Mama und Papa", 5);
        Fotoapparat tiffanysEXPhone = new Fotoapparat(
                1, 500, "DialLogosMK2", "PixelMeer", 500);
        System.out.printf("Mein Handy hat minimal %d und maximal %d Brennweite.%n",
                meinHandy.getBrennweiteMin(), meinHandy.getBrennweiteMax());
        meinHandy.setBrennweite(1);
        meinHandy.setBrennweite(10);
        meinHandy.setBrennweite(50);
        meinHandy.setBrennweite(100);
        System.out.println("Meine Handycamera wurde von " + meinHandy.getHersteller() + " Hergestellt.");
        System.out.println("Markus Augen sind ein " + markusAugen.getModel() + " Modell.");
        System.out.println("Tiffanys eXPhone hat " + tiffanysEXPhone.getMegapixel() + " Megapixel Auflösung.");
        System.out.printf("%sIch mach mal 'n Selfie!%s%n","\u001B[35;355m","\u001B[0m");
        meinHandy.makeAPhoto();
    }
}
