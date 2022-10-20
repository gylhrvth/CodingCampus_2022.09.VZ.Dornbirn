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

        for (int i = 0; i < 1000; i++) {
            try {
                System.out.println(fa.takePhoto());
            } catch (NoMemoryLeftException exc){
                System.out.println("Fertig mit Fotos machen, ich bin klug!!! " + exc.getLeftMemory());
                break;
            } catch (NoBatteryLeftExecption nbe){
                System.out.println("Achtung Akkustand zu niedrig!\nÜbriger Akkustand: " + nbe.getLeftBattery()+ "mA");
                break;
            }
        }
        System.out.println(fa.getTakenFotos());
        System.out.println(sk);
    }


}
