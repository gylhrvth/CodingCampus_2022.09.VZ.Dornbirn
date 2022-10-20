package milan.week06.Fotoapparat;

import milan.week06.Fotoapparat.Fotoapparat;

public class TestFotoapparat {

    public static void main(String[] args) {

        Fotoapparat fa = new Fotoapparat();
        System.out.println(fa.takePhoto());
        System.out.println(fa);
        Objektiv ob = new Objektiv();
        System.out.println(ob);
        Speicherkarte sk = new Speicherkarte();
        System.out.println(sk);
    }


}
