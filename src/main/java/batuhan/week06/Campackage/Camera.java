package batuhan.week06.Campackage;

import batuhan.week06.Campackage.Camerapackage;

public class Camera {

    public static void main(String[] args) {
        Camerapackage cam = new Camerapackage("GalaxyS22Ultra", "Samsung");
        Camerapackage cam2 = new Camerapackage("Iphone14Pro", "Apple");
        MemoryCard mermory = new MemoryCard("Samsung", 32000);

        cam.setMemoryCard(33);



        System.out.println(mermory.getTakenFotos());
        cam.setbrennweite(33);
        cam2.setbrennweite(30);


        System.out.println(cam);



        cam2.takeFoto(2);


    }
}
