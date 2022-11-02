package berna.week06.CameraExample;

public class Photo {

    public int size;
    public int id;

    public Photo(int megaPixel, int id){
        size = megaPixel*3000; //size of ONE photo in kB
        this.id = id;
    }

    public int getSize() {
        return size;
    }
}
