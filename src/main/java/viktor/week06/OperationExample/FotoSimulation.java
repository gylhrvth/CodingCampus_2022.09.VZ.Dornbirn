package viktor.week06.OperationExample;

public class FotoSimulation {

    public static void main(String[] args) {


        Fotoapparat device1 = new Fotoapparat(10,"HR560","Sony",50);
        Memorycard mc = new Memorycard("HGRE5000","Sony",500);

        System.out.println("Your device: \n" + device1.toString());

        System.out.println(device1.takePhoto());
        double sizeOfPicture = device1.getSizeOfPicture();
        mc.savePhoto(sizeOfPicture);
        System.out.println("\n");

        System.out.println(device1.takePhoto());
        double sizeOfPicture2 = device1.getSizeOfPicture();
        mc.savePhoto(sizeOfPicture2);
        System.out.println("\n");

        System.out.println("Info to your memory card!");
        System.out.println("Taken photos in your memory card: " + mc.getTakenPhotos());
        System.out.println("Free place of your memory card (MB): " + mc.getFreeMemory());








    }
}

