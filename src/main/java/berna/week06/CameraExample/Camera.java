package berna.week06.CameraExample;

public class Camera {


    //attributes

    private int megapixel;
    private MemoryCard sd;
    private int lastPhotoId;

    public Camera() {
        megapixel = 10;
        sd = new MemoryCard();
        lastPhotoId = 0;
    }

    public void takePhoto() {
        lastPhotoId++;
        Photo p = new Photo(megapixel,lastPhotoId);
        sd.writePhoto(p);
    }


//        return "" +
//
//                "           /\\ /\\   \n" +
//                "          ((ovo))  \n" +
//                "          ():::()  \n" +
//                "            VVV    \n";


    @Override
    public String toString() {

        return "Your camera: " + "\n" +
                "megapixel: " + megapixel + "\n" +
                "nrPhotos taken in total: " + sd.getNrPhotosSaved() + "\n" +
                "free space left: " + sd.getMemoryFree();

    }


//    public String toString() {
//        return "Memory Card info:\n" +
//                "size: " + totalSizeOfCard + " MB \n" +
//                "space free: " + actualSpaceFree() + " MB \n";

}
