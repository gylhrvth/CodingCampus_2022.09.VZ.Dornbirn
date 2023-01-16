package stefan.MultiThreaded;

public class Place implements Runnable{

private  String place;
private int plz;

    public Place(String place, int plz) {
        this.place = place;
        this.plz = plz;
    }

    @Override
    public void run() {
        System.out.println(place+plz);
    }
}
