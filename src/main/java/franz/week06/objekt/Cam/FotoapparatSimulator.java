package franz.week06.objekt.Cam;

import java.util.ArrayList;
import java.util.Vector;

public class FotoapparatSimulator {

    public static void main(String[] args) {
        Fotoapparat f1 = new Fotoapparat("EX Phone", 10);
        Fotoapparat f2 = new Fotoapparat("Iphone X", 9);

        Memory m1 = new Memory("Sony 500", 30);
        System.out.println(f1.takePhoto() ? " Foto konnte gespeichert werden" : " Ups nicht geklappt");
        f1.insertMemory(m1);
        for (int i = 0; i < 9; i++) {
            System.out.println(f1.takePhoto() ? " Foto konnte gespeichert werden" : " Ups nicht geklappt");
        }
        System.out.println(f1.getTotelPhotoCreatedbyThisCamera());
        Memory m2 = f1.removeMemoryCard();

        f2.insertMemory(m2);
        System.out.println("Auf Memory sind wieviele Fotos? " + f2.photoCountOnMemory());
        System.out.println("Wieviele fotos wurden mit f2 gemacht? " + f2.getTotelPhotoCreatedbyThisCamera());
        System.out.println("GEt fre Cap " + f2.getFreeCapacity());
        f2.takePhoto();
        Memory m3 = f2.removeMemoryCard();
        System.out.println(m3.getPhotos().size());

    }
}

