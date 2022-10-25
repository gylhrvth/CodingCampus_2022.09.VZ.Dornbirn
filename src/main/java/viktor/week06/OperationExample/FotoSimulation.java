package viktor.week06.OperationExample;

import java.util.Objects;

public class FotoSimulation {

    public static void main(String[] args) {


        Fotoapparat device1 = new Fotoapparat(10, "HR560", "Sony", 50);
        Memorycard mc = new Memorycard("HGRE5000", "Sony", 2000);
        Objektiv newObjektiv = new Objektiv();
        newObjektiv.setMp(300);
        Fotoapparat device2 = new Fotoapparat(10,"HR560","Sony",newObjektiv.getMp());

        System.out.println("Your device:\n" + device2.toString());
        System.out.println("Size of one picture (MB): " + device2.getSizeOfPicture()+"\n");

        while (true) {
            double sizeOfPicture = device2.getSizeOfPicture();
            if (mc.checkTheCapacity(sizeOfPicture)) {
                mc.savePhoto(sizeOfPicture);
                System.out.println(device2.takePhoto());
                System.out.println("\n");
            } else {
                break;
            }
        }
        System.out.println("Info to your memory card!");
        System.out.println("Size of current memory card (MB): " + mc.getSizeOfMemoryCard());
        System.out.println("Taken photos in your memory card: " + mc.getTakenPhotos());
        System.out.println("Free capacity of your memory card (MB): " + mc.getFreeMemory());

    }
}

