package gyula.week07.foto;

public class Photo {
    private int id;
    private int size; // Size in MB

    public Photo(int id, int size){
        this.id = id;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Photo " + id;
    }
}
