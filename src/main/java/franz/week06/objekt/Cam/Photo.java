package franz.week06.objekt.Cam;

public class Photo {
    private int id;
    private int size;

    public Photo(int id, int size) {
        this.id = id;
        this.size = size;
    }

    public int getSizeinMB() {
        return size;
    }

    public String toString() {
        return "Photo:" + id;
    }

    public int getId() {
        return id;
    }
}
