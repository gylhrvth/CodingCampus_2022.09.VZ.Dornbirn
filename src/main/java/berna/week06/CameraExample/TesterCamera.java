package berna.week06.CameraExample;

public class TesterCamera {
    public static void main(String[] args) {

        Camera cam = new Camera();

        System.out.println("we start with: \n");
        System.out.println(cam.toString());;

        cam.takePhoto();
        System.out.println(cam);


    }
}
