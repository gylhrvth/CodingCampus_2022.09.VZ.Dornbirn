package batuhan.week06.Campackage;

public class Camera {

    public static void main(String[] args) {
        Camerapackage cam = new Camerapackage("GalaxyS22Ultra", "Samsung");
        Camerapackage cam2 = new Camerapackage("Iphone14Pro", "Apple");
        MemoryCard speicher = new MemoryCard("Samsung", 32000);

        cam2.setMemoryCard(speicher);
        cam.setMemoryCard(speicher);
        cam.takeFoto();

        System.out.println(speicher.getTakenFotos());
        cam.setbrennweite(33);
        cam2.setbrennweite(30);


        System.out.println(cam);

        for (int i = 0; i < 10000; i++) {
            cam2.takeFoto();
        }


        System.out.println(speicher.getTakenFotos());
        System.out.println(speicher.getFreeMemoryInMb());
    }
}
