package milan.week06.Fotoapparat;

public class TestFotoapparat {

    public static void main(String[] args) throws NoMemoryLeftException {

        Fotoapparat fa = new Fotoapparat();
        Objektiv ob = new Objektiv();
        Speicherkarte sk = new Speicherkarte(3000000000L);
        Akku ak = new Akku(600);
        System.out.println(sk);
        sk.setHersteller("Sandisk");
        fa.setMemoryCard(sk);
        fa.setObjektiv(ob);
        fa.setBattery(ak);
        fa.setModus(Fotoapparat.Mode.NIGHT_MODE);

        for (int i = 0; i < 1000; i++) {
            try {
                System.out.println(fa.takePhoto());
            } catch (NoMemoryLeftException exc) {
                exc.printStackTrace();
                //System.out.println(exc + " " + (exc.getLeftMemory() / 1000000) + "mb sind übrig!");
                break;
            } catch (NoBatteryLeftExecption nbe) {
                nbe.printStackTrace();
                //System.out.println("Achtung Akkustand zu niedrig!\nÜbriger Akkustand: " + nbe.getLeftBattery() + "mA");
                break;
            }
        }
        System.out.println(fa.getTakenFotos());
        System.out.println(sk);
        System.out.println(fa);
    }


}
