package martin.week06.TaskFotoapparat;

public class FotoapparatExamples {
    public static void main(String[] args) {
        Fotoapparat meinHandy = new Fotoapparat();
        KameraObjektiv kartOffel = new KameraObjektiv(3, 11);
        Speicherkarte golfischHirn = new Speicherkarte(10, 7, 5);
        meinHandy.makeAPhoto();
        meinHandy.attachCamOb(kartOffel);
        meinHandy.makeAPhoto();
        meinHandy.slotCard(golfischHirn);

        Fotoapparat Martin = new Fotoapparat(11, "Mama und Papa", "Programmierer");
        KameraObjektiv Augen = new KameraObjektiv(19, 21);
        Speicherkarte Hirn = new Speicherkarte(-5);
        Martin.attachCamOb(Augen);
        Martin.slotCard(Hirn);

        Fotoapparat dahliasEXPhone = new Fotoapparat(500, "PixelMeer", "DialLogosMK2");
        KameraObjektiv exPhoneCam = new KameraObjektiv(1, 50);
        Speicherkarte superSD = new Speicherkarte(10000);
        dahliasEXPhone.attachCamOb(exPhoneCam);
        dahliasEXPhone.slotCard(superSD);

        System.out.printf("%nMein Handy hat minimal %d und maximal %d Brennweite.%n",
                meinHandy.getBrennweiteMin(), meinHandy.getBrennweiteMax());
        meinHandy.setBrennweite(1);
        meinHandy.setBrennweite(10);
        meinHandy.setBrennweite(50);
        meinHandy.setBrennweite(100);

        System.out.println("Der Apparat Martin: " + Martin);
        System.out.println("Dahlias eXPhone hat " + dahliasEXPhone.getMegapixel() + " Megapixel Auflösung.");
        System.out.printf("%sIch mach mal 'n Selfie!%s%n", "\u001B[35;355m", "\u001B[0m");
        meinHandy.makeAPhoto();
        meinHandy.abdeckungAufmachen(true);
        meinHandy.makeAPhoto();
        meinHandy.takeLS();
        meinHandy.makeAPhoto();
        meinHandy.abdeckungAufmachen(false);
        meinHandy.makeAPhoto();
        meinHandy.makeAPhoto();
        meinHandy.makeAPhoto();
        System.out.println(meinHandy.getSDfill());
    }
}
