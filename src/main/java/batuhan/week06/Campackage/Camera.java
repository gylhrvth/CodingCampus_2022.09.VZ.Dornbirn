package batuhan.week06.Campackage;

public class Camera {

    public static void main(String[] args) {
        Camerapackage samsung = new Camerapackage("Galaxy S22Ultra", "Samsung");
        Camerapackage apple = new Camerapackage("Iphone 14Pro", "Apple");
        CameraLens objektiv = new CameraLens(30,50);
        MemoryCard speicher = new MemoryCard("Samsung", 32000);
        MemoryCard speicher2 = new MemoryCard("Iphone", 64000);

        apple.setMemoryCard(speicher2);
        samsung.setMemoryCard(speicher);
        apple.takeFoto();



        samsung.setMegapixel(108);
        apple.setMegapixel(48);


        System.out.println(apple);

        for (int i = 0; i < 100; i++) {
            apple.takeFoto();
        }


        System.out.println("Es wurden "+speicher2.getTakenFotos()+" Fotos gemacht");
        System.out.println("Es sind noch "+speicher2.getFreeMemoryInMb()+"MB frei");
    }
}
