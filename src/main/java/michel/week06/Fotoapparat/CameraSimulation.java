package michel.week06.Fotoapparat;

public class CameraSimulation {
    public static void main(String[] args) {
        Camera f1 = new Camera("Nikon", "D6 DSLR", "Spiegelreflexkamera", 24.7);
        Camera f2 = new Camera("Canon", "EOS R3", "Spiegelreflexkamera", 31.6);
        Objectiv o1 = new Objectiv("NASA","SpaceSpy",55,55000);
        Objectiv o2 = new Objectiv("Nikon","D7500",55,95);
        MemoryCard m1 = new MemoryCard("SanDisk", "SD-Card", 512);
        MemoryCard m2 = new MemoryCard("Samsung","SD-Card",32000);
        f1.setObjektiv(o2);
        f2.setObjektiv(o1);
        f1.insertMemoryCard(m2);
        f2.insertMemoryCard(m1);

        for (int i = 0; i < 10; i++) {
            f2.takePhoto();
            f1.takePhoto();
        }

        for (int i = 0; i < 5; i++) {
            f2.takePhoto();
            f1.takePhoto();
        }

        f2.takePhoto();



        System.out.println(m1);

        System.out.println(f2);
        System.out.println(m2.getPhotos());


    }
}
